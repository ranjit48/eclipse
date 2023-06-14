package testing_program;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.MemoryImageSource;
import java.awt.image.PixelGrabber;
import java.io.*;
import java.util.ArrayList;

public class ImagePiexl {

    public static void main(String[] args) {
        try {
            System.out.println("Processing the image...");

            // Upload the image
            BufferedImage image = ImageIO.read(new File("C:\\Users\\Administrator\\Desktop\\download.png"));
            int width = image.getWidth();
            int height = image.getHeight();
            int[] pixels = new int[width * height];

            // Retrieve pixel info and store in 'pixels' variable
            PixelGrabber pgb = new PixelGrabber(image, 0, 0, width, height, pixels, 0, width);
            pgb.grabPixels();

            // Write pixels to CSV
            writeTextFile("C:\\Users\\Administrator\\Desktop\\raw.txt", pixels, width);

            // It's supposed that user modifies pixels file here
            System.out.println("Done! Cast your spells with the text file and press Enter...");
            System.in.read();

            // Read pixels from CSV
            int[] parsedPixels = readTextFile("C:\\Users\\Administrator\\Desktop\\raw.txt", width, height);

            // Convert pixels to image and save
            textToImage("C:\\Users\\Administrator\\Desktop\\download.png", width, height, parsedPixels);

        } catch (Exception exc) {
            System.out.println("Interrupted: " + exc.getMessage());
        }
    }

    private static void writeTextFile(String path, int[] data, int width) throws IOException {
        FileWriter f = new FileWriter(path);
        // Write pixel info to file, comma separated
        for(int i = 0; i < data.length; i++) {
            String s = Integer.toString(data[i]);
            f.write(s + ", ");
            if (i % width == 0) f.write(System.lineSeparator());
        }
        f.close();
    }

    private static int[] readTextFile(String path, int width, int height) throws IOException {
        System.out.println("Processing text file...");
        BufferedReader csv = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\raw.txt"));
        int[] data = new int[width * height];

        // Retrieves array of pixels as strings
        String[] stringData = parseCSV(csv);

        // Converts array of pixels to ints
        for(int i = 0; i < stringData.length; i++) {
            String num = stringData[i];
            data[i] = Integer.parseInt(num.trim());
        }
        return data;
    }

    private static String[] parseCSV(BufferedReader csv) throws IOException {
        ArrayList<String> fileData = new ArrayList<>();
        String row;

        // Fulfills 'fileData' with list of rows
        while ((row = csv.readLine()) != null) fileData.add(row);

        // Joins 'fileData' values into single 'joinedRows' string
        StringBuilder joinedRows = new StringBuilder();
        for(String line : fileData) joinedRows.append(line);

        // Splits 'joinedRows' by comma and returns array of pixels
        return joinedRows.toString().split(", ");
    }

    private static void textToImage(String path, int width, int height, int[] data) throws IOException {
        MemoryImageSource mis = new MemoryImageSource(width, height, data, 0, width);
        Image im = Toolkit.getDefaultToolkit().createImage(mis);

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        bufferedImage.getGraphics().drawImage(im, 0, 0, null);
        ImageIO.write(bufferedImage, "jpg", new File(path));
        System.out.println("Done! Check the result");
    }
}
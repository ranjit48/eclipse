import javax.swing.JFrame;
import java.awt.Color;

public class AppletMain {

	public static void main(String[] args) {
		
		JFrame obj = new JFrame();
		Gameplay gameplay= new Gameplay();
		
		obj.setBounds(10,10,905,700);
		obj.setBackground(Color.DARK_GRAY);;
		obj.setResizable(false);
		obj.setLayout(null);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);
	}

}

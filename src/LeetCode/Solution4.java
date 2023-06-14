package LeetCode;

import java.util.*;

public class Solution4 {

	public static int equalPairs(int[][] grid) {
		List<String> rowWise = new ArrayList<String>();
		List<String> colWise = new ArrayList<String>();

		for (int i = 0; i < grid.length; i++) {
			String temp = "";
			for (int j = 0; j < grid.length; j++) {
				temp += grid[i][j];
				// System.out.print(grid[i][j]);

			}
			colWise.add(temp);
			// System.out.println();

		}
		for (int j = 0; j < grid.length; j++) {
			for (int i = 0; i < grid.length; i++) {
				String s = "";
				int t = j;
				while (j < grid.length) {
					// System.out.print(grid[j][i]);
					// System.out.print(" " +j + " " + i + " ");
					s += grid[j][i];
					j++;
				}
				j = t;
				// System.out.println(s);
				rowWise.add(s);
			}
			break;
		}
		// System.out.println(colWise);
		// System.out.println(rowWise);
		//System.out.println(rowWise.contains(colWise.get(colWise.size() - 1)));
		// System.out.println((colWise.get(colWise.size()-1)).length());
		int result = 0;
		for (int i = 0; i < colWise.size(); i++) {
			if (rowWise.contains(colWise.get(i)) == true) {
				// System.out.println(colWise.get(i));

				result++;
			}
		}
		int result1 = 0;
		for (int i = 0; i < rowWise.size(); i++) {
			if (colWise.contains(rowWise.get(i)) == true) {
				// System.out.println(rowWise.get(i));

				result1++;
			}
		}
		if (result > result1) {
			
			return result;
		}
		if(result == result1 && result > 1 && result1 > 1) {
			 return result + result1;
		}
		else{
	    	
	    	return result1;
	    }
			
	}

	public static void main(String[] args) {
		int[][] grid = { {3,2,1}, {1,7,6},{2,7,7}};
		System.out.println(equalPairs(grid));

	}

}

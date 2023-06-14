package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	public void checkPlaindrom(String string) {
		
	}

	public static void main(String[] args) throws java.lang.Exception {
//		try {
//			System.setIn(new FileInputStream("input.txt"));
//			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
//
//		} catch (Exception e) {
//			System.err.println("Error");
//		}
 //ex.. gggggg   -> 0 -> 6/2=3 
		FastReader fs = new FastReader();
		int test_case = fs.nextInt();
		while(test_case-->0) {
			String string = fs.nextLine();
			if(string.length() % 2 == 0) {
				String first_hub = string.substring(0,string.length()/2);
				String second_hub = string.substring(string.length()/2-1,string.length()-1);
				//System.out.println(first_hub + "  " +second_hub);
				if(first_hub.equals(second_hub)) {
					 System.out.println("NO");
					 
				}else {
					System.out.println("YES");
				}
				 
			}else {
				 
				String first_hub = string.substring(0,string.length()/2);
				//System.out.println(first_hub);
				String second_hub = string.substring(string.length()/2+1 , string.length());
			//	System.out.println(second_hub);
			     if(first_hub.equals(second_hub)) {
			    	 System.out.println("NO");
			     }else {
			    	 System.out.println("YES");
			    	 
			     }
			   
			    
			}
			 
		}
	   
		

	}
}

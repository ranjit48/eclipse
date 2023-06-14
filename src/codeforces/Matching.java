package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Matching {
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

	public static void main(String[] args) {
		FastReader fs = new FastReader();
		int T = fs.nextInt();
		while(T-->0) {
		 String s = fs.nextLine();
		 char[] array = s.toCharArray();
		 int mul = 1;
		 for(int i=0;i<array.length;i++) {
			  if(i == 0) {
				   if(array[i] == '0') {
					    mul*= 0;
				   }
				   if(array[i] == '?') {
					   mul*= 9;
				   }
				   if(array[i] > 0 || array[i] <= 9) {
					   mul*= 1;
				   }
			  }
			  else {
				   if(array[i] == '?') {
					    mul*=10;
				   }else {
					    mul*=1;
				   }
			  }
		 }
		 System.out.println(mul);
		 
		}

	}

}

package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BlankSpace {
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
		var testCase = fs.nextInt();
		while(testCase -->0) {
			 
			int sizeofArray = fs.nextInt();
			List<Integer>binaryArray = new ArrayList<Integer>();
			for(int i = 0;i<sizeofArray;i++) {
				binaryArray.add(fs.nextInt());
			}
			var max = 0;
			var count = 0;
			for(int i = 0;i<binaryArray.size();i++) {
				if(binaryArray.get(i) == 0) {
					count++;
					if(i == binaryArray.size()-1) {
						
						if(max < count) {
							max = count;
						}
					}
					
				}else {
					if(max < count) {
						 max = count;
					}
					count = 0;
					continue;
				}
				
		}
		System.out.println(max);
		    
	   }
	   
		
		
	}
}

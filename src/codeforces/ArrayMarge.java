package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// The problem name is Array merging in codeforces.
public class ArrayMarge {
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

	public static void main(String[] args) throws java.lang.Exception {
//		
		FastReader fs = new FastReader();
		int test_case = fs.nextInt();
		while (test_case-- > 0) {
			List<Integer> a = new ArrayList<Integer>();
			List<Integer> b = new ArrayList<Integer>();
			List<Integer> c = new ArrayList<Integer>();
			List<Integer> unique = new ArrayList<>();
		    int n = fs.nextInt();
		    for(int i = 0;i<n;i++) {
		    	 a.add(fs.nextInt());
		    	 
		    }
		    for(int i = 0;i<n;i++) {
		    	b.add(fs.nextInt());
		    	
		    }
		    for(int i = 0;i<a.size();i++) {
		        c.add(a.get(i));
		    }
		    for(int i = 0;i<a.size();i++) {
		    	c.add(b.get(i));
		    }
		    
		    Collections.sort(c);
		    for(int ite : c) {
		    	 if(unique.contains(ite) != true) {
		    		  unique.add(ite);
		    	 }else
		    	 {
		    		 continue;
		    	 }
		    }
		    int max = 0;
		   for(int i = 0;i<unique.size();i++) {
			      int temp = 0;
			   for(int j = 0;j<c.size();j++) {
				    if(unique.get(i) == c.get(j)) {
				    	 temp++;
				    }
				    if(temp > max ) {
				    	max = temp;
				    }
			   }
			   
			   
		   }
		   System.out.println(max);
		   
		    
		}

	}

}

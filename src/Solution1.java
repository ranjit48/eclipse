import java.util.*;
public class Solution1 {
	public static void main(String[] args) {
	   try (Scanner fs = new Scanner(System.in)) {
		int T = fs.nextInt();
		   while(T-->0){
		      fs.nextInt();
		        int addi = fs.nextInt();
		        long n  = fs.nextLong();
		        int n_length = (int)Math.log10(n) + 1;
		       List<Integer> list = new ArrayList<>(n_length+1);
		       long max_value = 0;
		       while(n >0){
		            list.add((int)n % 10);
		             n = n /10;
		       }
		      Collections.reverse(list);
		     // System.out.println(list);
 //            System.out.println(list.size());
		         list.add(addi);
		        // System.out.println(list);
		  for(int i = list.size()-1;i>=1;i--){
		                 int tpm_1 = list.get(i);   // 765434 -> 4
		                 int tpm = list.get(i-1);  // 765434 -> 3
		                 list.set(i ,tpm );
		                 list.set(i-1 , tpm_1);
		              //  System.out.println(list);
		                 long addition = 0;
		                 int expo = 0;
		                 int base = 10;
		                // int add = (int) Math.pow();
		                 for(int j = list.size()-1;j>=0;j--){
		                               
		                         addition += (int)Math.pow(base , expo) * list.get(j);
		                         if(max_value < addition){
		                                  max_value = addition;
		                         }
		                             expo++;
		                             
		                         
		                 }
		            //     System.out.println(addition);
		                 
		                 
		           
		                       }
		    
		         System.out.println(max_value);       
		}
	}
}
}
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		int m = fs.nextInt();
		List<Integer> specialFriends = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
                specialFriends.add(fs.nextInt());
		}
		List<Integer> who = new ArrayList<Integer>();
		List<Integer> popularity = new ArrayList<Integer>();
		List<String> content = new ArrayList<String>();
		for (int i = 0; i < m; i++) {
		  who.add(fs.nextInt());
		  popularity.add(fs.nextInt());
		  content.add(fs.nextLine());
		 
          
		}
//		System.out.println(specialFriends);
//		System.out.println(who);
//		System.out.println(popularity);
//		System.out.println(content);
		List<String> special = new ArrayList<String>();
		List<Integer> special_int = new ArrayList<Integer>();
		List<String> nonSpecial= new ArrayList<String>();
		List<Integer> nonSpecial_int= new ArrayList<Integer>();
		int count = 0;
		for(int x : who) {
			 if(specialFriends.contains(x)) {
				  special_int.add(popularity.get(count));
				  special.add(content.get(count));
			 }else {
				 nonSpecial_int.add(popularity.get(count));
				 nonSpecial.add(content.get(count));
				 
			 }
			 count++;
		}
//		System.out.println(special);
//		System.out.println(special_int);
//		System.out.println(nonSpecial);
//		System.out.println(nonSpecial_int);
		for(int j = 0;j<special_int.size();j++) {
			for(int k = 0;k<special_int.size()-1;k++) {
				if(special_int.get(k)< special_int.get(k+1)) {
					
					int temp = special_int.get(k+1);
					String temp1 = special.get(k+1);
					special_int.set(k+1, special_int.get(k));
					special.set(k+1,special.get(k));
					special_int.set(k, temp);
					special.set(k, temp1);
					
					
					
					
				}
			}
		}
	//System.out.println(special_int);
	//System.out.println(special);
	for(int j = 0;j<nonSpecial_int.size();j++) {
		for(int k = 0;k<nonSpecial_int.size()-1;k++) {
			if(special_int.get(k)< special_int.get(k+1)) {
				
				int temp = nonSpecial_int.get(k+1);
				String temp1 = nonSpecial.get(k+1);
				special_int.set(k+1, nonSpecial_int.get(k));
				special.set(k+1,nonSpecial.get(k));
				special_int.set(k, temp);
				special.set(k, temp1);
				
				
				
				
			}
		}
	}
	//System.out.println(nonSpecial_int);
	//System.out.println(nonSpecial);
	for(String string:special) {
		System.out.println(string);
	}for(String string1:nonSpecial) {
		System.out.println(string1);
	}

	}

}

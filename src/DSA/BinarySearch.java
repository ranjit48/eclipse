package DSA;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
 public static void main(String[] args) {
	 Integer[] array = {1, 4, 6, 23, 33, 22, 29, 0, 5};
	 System.out.println("Enter the number for search");
	 var search = 23;
	 Arrays.sort(array);
	 System.out.println(Arrays.toString(array));
	System.out.println("The index is " +binarySearch(array,search));

}

private static int binarySearch(Integer[] array , int search ) {
	int left = 0, right = array.length-1;
	while(left <= right) {
		 int mid = (left + right)/ 2;
		 if(array[mid] == search) {
			 return mid;
		 }
		 if(array[mid] < search) {
			  left = mid + 1;
			  System.out.println("left " +array[left]);
		 }
		 else {
			  right = mid - 1;
			  System.out.println("right "+ array[right]);
		 }
		 
	}
        
	
	return -1;
}
}

package LeetCode;

import java.util.*;
import java.util.Map.Entry;

public class Solution3 {
	public static int[] topKFrequent(int[] nums, int k) {
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new TreeSet<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			var temp = Collections.frequency(list, key);
			map.put(key, temp);

		}
		//System.out.println("before " + map);
		List<Entry<Integer, Integer>> nlist = new ArrayList<>(map.entrySet());
		//map.clear();
		nlist.sort(Entry.comparingByValue(Comparator.reverseOrder()));
		//System.out.println(nlist);

		int[] output = new int[k];
		int index = 0;
			 for(Map.Entry<Integer, Integer> entry : nlist) {
				 output[index] = entry.getKey();
				 index++;
				 if(index == k) {
					 break;
				 }
				 
			 }
			list.clear();
			set.clear();
			map.clear();
		

		return output;

	}

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		int k = 2;
		int[] result = topKFrequent(nums, k);
		System.out.println(Arrays.toString(result));

	}
}

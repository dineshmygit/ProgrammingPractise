package dpworld;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class SortNumbers {

	@Test
	public void test1() {
		int[] nums = { 2, 4, 8, 6, 12, -2 };
		toSortNumbers_FromAnanda(nums);
	}

	@Test
	public void test2() {
		int[] nums = { 6, -5, 0, 6, 14, 7 };
		toSortNumbers_FromAnanda(nums);
	}

	private void toSortNumbers_FromAnanda(int[] nums) {
		//-2 2 4 6 8 12
		Set<Integer> set=new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		List<Integer> ls=new LinkedList<>();
		ls.addAll(set);
		int[] arr=new int[ls.size()];
		for (int i = 0; i < ls.size(); i++) {
			arr[i]=ls.get(i);
		}

		int[] result=new int[nums.length];
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(nums[i]==arr[j]) {
					if(j==arr.length-1) {
						result[count++]=arr[j];
						break;
					}else {						
						result[count++]=arr[j+1];
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(result));	
	}
	private int[] toSortNumbers_FromAnanda1(int[] nums) {
		int[] out = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] > nums[i] && min > nums[j] && i != j) {
					out[i] = nums[j];
					min = nums[j];
				}
			}
			if (out[i] == 0)
				out[i] = nums[i];
		}
		System.out.println(Arrays.toString(out));
		return out;
	}
}
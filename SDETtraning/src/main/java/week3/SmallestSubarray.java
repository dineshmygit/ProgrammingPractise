package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class SmallestSubarray {
	@Test
	public void test1() {
		int[] nums= {2,1,3};
		int k=4;
		findingSmallestSubarray(nums,k);
	}
	@Test
	public void test2() {
		int[] nums= {3,3,5,5};
		int k=7;
		findingSmallestSubarray(nums,k);

	}
	
	private void findingSmallestSubarray(int[] nums, int k) {
		int sum=0,smallest=0;
		List<Integer>ls=new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			sum=0;
			for (int j = i; j < nums.length; j++) {
				sum+=nums[j];
				ls.add(sum);
			}
		}
		Collections.sort(ls);
		smallest=ls.get(k-1);
		System.out.println(smallest);
	}
}

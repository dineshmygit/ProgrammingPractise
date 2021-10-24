package dpworld;

import java.util.Arrays;

import org.junit.Test;

public class LongestSubsequence {
	@Test
	public void test1() {
		int[] nums = {4,5,6,21,22,23,24};
		findSubsequence(nums);

	}

	private void findSubsequence(int[] nums) {
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int count=1,max=0,start=nums[0];
		for (int i = 0; i < nums.length-1; i++) {
			if(start+1==nums[i]) {
				count++;
				max=Math.max(max, count);
			}else {
				count=1;
			}
		}
		System.out.println(max);
	}
}
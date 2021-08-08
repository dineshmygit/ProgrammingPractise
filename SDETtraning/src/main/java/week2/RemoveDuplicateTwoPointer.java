package week2;

import java.util.Arrays;

import org.junit.Test;

public class RemoveDuplicateTwoPointer {

	@Test
	public void test1() {
		int[] nums = {1,1,1,2,2,2,3};
		removeMultipleDuplicates(nums);
	}
	public void test2() {
		int[] nums = {0,0,1,1,1,1,2,3,3};
		removeMultipleDuplicates(nums);

	}
	private void removeMultipleDuplicates(int[] nums) {
		int left=0, right=1,size=nums.length-1,returnSize=nums.length;
		while(right<size) {
			if(nums[left]==nums[right] && nums[left]==nums[right+1]) {
				removeDuplicateTwoPointer(nums,right+1,size);
				returnSize--;
			}else {
			   	left++;
				right++;
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(returnSize);

	}
	public int[] removeDuplicateTwoPointer(int[] nums,int index,int size) {
		for(int i=index;i<size;i++) {
			nums[i]=nums[i+1];
		}
		return nums;
	}
}

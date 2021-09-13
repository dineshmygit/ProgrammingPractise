package leetcode2pointer;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class SortArrayByParity {
	//905. Sort Array By Parity
	/*Comments*/
	@Test
	public void test1() {
		int[] nums= {3,1,2,4};
		//findParityWithoutSort(nums);
		//Assert.assertEquals(findParity(nums), new int[] {2,4,3,1});
		Assert.assertTrue(Arrays.equals(findParity(nums), new int[] {2,4,3,1}));
	}

	@Test
	public void test2() {
		int[] nums= {1,1,1,1};
		findParity(nums);
	}

	@Test
	public void test3() {
		int[] nums= {2,4,6,6};
		findParity(nums);
	}
	/*iterate through array
	 * keep two pointers left=0 and right=1
	 * if left and right is even move two pointers
	 * if left and right are hard move right and find even and replace
	 * then move left++ and right++
	 * if left is odd and right is even, swift right to left , left to right
	 * if left is even and right is hard move left++ and right++
	 * 1 2 3 4
	 * */
	private int[] findParity(int[] nums) {
		int left=0,right=1,tmp=0;
		Arrays.sort(nums);
			while(right<nums.length) {
			if(nums[left]%2==0 && nums[right]%2==0) {
				left++;
				right++;
			}else if(nums[left]%2!=0 && nums[right]%2!=0){
				right++;
			}else if(nums[left]%2!=0 && nums[right]%2==0) {
				tmp=nums[right];
				nums[right]=nums[left];
				nums[left]=tmp;
				left++;
				right++;
			}else {
				left++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
	private int[] findParityWithoutSort(int[] nums) {
		int left=0,right=nums.length-1,tmp=0;
		while(left<=right) {
			if(nums[left]%2!=0 && nums[right]%2!=0) {
				right--;
			}else if(nums[left]%2==0 && nums[right]%2==0) {
				left++;
			}else if(nums[left]%2==0 && nums[right]%2!=0) {
				left++;
				right--;
			}else {
				tmp=nums[right];
				nums[right]=nums[left];
				nums[left]=tmp;
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
		
	}
}

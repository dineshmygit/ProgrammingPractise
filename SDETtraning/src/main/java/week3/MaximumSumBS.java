package week3;

import java.util.Arrays;

import org.junit.Test;

public class MaximumSumBS {
	@Test
	public void test1() {
		int[] nums= {34,23,1,24,75,33,54,8};
		int	k = 60;
		//Output: 58
		findingMaximumSumUsingBS(nums,k);
	}
	@Test
	public void test2() {
		int[] nums= {34,23,1,24,75,33,54,8};
		int	k = 15;
		//Output: 9
		findingMaximumSumUsingBS(nums,k);
	}
	@Test
	public void test3() {
		int[] nums= {10,20,30};
		int	k = 15;
		//Output: -1
		findingMaximumSumUsingBS(nums,k);
	}
	/*Iterate through array
	 * sort the array
	 * find the mid element and divide it by 2
	 * check whether the found element is lesser or greater than k
	 * sum mid+k/2 , check with mid < or > k
	 * if lesser get current sum and compare with k 
	 * if not equal to reduce high
	 * get the max sum
	 * * if greater than current sum and compare with k 
	 * if not equal to reduce mid
	 * get the max sum
	 * */
	private int findingMaximumSumUsingBS(int[] nums, int k) {
		int low=0,high=nums.length-1,currentMax=0,max=0;
		Arrays.sort(nums);
		int refVal=k/2;
		int mid=(low+high)/2;
		if((refVal+nums[mid])<k) {
			while(mid<high) {
				currentMax=nums[mid]+nums[high];
				if(currentMax!=k) {
					high--;
					if(currentMax<k)
						max=Math.max(currentMax, max);
				}
			}
		}else if((refVal+nums[mid])>k) {
			while(mid>low) {
				currentMax=nums[low]+nums[mid];
				if(currentMax!=k) {
					mid--;
					if(currentMax<k)
						max=currentMax;
				}
			}
		}
		System.out.println(max);
		return max;
	}
}

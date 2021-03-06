    package week5;

import java.util.ArrayDeque;

/*With the given int[],add each element in a Queue
 * Get the min and max value from the queue
 * subsract and compare the result with the limit
 * If lesser then add element in new queue
 * if not reseting the queue
 * In the new array add the lesser than limit elements
 * return the size of the new array
 * 
 * */
public class LongestContinousSubarry {
	/*
	 * Two Pointer Algorithm - Equi Directional
	 * Find the min and max for slow and fast pointer values
	 * if the abs difference is the less than or equal to limit -> find the longest and move right
	 * else reset the min and max with the right value -> left 
	 * 
	 */
	
	private int longestSubArray(int[] nums, int limit) {
		
		int left = 0, right = 0;
		int longest = Integer.MIN_VALUE, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		while(left < nums.length && right < nums.length) {
			
			// find the min and max for the absolute difference
			min = Math.min(min, Math.min(nums[left], nums[right]));
			max = Math.max(max, Math.max(nums[left], nums[right]));
			
			// Check with the limit
			if(Math.abs(max-min) <= limit) {
				longest = Math.max(longest, right-left+1);
				right++;
			} else {
				right = ++left;
				min = nums[left];
				max = nums[left];
			}
			
		}
		return longest;
	}
}

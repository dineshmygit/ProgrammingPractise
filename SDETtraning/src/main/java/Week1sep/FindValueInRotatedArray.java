package Week1sep;

import org.junit.Test;

public class FindValueInRotatedArray {
	/*Comments*/
	@Test
	public void test1() {
		int[] nums = {4,5,6,7,0,1,2};
		int target = 0;
		findValue(nums,target);
	}
	@Test
	public void test2() {
		int[] nums = {3,1};
		int target = 1;
		findValue(nums,target);
	}

	private int findValue(int[] nums, int target) {
		int left=0,right=nums.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(nums[mid]==target) {
				System.out.println(mid);
				return mid;				
			}else if(nums[mid]>nums[left]) {
				{
					if(target>=nums[left] &&target<nums[mid]) {
						right=mid-1;
					}else {
						left=mid+1;
					}
				}
			}else {
				if(target<=nums[right] &&nums[mid]>target) {
					left=mid+1;
				}else {
					right=mid-1;
				}
			}
		}
		return -1;
	}
}

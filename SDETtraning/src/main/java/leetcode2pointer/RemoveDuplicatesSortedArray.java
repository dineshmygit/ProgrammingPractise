package leetcode2pointer;

import org.junit.Test;

public class RemoveDuplicatesSortedArray {
	/*Comments
	 * 26. Remove Duplicates from Sorted Array
	 * */
	@Test
	public void test1() {
		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		int lengthResult=removeDuplicates(nums);
	}
	@Test
	public void test2() {
		int[] nums= {1,1,2};
		int lengthResult=removeDuplicates(nums);
	}

	private int removeDuplicates(int[] nums) {
		int first=0,second=1;  
		int count1=0,count2=1;
		while(second<nums.length) {
			if(nums[first]!=nums[second]&&nums[first]<nums[second]) {
				nums[count1++]=nums[first];
				nums[count2++]=nums[second];
				first++;
				second=first+1;
			}else {
				second++;
			}
		}
		return count2;
	}
	private int toRemoveDuplicatesFromSortedArray(int[] nums) {
		int left=0,right=1,count=1,i=1;
        if(nums.length==0) return 0;
        else if(nums.length>0){
            nums[0] = nums[left];
            while(right<nums.length) {
                if(nums[left]!=nums[right]) {
                    nums[i++] = nums[right];
                    left++;
                    count++;
                }
                right++;
            }
        }
		return count;
	}
}

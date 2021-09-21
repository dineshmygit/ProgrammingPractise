package leetcode2pointer;

import org.junit.Test;

public class RemoveElement {
	//27. Remove Element
	/*Comments*/
	@Test
	public void test1() {
		int[] nums= {3,2,2,3};
		int val=3;
		int result=removeKElements(nums,val);
	}


	@Test
	public void test2() {

	}

	@Test
	public void test3() {

	}
	private int removeKElements(int[] nums, int val) {
		int first=0,second=1,count=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==val) count++;
		}
		System.out.println(count);
		second=nums.length-count;
		while(first<nums.length-count) {
			if(nums[first]==val) {
				if(nums[second]!=val) {					
				nums[first++]=nums[second++];
				}else {
					second++;
				}	
			}else first++;
		}
		return first;
	}
	private int toRemoveElement(int[] nums, int k) {
		int index=0,count = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=k) {
				nums[index++] = nums[i];
				count++;
			}
		}
		return count;
	}

}

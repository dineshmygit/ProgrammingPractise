package week7sep;

import org.junit.Test;

public class SignOfTheProductAfAnArray {
	/*Comments
	 * 1822. Sign of the Product of an Array
	 * */
	@Test
	public void test1() {
		int[] nums= {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
		findProduct(nums);
	}

	//@Test
	public void test2() {
		int[] nums= {-1,-2,-3,-4,3,2,1};
		findProduct(nums);
	}

	//@Test
	public void test3() {
		int[] nums= {-1,-2,-3,-4,3,2,1};
		findProduct(nums);
	}
	/*
	 * input int[]
	 * output int
	 * 
	 * */
	private int findProduct(int[] nums) {
		int result=1;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) return 0;
			else if(nums[i]<0) nums[i]=-1;
			else nums[i]=1;
			result*=nums[i];
		}
		if(result==1) return 1;
		else
		return -1;
	}
}

package week2sep;

import org.junit.Test;

public class SignOfTheProductAfAnArray {
	/*Comments
	 * 1822. Sign of the Product of an Array
	 * */
	@Test
	public void test1() {
		int[] nums= {1,5,0,2,-3};
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
		int resultOne=0,resultTwo=0;
		for (int i = 0; i < nums.length; i++) {
			resultOne=nums[i];
			for (int j = 0; j < nums.length; j++) {
				resultTwo+=nums[i]*nums[j];
			}	
		}
		if(resultTwo==0) {
		return 0;
		}else if(resultTwo>0) {
		return 1;
		}else {
		return -1;
		}
	}
}

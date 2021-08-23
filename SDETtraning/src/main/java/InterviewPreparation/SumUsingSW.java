package InterviewPreparation;

import org.junit.Test;

public class SumUsingSW {
	/*Comments
	 * input:[1,4,20,3,10,5]
	 * return true, false
	 * 
	 * 
	 * */
	@Test
	public void test1() {
		int[] data= {1,4,20,3,10,5};
		int result=15;
		findSum(data,result);
	}

	@Test
	public void test2() {
		int[] data= {5,5,5};
		int result=25;
		findSum(data,result);
	}

	@Test
	public void test3() {
		int[] data= {25};
		int result=25;
		findSum(data,result);
	}

	/*
	 * constrain SW
	 * keep right left 
	 * iterate through array 
	 * get the sum and store in max
	 * iterate from 1 index and keep moving until sum if found
	 * if found return true
	 * if not return false
	 * if sum is found break
	 *   */
	private boolean findSum(int[] data, int result) {
		int initSum=0,maxSum=0;
		for (int i = 0; i < data.length; i++) {
			initSum+=data[i];
		}
		maxSum=initSum;
		if(maxSum==result) {
			return true;
		}else {
			for (int i = 1; i <= data.length; i++) {
				initSum=initSum-data[i-1];
				if(initSum==result) {
					return true;
				}else {
					continue;
				}
			}
			return false;
		}
	}
}

package slidingwindowprograms;

import org.junit.Test;

public class LargestSumInAnArray {

	/*Comments*/
	@Test
	public void test1() {
		int[] data= {-2, -3, 4, -1, -2, 1, 5, -3};
		findLargestSumKAFull(data);
	}
	@Test
	public void test2() {
		int[] data= {1,-5,2,-3,7,1};
		findLargestSumKAFull(data);
	}
	@Test
	public void test3() {
		int[] data= {1,7,4,12,-13,1};
		int k=15;
		findLargestSumBFK(data,k);
	}

	/*Kandanes Algorithm
	 * Time complexity : O(n)
	 * Space complexity: O(n)
	 * */
	private void findLargestSumKA(int[] data) {
		//Does not work for the edge case full negative number
		int current_sum=0,max_sum=0;
		for (int i = 0; i < data.length; i++) {
			current_sum=current_sum+data[i];
			if(current_sum>0)
				max_sum=Math.max(max_sum, current_sum);
			else 
				current_sum=0;
		}
		System.out.println(max_sum);
	}
	private void findLargestSumKAFull(int[] data) {
		//Does not work for the edge case full negative number
		//1,-5,2,-3,7,1
		int current_sum=data[0],max_sum=data[0];
    		for (int i = 1; i < data.length; i++) {
			current_sum=Math.max(data[i], current_sum+data[i]);
			max_sum=Math.max(max_sum, current_sum);
		}
		System.out.println(max_sum);
	}

	/*Brute force Algorithm
	 * Time complexity : O(n^2)
	 * Space complexity: O(n^2)
	 * */
	private void findLargestSumBF(int[] data) {
		int current_sum=0,max_sum=Integer.MIN_VALUE;
		for (int i = 0; i < data.length; i++) {
			current_sum=data[i];
			for (int j = i+1; j < data.length; j++) {
				current_sum+=data[j];
				if(max_sum<current_sum) max_sum=current_sum;
			}
		}
		System.out.println(max_sum);
	}
	
	private void findLargestSumBFK(int[] data,int k) {
		int current_sum=0,max_sum=Integer.MIN_VALUE;
		for (int i = 0; i < data.length; i++) {
			current_sum=data[i];
			for (int j = i+1; j < data.length; j++) {
				current_sum+=data[j];
				if(max_sum<current_sum && current_sum<k) max_sum=current_sum;
			}
		}
		System.out.println(max_sum);
	}
}

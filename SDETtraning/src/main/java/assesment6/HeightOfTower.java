package assesment6;

import java.util.Arrays;

import org.junit.Test;

public class HeightOfTower {

	/*Comments*/
	@Test
	public void test1() {
		int[] arr= {1,15,10};
		int k=6;
		findDifferenceHeight(arr,k);
	}

	@Test
	public void test2() {
		int[] arr= {1,5,15,10};
		int k=3;
		findDifferenceHeight(arr,k);
	}

	@Test
	public void test3() {
		int[] arr= {4,8,12,7};
		int k=3;
		findDifferenceHeight(arr,k);
	}

	/* iTERATE throught the array 
	 * compare the k value with the array value
	 * if greater than k sub the k from value
	 * else lesser or equal to k add the k value
	 * find min and max , find the diff 
	 * */
	private int findDifferenceHeight(int[] arr, int k) {
		Arrays.sort(arr);
		int value=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,minDiff=Integer.MAX_VALUE;
		/*
		 * for (int i = 0; i < arr.length; i++) { if(arr[i]>k) {//9//4 min=Math.min(min,
		 * arr[i]-k); max=Math.max(max, arr[i]-k); }else {//7 min=Math.min(min,
		 * arr[i]+k); max=Math.max(max, arr[i]+k); } }
		 */
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>=k) {				
			min=Math.min(arr[0]+k, arr[arr.length-1]-k);
			max=Math.max(arr[0]+k, arr[i]-k);
			value=Math.min(max-min, minDiff);
			}else continue;
		}
		
		System.out.println(value);
		return value;
	}
}

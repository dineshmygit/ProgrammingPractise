package week3;

import org.junit.Test;

public class SmallestSubarrayKandenealgo {
	@Test
	public void test1() {
		int[] arr= {2,1,6,7};
		findingsmallestSubarray(arr);
	}

	@Test
	public void test2() {
		int[] arr= {3,-4,2,-3,-1,7,5};
		findingsmallestSubarray(arr);
	}

	@Test
	public void test3() {
		int[] arr= {-1,-1};
		findingsmallestSubarray(arr);
	}
	@Test
	public void test4() {
		int[] arr= {-1,-1};
		findingsmallestSubarray(arr);
	}
	@Test
	public void test5() {
		int[] arr= {-2147483648,2147483647};
		findingsmallestSubarray(arr);
	}

	private int findingsmallestSubarray(int[] arr) {
		int window_sum=arr[0],min_sum=arr[0];
		if(arr.length==0) {
			return -1;
		}
		for (int i = 1; i < arr.length; i++) {
			window_sum=Math.min(window_sum+arr[i], arr[i]);
			min_sum=Math.min(window_sum, min_sum);
		}
		System.out.println(min_sum);
		return min_sum;
	}
}

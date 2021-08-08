package Assesment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Problem1 {

	@Test
	public void test1() {
		int arr[]= {1,3,3,2,4};
		List<Integer>ls=new ArrayList<Integer>();
		Collections.sort(ls);
		//ls.si
		int n=5;
		findMin(arr,n);

	}
	private void findMin(int[] arr, int n) {
		Arrays.sort(arr);
		int sum=0;
		int left=0,right=1;
		while(right<arr.length) {
		//	sum+=ls.get(right)-ls.[left];
			left=right;
			right++;
		}
		//return sum;
	}


}

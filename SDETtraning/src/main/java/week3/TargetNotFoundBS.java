package week3;

import org.junit.Test;

import junit.framework.Assert;

public class TargetNotFoundBS {
	
	@Test
	public void Test1() {
		int[] data= {1,3,5,6};
		int k=5;
		Assert.assertEquals(findIndexOfTarget(data,k), 2);
	}
	@Test
	public void Test2() {
		int[] data= {1,3,5,6};
		int k=2;
		Assert.assertEquals(findIndexOfTarget(data,k), 1);
	}
	@Test
	public void Test3() {
		int[] data= {1,3,5,6};
		int k=10;
		Assert.assertEquals(findIndexOfTarget(data,k), 4);
	}
	/* Iterate through the loop 
	 * set low=0, high =arr length, mid=(l+h)/2
	 * check if data[mid] is less than k then move left =mid+1
	 * check if data[mid] is greater than k then move high=mid-1
	 * condition of this should be l<=h
	 * return l , if present in mid index return mid
	 * 
	 * Time complexity :O(log n)
	 * space complexity :O(1)
	 * */
	private int findIndexOfTarget(int[] data, int k) {
		int low=0;int high=data.length-1,mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(data[mid]<k) low=mid+1;
			else if(data[mid]>k) high=mid-1;
			else return mid;
		}
		System.out.println(low);
		return low;
	}
}

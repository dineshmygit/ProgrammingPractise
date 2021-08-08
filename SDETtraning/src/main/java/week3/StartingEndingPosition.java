package week3;

import java.util.Arrays;

import org.junit.Test;

public class StartingEndingPosition {
	@Test
	public void test1() {
		int[] data= {5,7,7,8,8,10};
		int target = 8 ;
		int[] result=findPositions(data,target);
		System.out.println(Arrays.toString(result));
	}
	@Test
	public void test2() {
		int[] data= {5,7,7,8,8,10};
		int target = 7 ;
		int[] result=findPositions(data,target);
		System.out.println(Arrays.toString(result));
	}
	@Test
	public void test3() {
		int[] data= {7,7,7,7,7,7};
		int target = 7 ;
		int[] result=findPositions(data,target);
		System.out.println(Arrays.toString(result));
	}
	@Test
	public void test4() {
		int[] data= {7,7,7,7,7,7};
		int target = 11 ;
		int[] result=findPositions(data,target);
		System.out.println(Arrays.toString(result));
	}
	private int[] findPositions(int[] data, int k) {
		int low=0,high=data.length-1;
		while(low<high) {
			int mid=(low+high)/2;
			if(k<data[mid]) {
				high=mid-1;
				if(data[high]==k && data[high-1]==k) return new int[] {high,high-1};
			}
			else if(k>data[mid]) {
				low=mid+1;
				if(data[low]==k && data[low+1]==k) return new int[] {low,low+1};
			}	  
			else {
				if(data[mid]==k && data[mid-1]==k) return new int[] {mid-1,mid};
				else return new int[] {mid,mid+1};
			}	
		}
		return new int[] {-1,-1};
	}
	private int[] findPositions1(int[] data, int k) {
		int low=0,high=data.length-1;
		while(low<high) {
			int mid=(low+high)/2;
			if(data[mid]<k) low=mid+1;
			else if(data[mid]>k) high=mid-1;
			else {
				if(data[mid]==low) return new int[] {low,mid};
				if(data[mid]==high) return new int[] {mid,high};
			}
		}
		return new int[] {-1,-1};
	}
}

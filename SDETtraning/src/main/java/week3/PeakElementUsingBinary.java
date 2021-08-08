package week3;

import org.junit.Test;

public class PeakElementUsingBinary {
    @Test
	public void test1() {
		int[] data= {1,2,3,1};
		System.out.println(findingPeakelement1(data));
	}
    @Test
	public void test2() {
		int[] data= {1,2,1,3,5,6,4};
		System.out.println(findingPeakelement1(data));
	}
    @Test
   	public void test3() {
   		int[] data= {1,7,6,4,3,2};
   		System.out.println(findingPeakelement1(data));
   	}
    @Test
   	public void test4() {
   		int[] data= {1,2,1,6,5,3,4};
   		System.out.println(findingPeakelement1(data));
   	}
    @Test
   	public void test5() {
   		int[] data= {1,3,3,1,4};
   		System.out.println(findingPeakelement1(data));
   	}
	//1,2,3,1
	private int findingPeakelement(int[] data) {
		int low=0,high=low+2,mid=0,currentMid=0,peakValue=0;
		while(high<data.length) {
			mid=(low+high)/2;
			if(data[mid]>data[low] && data[mid]>data[high]) {
				System.out.println(mid);
				currentMid=data[mid];
			}
			else {
				low=mid;
				high=low+2;
			}
		}
		peakValue=Math.max(currentMid, peakValue);
		return mid;
	}
	private int findingPeakelement1(int[] data) {
		int low=0,high=data.length-1;
		while(low<high) {
			int mid=(low+high)/2;
			if(data[mid]>data[mid+1]) {
				high=mid;
			}else {
				low=mid+1;
			}
		}
		return low;
	}
}

package week3;

import org.junit.Test;

public class SingleOccurance {
	@Test
	public void test1() {
		int[] data= {3,3,7,7,8,10,10};
		findSingleOccurance(data);
	}
	@Test
	public void test2() {
		int[] data= {3,3,7,7,8,8,10};
		findSingleOccurance(data);
	}
	@Test
	public void test3() {
		int[] data= {3,3,9,7,7};
		findSingleOccurance(data);
	}

	private int findSingleOccurance(int[] data) {
		int low=0,high=data.length-1, index1=0,index2=0,mid=0;
		while(low<high){
			mid=(low+high)/2;
			if(data[mid]!=data[mid-1] && data[mid]!=data[mid+1]) return data[mid];
			else if(data[mid]==data[mid+1]) {
				index1=mid;
				index2=mid+1;
				if((high-index2)%2==0) high=mid-1;
				else low=index2+1; 
			}
			else {
				index1=mid;
				index2=mid-1;
				if((index2-low)%2==0) low=mid+1;
				else high=index2-1;	
			}
		}
		return data[low];
	}
}
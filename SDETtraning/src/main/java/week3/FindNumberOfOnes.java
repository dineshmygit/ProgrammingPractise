package week3;

import org.junit.Test;

public class FindNumberOfOnes {

	//positive
	@Test
	public void test1() {
		int arr[]= {0,0,0,1,1,1,1};
		int countOfOnes=findNumberOfOnesTP(arr);
		System.out.println(countOfOnes);
	}
	@Test
	public void test2() {
		int arr[]= {0,0,0,0,0,1,1};
		int countOfOnes=findNumberOfOnesTP(arr);
		System.out.println(countOfOnes);
	}
	@Test
	public void test3() {
		int arr[]= {1,1,1,1,1,1,1};
		int countOfOnes=findNumberOfOnesTP(arr);
		System.out.println(countOfOnes);
	}
	@Test
	public void test4() {
		int arr[]= {0,0,0,0,0,0,0};
		int countOfOnes=findNumberOfOnesTP(arr);
		System.out.println(countOfOnes);
	}
	private int findNumberOfOnesTP(int[] arr) {
		int left=0,right=arr.length-1,size=arr.length-1;
		while(left<=right) {
			if(arr[left]==1) return size-left;
			else left++;
			if((arr[right]==0) && (arr[right+1]==1)) return size-(right);
			else right--;
		}
		return -1;
	}
}

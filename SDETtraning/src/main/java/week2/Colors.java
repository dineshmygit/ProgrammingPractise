package week2;

import java.util.Arrays;

import org.junit.Test;

public class Colors {
	


	@Test
	public void method1() {
		int[] arr= {2,0,2,1,1,0};
	    int[] result= ColorOrder(arr);
	    System.out.println(Arrays.toString(arr));
	}
     
     
	@Test
	public void method2() {}

	//@Test
	public void method3() {

	}

	private int[] ColorOrder(int[] arr) {
		int low=0,mid=0,high=arr.length-1,tmp=0;
		while(mid<=high) {
			if(mid==0) {
				tmp=arr[mid];
				arr[mid++]=arr[low];
				arr[low++]=tmp;
			}else if(mid==1) {
				mid++;
			}else {
				tmp=arr[high];
				arr[high--]=arr[mid];
				arr[mid]=tmp;
			}	
			
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}


}

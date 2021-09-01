package assesment6;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class ReverseAnArray {
	/*Comments*/
	@Test
	public void test1() {
		int[] arr= {5,3,2,1,3};
		Assert.assertEquals(findReverseOrderUsingTwoPointer(arr), new int[] {5,1,2,3,3});
	}
	private int[] findReverseOrder(int[] arr) {
		/*{5,1,2,3,3}
		 * reverse from 1 to 3 
		 * find the start and end
		 * loop through array
		 * check for the index i =1 to 3
		 * reverse
		 */
		int start=1,end=3;
		int[] result=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(i==start) {
				int arrIndex=start;
				for (int j = end; j>=start ; j--) {
					result[arrIndex++]=arr[j];
					i=end;
				}
			}else {
				result[i]=arr[i];
			}
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
	private int[] findReverseOrderUsingTwoPointer(int[] arr) {
		/*{5,1,2,3,3}
		 * reverse from 1 to 3 
		 * find the start and end
		 * loop through array
		 * check for the index i =1 to 3
		 * reverse
		 * {5,3,2,1,3}
		 */
		int start=1,end=3,tmp=0,loop=end;
		int[] result=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(i==start) {
				while(start<=end) {					
				tmp=arr[start];
				result[start++]=arr[end];
				result[end--]=tmp;
				}
				i=loop;
			}else {
				result[i]=arr[i];
			}
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
}
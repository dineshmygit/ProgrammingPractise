package week2;

import java.util.Arrays;

import org.junit.Test;

/*yes
 * Constrain : Two pointer
 * 
 * Iterate through array1 and check for 0 value
 * replace the num2 value in 0 value index
 * after merging num2 in num1
 * sort the array and return
 * */


public class MergerSortTwoPointer {
	@Test
	public void test1() {
		int[] num1= {1,2,3,0,0,0};
		int[] num2= {2,5,6};
		int m=3,n=3;
		mergerSortUsingTwoPointer(num1,num2,m,n);
	}
	@Test
	public void test2() {
		int[] num1= {0};
		int[] num2= {1};
		int m=1,n=0;
		mergerSortUsingTwoPointer(num1,num2,m,n);
	}

	/* Time complexity :O(n)
	 * Space Complexity:O(n)
	 * */
	private void mergerSortUsingTwoPointer(int[] num1, int[] num2,int m,int n) {
		int num2less=0;int num1right=num1.length-1;
		while(num2less<num2.length) {
			if(num1[num1right]==0) {
				num1[num1right--]=num2[num2less];
				num2less++;
			}else {
				num1right--;
			}
		}
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
	}
}


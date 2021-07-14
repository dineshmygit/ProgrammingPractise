package week2;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortProblem {
	//@Test
	public void test1() {
		int[] num1= {1,2,3,0,0,0};
		int m=3;
		int[] num2= {2,5,6};
		int n=3;
		mergeTwoArrays(num1,m,num2,n);

	}
	@Test
	public void test2() {
		int[] num1= {0};
		int m=0;
		int[] num2= {1};
		int n=1;
		mergeTwoArrays(num1,m,num2,n);

	}
	@Test
		public void test3() {
			int[] num1= {1,2,3,0,0,0};
			int m=3;
			int[] num2= {2,5,6,0};
			int n=3;
			mergeTwoArrays(num1,m,num2,n);

		}

	/* keep left pointer in num1 
	 * right pointer in num2
	 * check left and right pointer are same
	 * if same add both to a array and increment left++ and right++
	 * if not same add both to array and increment left++ and right++
	 * if zero dont add just increment left++ and right++
	 * sort the newly added array
	 * 
	 * 
	 * */

	public void mergeTwoArrays(int[] num1,int m,int[] num2,int n) {
		int left=0,right=0;
		int[] arrNew=new int[m+n];
		while(left<=m+n-1) {  
			if(num1[left]==0 && num2[right]!=0) {
				num1[left]=num2[right];
				left++;
				right++;
			}else if(num2[right]==0){
				right++;
			}else {
				left++;
			}
		}
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
	}
}

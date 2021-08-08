package week3;

import org.junit.Test;

/*
1. Understand the problem  : 
2. Test data set
  	input:
  	Target:
  	output:True 
3. Do you know how to solve
4. Ask for hints and constraints:
   Solve in brute force  
5. Alternative solution
   two pointer or sliding window  
6. Know O notation

7. write Pseudo code
	1.

 */
public class MinimumSizeSubarray {
	@Test
	public void test1() {
		int[] nums= {2,3,1,2,4,3};
		int target=7;
		int noOfIndex=findingMinimumSum(nums,target);
		//System.out.println(noOfIndex);
	}
	@Test
	public void test2() {
		int[] nums= {4,4,1};
		int target=1;
		int noOfIndex=findingMinimumSum(nums,target);
		//System.out.println(noOfIndex);
	}
	@Test
	public void test3() {
		int[] nums= {1,1,1,1,1,1,1};
		int target=11;
		int noOfIndex=findingMinimumSum(nums,target);
		System.out.println(noOfIndex);
	}
	@Test
	public void test4() {
		int[] nums= {1,2,3,4,5};
		int target=11;
		int noOfIndex=findingMinimumSum(nums,target);
		System.out.println(noOfIndex);
	}

	//	1,2,3,4,5
	private int findingMinimumSum(int[] nums, int target) {
		int sum=0,min=0,count=0,minIndex=0;
		for (int i = 0; i < nums.length; i++) {
			sum=0;
			count=0;
			for (int j = i; j < nums.length; j++) {
				sum+=nums[j];
				count++;
				if(sum==target) {
					min=count;
				}
			}
		}
		System.out.println(min);
		return min;
	}	
}

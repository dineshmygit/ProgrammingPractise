package week1;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

/*
1. Understand the problem
   Check each number in an array is smaller than how many number inside array
   
2. Test data set
  	input:
  	Target:
  	output:
  	
3. Do you know how to solve
4. Ask for hints and constraints
    a)without using DS
    b)using DS
5. Alternative solution
   a)Brute force
   1.Traverse through the array
   2.For each element count the number of element lesser than the current element.
   3.store it in an array
   time complexity:O(n^2)
   space complexity : O(n)
   
   b)sorted array
     {1,2,2,3,8}
     for each 
     
 
   
6. Know O notation
7. write Pseudo code
8. Implement the code
9. Debug and Test
 */
public class SmallerThanCurrent {


	@Test
	public void positiveCase() {
		int[] arr= {8,1,2,2,3};
		arr=funCal1(arr);
		System.out.println(Arrays.toString(arr));

	}

	//@Test
	public void negativeCase() {
		int[] arr= {8,1,2,2,3};
		arr=funCal2(arr);
		System.out.println(Arrays.toString(arr));
	}

	//@Test
	public void edgeCase() {

	}

	private int[] funCal1(int[] arr) {

		int[] arr1=new int[arr.length];
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					count++;
				}
			}
			arr1[i]=count;
			count=0;
		}
		return arr1;
	}
	private int[] funCal2(int[] arr) {
		int count=0;
		Arrays.sort(arr);
	    for (int i = arr.length-1; i >= arr.length; i--) {
			if(arr[i]==arr[i-1]) {
				count++;
			}
			arr[i]=count;
		}
		
		return new int[] {};
	}
}

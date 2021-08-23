package week1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
//hisdf

import junit.framework.Assert;

/*
1. Understand the problem

2. Test data set
  	input:
  	Target:
  	output:

3. Do you know how to solve
4. Ask for hints and constraints
5. Alternative solution
   1.Brute force
6. Know O notation
7. write Pseudo code
8. Implement the code
9. Debug and Test
 */
public class IntersectionArray {
	@Test  //positive data
	public void positiveCase() {
		int[] arr1 = { 1,3,3,6 };
		int[] arr2 = { 3,3 };
		int[] intersection=funCal(arr1,arr2);
		int[] output= {3};
		System.out.println(Arrays.toString(intersection));
		  // Assert.assertEquals(intersection, output);
	}

	@Test //Negative data
	public void negativeCase() {
		int[] arr1 = { 3,3,1 };
		int[] arr2 = { 1,3,3,6 };
		int[] intersection=funCal(arr1,arr2);
		System.out.println(Arrays.toString(intersection));
	}

	@Test //Edge cases
	public void edgeCase() {
		int[] arr1 = { 1,1 };
		int[] arr2 = { 1,1 };
		int[] intersection=funCal(arr1,arr2);
		System.out.println(Arrays.toString(intersection));
	}

	/*
	 * Time complexity: O(n)^2
	 * Space Complexity:O(n)
	 */
	private int[] funCal(int[] arr1,int[] arr2) {

		Set<Integer> dup1 = new LinkedHashSet<Integer>();
		Set<Integer> dup2 = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr1.length; i++)
			dup1.add(arr1[i]);
		for (int j = 0; j < arr2.length; j++)
			dup2.add(arr2[j]);
		List<Integer> ls1=new LinkedList<Integer>();
		List<Integer> ls2=new LinkedList<Integer>();

		for(Integer ar1:dup1)
			ls1.add(ar1);
		for(Integer ar2:dup2)
			ls2.add(ar2);
		int k=0;
		int arrLength=0;
		//
		if(ls1.size()<ls2.size()) {
			arrLength=ls1.size();
		}else if(ls1.size()==0 || ls2.size()==0) {
			arrLength=0;
		}
		else {
			arrLength=ls2.size();
		}
		int[] inter=new int[arrLength];
		for (int i = 0; i < ls1.size(); i++) {
			for (int j = 0; j < ls2.size(); j++) {
				if(ls1.get(i)==ls2.get(j)) {
					inter[k]=ls1.get(i);
					k++;
				}
			}
		}
		return inter;
	}
}

package week1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;
/*
1. Understand the problem
  Find the missing number from continuous number
2. Test data set
  	input:{3,0,1}
  	Target:Find the missing number
  	output:2 
  	input : int[]
  	return :

3. Do you know how to solve
   Brute force
4. Ask for hints and constraints
   Two number missing is this possible
   what if the number is long or float

5. Alternative solution

6. Know O notation
7. write Pseudo code
   a.Eliminate duplicates from array 
   b.In order to that use set
   c.sort the set, inorder to that insert set to list
   d.iterate through list
   e.Get the first value of the list in tmp var
   f.check with the tmp with first value in list
   g.Increase the tmp++ and compare with other values
   h.If value not present get the tmp
8. Implement the code
9. Debug and Test
 */
public class MissingValueArr {
	
	@Test
	public void positiveCase() {
		int[] arr= {21,23,24};
		Assert.assertEquals(funCal(arr), 22);
		

	}

	@Test
	public void negativeCase() {
		int[] arr= {0,0,0};
		Assert.assertEquals(funCal(arr), 0);
	}

	//@Test
	public void edgeCase() {
		//Two number missing
		//
		int[] arr= {1,3,5};
	}

	/*
	 * Time complexity: O(n)
	 * Space complexity:O(n)
	 */	
	private int funCal(int[] arr) {
		
		int i, tmp=0,missingVal=0;
		Set<Integer> dup1 = new LinkedHashSet<Integer>();
		for (i = 0; i < arr.length; i++)
			dup1.add(arr[i]);
		List<Integer> ls1=new LinkedList<Integer>();
		for(Integer ar1:dup1)
			ls1.add(ar1);
		Collections.sort(ls1);
		for ( i = 0; i < ls1.size(); i++) {
			//Getting the first value in list
			if(i==0) {
				tmp=ls1.get(0);
			}
			//comparing list value to tmp value
			if(tmp==ls1.get(i)) {
				tmp++;
				continue;
			}else {
				missingVal=tmp;
			}
		}
		return missingVal;
	}
}

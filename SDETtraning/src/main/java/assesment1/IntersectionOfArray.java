package assesment1;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;


/*
1. Understand the problem 
   Yes
2. Test data set
  	input:{1,2,1,1},{2,2}
  	Target:Intersection with another array
  	output:[2,2]
3. Do you know how to solve
   yes
4. Ask for hints and constraints
   No constrain
5. Alternative solution
    Brute force
6. Know O notation
   O(3n)=>O(n)  
7. write Pseudo code
 1.Iterate through array
 2.add num2 to set 
 3.check whether set value has num2 array values
 4.If yes, then add to array
 5.Return the array
 */
public class IntersectionOfArray {
	//@Test
	public void test1() {
		int[] num1= {1,2,2,1};
		int[] num2= {2,2,};
	    assertArrayEquals( intersectioTwoArrays(num1,num2),new int[] {1,2});
	}

	@Test
	public void test2() {
		int[] num1= {4,9,5};
		int[] num2= {9,4,9,8,4};
		int[] retrunArray=intersectioTwoArrays(num1,num2);
		 System.out.println(Arrays.toString(retrunArray));
		 assertArrayEquals(retrunArray, new int[] {4,9});
	}

	/* time complexity :O(3n)=>O(n)
	 * Space complexity:O(n)
	 * */
	private int[] intersectioTwoArrays(int[] num1, int[] num2) {
		Set<Integer> valueNum2=new HashSet<Integer>();
		List<Integer> intersectionList=new ArrayList<Integer>();
		for (int i = 0; i < num2.length; i++) {
			valueNum2.add(num2[i]);
		}
		for (int j = 0; j <num1.length ; j++) {
			if(valueNum2.contains(num1[j])) {
				intersectionList.add(num1[j]);
			}
		}
		int[] returnArray=new int[intersectionList.size()];
		for (int i = 0; i < intersectionList.size(); i++) {
			returnArray[i]=intersectionList.get(i);
		}
		return returnArray;		
	}
}

package week1;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/*
1. Understand the problem
  return the majority element in an array
2. Test data set
  	input:{1,2,5,6,5,5}
  	Target:majority element
  	output:5 return the majority int number
  	
3. Do you know how to solve
   yes -> brute force
4. Ask for hints and constraints
   if value is {1,1,2,2},{},{1,2,3,4},{1}
5. Alternative solution
   1.Brute force
6. Know O notation
7. write Pseudo code
   a.Iterate the array
   b.check with the count of number
8. Implement the code
9. Debug and Test
 */
public class MajorityElements {


	@Test
	public void positiveCase() {
		int[] arr= {1,2,3,3};
	//	int majority=funCal(arr);
		Assert.assertEquals(funCal(arr), 3);
		//System.out.println(majority);
        
	}

	@Test
	public void negativeCase() {
		int[] arr= {1,2,3};
		Assert.assertEquals(funCal(arr), 0);
	}

	//@Test
	public void edgeCase() {
		int[] arr= {1,1,3,3};
		Assert.assertEquals(funCal(arr), 3);
		
	}

	/*
	 * Time complexity:O(n)^2 
	 * Space complexity:O(n)
	 */
	private int funCal(int[] arr) {
		int countNum=1, max=0,maxValue=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {				
				if(arr[i]==arr[j])
					countNum++;
			}
			if(max<countNum && countNum>1) {
				maxValue=arr[i];
				max=countNum;
				countNum=0;
			}
		}
		return maxValue;	
	}
}

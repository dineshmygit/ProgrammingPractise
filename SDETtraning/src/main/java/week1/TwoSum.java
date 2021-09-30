package week1;

import org.junit.Test;

/*
1. Understand the problem
   2 sum pgm: adding two number u get the target
2. Test data set
  	input:{2,4,5,6,9}
  	Target:10
  	output:{4,6} = return the index of 4,6 in array
  	return the first matched value
3. Do you know how to solve
4. Ask for hints
5. Alternative solution
   1.Brute force
6. Know O notation
7. write Pseudo code
	1.Iterate the array
	2.compare one value with other values.
	  a. if matched return the index.
	  b. if not iterate the next
	3.return the int[]  
8. Implement the code
9. Debug and Test
 */
public class TwoSum {


	@Test
	public void positiveCase() {
		int[] input= {2,3,4,5,6,8};
		int target =10;
		funCal(input,target);

	}

	@Test
	public void negativeCase() {
		int[] input= {1,2,1,1,1,1};
		int target =10;
		funCal(input,target);
	}

	//@Test
	public void edgeCase() {

	}

	private void funCal(int[] input , int target) {
		boolean flag=false;	
		int[] sum;
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[i]+input[j]==target) {
					System.out.println("First index ="+i+" Second Index ="+j);
					flag=true;
				}		
			}
			if(flag==true) {
				break;
			}
		}
	}
}

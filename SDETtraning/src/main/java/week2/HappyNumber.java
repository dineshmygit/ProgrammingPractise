package week2;

import org.junit.Test;

import junit.framework.Assert;
/*
1. Understand the problem
  Element occured once should appear
2. Test data set
  	input:[2,2,1]
  	Target:
  	output:1

3. Do you know how to solve
4. Ask for hints and constraints
    a)without using DS
    b)using DS
5. Alternative solution
   a)Brute force
   b)Map

6. Know O notation
   Time complexity:O(n^2)
   space complexity : O(n)   
7. write Pseudo code
   a.sort array
   b.iterate through array
   c.create another loop and 
   d.check for i!=j
   e.return the element

Compare the center element and if same exit it 
8. Implement the code
9. Debug and Test
 */
public class HappyNumber {
	//int orginalSquare;
	@Test
	public void method1() {
		int n=12;
	    //orginalSquare=n;
		boolean happyNumber=isHappyNumber(n);
		System.out.println(happyNumber);
//		Assert.assertEquals(isHappyNumber(n), true);
	}

	//@Test
	public void method2() {
		int n=2;
		Assert.assertEquals(isHappyNumber(n), true);
	}

	//@Test
	public void method3() {

	}

	private boolean isHappyNumber(int n) {
		int rem=0,div=0,squaredSum=0;
		while(n>0) {
			rem=n%10;
			n=n/10;
			squaredSum+=rem*rem;
		}
		System.out.println(squaredSum);
		if(squaredSum!=1 & squaredSum!=4) {
			//n=squaredSum;
			isHappyNumber(squaredSum);
			System.out.println("After recursive call");
//			if(n!=orginalSquare) {
//				isHappyNumber(n);
//			}
//			return false;
		}
		else if(squaredSum == 4)
		{
			System.out.println("squaredsum within 4 check "+squaredSum);
			return false;
		}
		
			System.out.println("squaredsum is" +squaredSum);
			return true;
		
	}
}

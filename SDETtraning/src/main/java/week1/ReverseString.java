package week1;

import org.junit.Test;

import junit.framework.Assert;

public class ReverseString {

	/*
	1. Understand the problem
	  
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
	1.move the first element to the last 

	2.last element to first 

	3.increase the first and dec the last index 

	Shift it  

	Compare the center element and if same exit it 
	8. Implement the code
	9. Debug and Test
	 */

		@Test
		public void method1() {
			String str="ab-cd";
			Assert.assertEquals(ReverseString(str), "dc-ba");
			

		}

		@Test
		public void method2() {
			String str="a-bC-dEf-ghIj";
			Assert.assertEquals(ReverseString(str), "jIhg-fed-cb-a");
		}

		//@Test
		public void method3() {

		}

		private String ReverseString(String str) {
			char[] charArray = str.toCharArray();
			int right=charArray.length-1,left=0;
			StringBuilder sb=new StringBuilder();
			while(left<right) {
				if(Character.isLetter(charArray[left])&&
						Character.isLetter(charArray[right])) {				
					char tmp=charArray[right];
					charArray[right--]=charArray[left];
					charArray[left++]=tmp;						
				}
			}
			sb.append(charArray);
			System.out.println(sb);
			return sb.toString();
		}
	}


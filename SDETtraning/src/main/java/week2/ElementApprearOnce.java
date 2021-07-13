package week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

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
public class ElementApprearOnce {

	int singleNum=0;
	@Test
	public void method1() {
		int[] arr= {1,2,1,2,4};
		singleNum=singleElement(arr);
		System.out.println(singleNum);
	}

	@Test
	public void method2() {
		int[] arr= {2,2,1};
		singleNum=singleElement(arr);
		System.out.println(singleNum);
	}

	@Test
	public void method3() {
		int[] arr= {1,1,1};
		singleNum=singleElement(arr);
		System.out.println(singleNum);
	}

	private int singleElement(int[] arr) {
		int singleValue=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for (int j = 0; j < arr.length; j++) {
			map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
		}
		for(Entry<Integer,Integer>entry:map.entrySet()) {
			if(entry.getValue()==1) {
				singleValue=entry.getKey();
			}
		}
		return singleValue;
	}
	private int singleElementTwopointer(int[] arr) {
		Arrays.sort(arr);
		int left=0,right=arr.length-1;
		/*
		 * if(arr[left]!=arr[left+1])return num[left];
		 * if(arr[right]!=arr[right+1])return
		 */
		return 0;
	}
}
package week1;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/*
1. Understand the problem
   Occurrence of each value is unique
2. Test data set
  	input:int arr[]= {4,5,5,6,6,6};
  	Target:occurance must be unique
  	output:true

3. Do you know how to solve

4. Ask for hints and constraints
      
      {1,1,1,1}
5. Alternative solution
6. Know O notation
7. write Pseudo code
  a.Iterate array and add to map
  b.compare value present in map if not add key and value as 1.
  c.If key already exist add the same key and increase count
  d.create two set and add in array and map value , also remove duplicate
  e.now compare the size of both the set
  f.if same size return true else return false
8. Implement the code
9. Debug and Test
 */
public class OccuranceValue {


	@Test
	public void positiveCase() {
		int[] arr= {4,5,5,6,6,6};
		Assert.assertEquals(funCal(arr), true);
	}

	@Test
	public void negativeCase() {
		int[] arr= {4,5,6,6,6};
		Assert.assertEquals(funCal(arr), false);
	}

	@Test
	public void edgeCase() {
		int[] arr= {1,1,1,1};
		Assert.assertEquals(funCal(arr), true);
	}

	/*
	 * Time complexity: O(n)
	 * Space complexity:O(n)
	 * 
	 */
			private boolean funCal(int[] arr) {
		//Occurrence of values
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) { //O(n)
			if(map.containsKey(arr[i])) 
				map.put(arr[i], map.get(arr[i])+1);
			else 
				map.put(arr[i],1);
		}
		Set<Integer> dup1 = new LinkedHashSet<Integer>();
		Set<Integer> dup2 = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) { //O(2n)
			//removing duplicate from array
			dup1.add(arr[i]);
			//Add map to set to remove duplicate of map value
			dup2.add(map.get(arr[i]));
		}
		//compare the size of list and set
		/*
		 * {4=1, 5=1, 6=3} [4, 5, 6] [1, 3]
		 */
		/*
		 * {4=1, 5=2, 6=3} [4, 5, 6] [1, 2, 3]
		 */
		if(dup1.size()==dup2.size()) 
			return true;
		else 
			return false;	
	}
}

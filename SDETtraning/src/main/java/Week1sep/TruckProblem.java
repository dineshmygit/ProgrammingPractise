package Week1sep;

import java.util.Arrays;

import org.junit.Test;

public class TruckProblem {
	/*Comments*/
	@Test
	public void test1() {
		int[][] arr= {{1,3},{2,3},{3,1}};
		int truckSize=4;
		findNoOfBoxFit(arr,truckSize);
	}

	@Test
	public void test2() {

	}

//	@Test
	public void test3() {
		int[][] arr= {{1,3},{2,3},{3,1}};
		int truckSize=4;
		findNoOfBoxFit(arr,truckSize);
	}

	private void findNoOfBoxFit(int[][] array, int truckSize) {
		/*iterate through the array and sort the values in decending order
		 * using the 2nd array 2nd value
		 * multiply the 2nd array and get the value
		 * keep adding the 2nd array first value 
		 * when the added first value meets the truck size break
		 * when adding if the added first value is lesser keep adding
		 * if greater then stop and added the values equal to truck size and break
		 * return the multiplied value		 * 
		 * */
//reverse the given entence by its word 
	//	today is a beautiful day
//less than O(n)
			 sortRowWise(array);
	    }

	    static int sortRowWise(int arr[][]) {
	        // One by one sort individual rows.
	        for (int i = 0; i < arr.length; i++) {
	            Arrays.sort(arr[i]);
	        }

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++)
	                System.out.print(arr[i][j] + " ");
	                System.out.println();
	        }
	    return 0;
	}
}
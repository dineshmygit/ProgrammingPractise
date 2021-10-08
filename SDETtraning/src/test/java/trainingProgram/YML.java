package trainingProgram;

import java.util.Arrays;

import org.junit.Test;

public class YML {
	/*Comments
	 * 
	 * */
	@Test
	public void test1() {
		int arr[]= {1,2,3,4,5};
		int k=3,count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=k) {
				arr[i]=arr[i];
			}else {
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

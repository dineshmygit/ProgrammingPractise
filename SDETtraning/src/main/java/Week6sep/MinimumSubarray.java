package Week6sep;

import org.junit.Test;

public class MinimumSubarray {
	/*Comments*/
	@Test
	public void test1() {
		int[] data= {1,-5,2,-3,7,1};
		findMinSubarray(data);
		
	}

	private void findMinSubarray(int[] data) {
		int currentSum=data[0],WindowMinSum=data[0],res=0,min=Integer.MAX_VALUE;
		for (int i = 1; i < data.length; i++) {
			currentSum=data[i];
			WindowMinSum+=currentSum;
			res=Math.min(WindowMinSum, currentSum);
			if(res<min) {
				min=res;
			}
		}
		System.out.println(res);
		
	}

}

package mypractise;

import org.junit.Test;

public class CaloriesConsumesWS {
	@Test
	public void test1() {
		int[] data= {1,2,3,4,5};
		int k=1,upper=3,lower=3;
		int calConsumed=findCaloriesConsumed(data,k,upper,lower);	
	}
			@Test
			public void test2() {
				int[] data= {3,2};
				int k=2,upper=1,lower=0;
				int calConsumed=findCaloriesConsumed(data,k,upper,lower);	
			}

	private int findCaloriesConsumed(int[] data, int k, int upper, int lower) {
		int init=0,startSum=0,points=0;
		for (int i = 0; i < k; i++) {
			startSum+=data[i];
			if(startSum<lower) {
				points--;	
			}else if(startSum>upper) {
				points++;
			}
		}
		for (int i = k ; i < data.length; i++) {
			startSum=startSum-data[i-1]+data[i];
			if(startSum<lower) {    
				points--;	
			}else if(startSum>upper) {
				points++;
			}
		}
		System.out.println(points);
		return points;
	}

}

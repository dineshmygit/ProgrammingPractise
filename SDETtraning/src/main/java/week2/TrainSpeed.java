package week2;

import org.junit.Test;

public class TrainSpeed {
	/*Comments
	 * 
	 * 
	 * 
	 * */
	@Test
	public void test1() {
		int[] dist= {1,3,2};
		double hour=6;
		findDistance(dist,hour);
	}

	@Test
	public void test2() {
		int[] dist= {1,3,2};
		double hour=2.7;
		findDistance(dist,hour);
	}

	@Test
	public void test3() {
		int[] dist= {1,3,2};
		double hour=1.9;
		findDistance(dist,hour);
	}
	/*Comments
	 * use binary search 
	 * if hour is lower than 2 then return -1
	 * if h
	 * speed = distance/time
	 * time = distance/speed
	 * */
	private int findDistance(int[] dist, double hour) {
		int distance=0,time=(int) hour,speed=0,timeResult=0;
		long result=0;
		if(hour>=2) {
			for (int i = 0; i < dist.length; i++) {
				distance+=dist[i];
			}
			speed=distance/time;
			for (int i = 0; i < dist.length; i++) {
				result+=dist[i]/speed;
			}
			return timeResult;
		}else return -1;
	}

}

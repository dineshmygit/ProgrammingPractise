package InterviewPreparation;

import org.junit.Test;

public class GasStation {
	/*Comments*/
	@Test
	public void test1() {
		int[] gas= {1,2,3,4,5};
		int[] cost= {3,4,5,1,2};
		findStartStationNew(gas,cost);
	}
	//@Test
	public void test2() {
		int[] gas= {5,1,2,3,4};
		int[] cost= {4,4,1,5,1};
		findStartStation(gas,cost);
	}

	private int findStartStation(int[] gas, int[] cost) {
		int mid=0,add1=0,add2=0,result=0;
		mid=(0+gas.length-1)/2;
		for (int i = 0; i <= mid; i++) {
			add1+=gas[i];
		}
		for (int i = mid+1; i < cost.length; i++) {
			add2+=gas[i];
		}
		result=add2-add1;
		System.out.println(add1);
		System.out.println(add2);
		if(result>=0) return result;
		else return -1;
	}
	private int findStartStationNew(int[] gas, int[] cost) {
		int mid=0,add1=0,add2=0,result=0;
		mid=(0+gas.length-1)/2;
		for (int i = 0; i <= mid; i++) {
			add1+=gas[i];
		}
		for (int i = mid+1; i < cost.length; i++) {
			add2+=gas[i];
		}
		result=add2-add1;
		if(result>=0) return result;
		else return -1;
	}

}

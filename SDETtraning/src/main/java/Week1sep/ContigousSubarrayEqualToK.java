package Week1sep;

import org.junit.Test;

public class ContigousSubarrayEqualToK {
	/*Comments*/
	@Test
	public void test1() {
		int[] data= {1,1,1};
		int k=2;
		findSumEqualToK(data,k);
	}


	@Test
	public void test2() {
		int[] data= {-1,1,0};
		int k=0;
		findSumEqualToK(data,k);
	}

	@Test
	public void test3() {
		int[] data= {1,1,1,1,1,4};
		int k=4;
		findSumEqualToKUsingSW(data,k);
	}
	private void findSumEqualToK(int[] data,int k) {
		int count=0,sum=0;
		for (int i = 0; i < data.length; i++) {
			if(data[i]==k) count++;
			sum=data[i];
			for (int j = i+1; j < data.length; j++) {
				sum+=data[j];
				if(sum==k) count++;
			}
		}
		System.out.println(count);

	}
	private void findSumEqualToKUsingSW(int[] data,int k) {
		int first=0,sum=0,count=0;
		for (int i = 0; i < data.length; i++) {
			sum+=data[i];
		}
		for (int i = 0; i < data.length; i++) {
			if(data[i]==k) count++;
			sum=sum-data[i];
			if(sum==k) count++;
		}
		System.out.println(count);
	}
}

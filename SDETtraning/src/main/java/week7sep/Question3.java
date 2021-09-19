package week7sep;

import org.junit.Test;

public class Question3 {
	
	/*Comments*/
	@Test
	public void test1() {
		int[] A= {51,71,17,41};
		findSum(A);
	}

	private void findSum(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			int div=a[i],sum=0,add=0;
		while(div>0) {			
			sum=a[i]%10;
			//add+=a[]
			div=a[i]/10;
			System.out.println(sum);
		}
		}
		
	}

	@Test
	public void test2() {

	}

	@Test
	public void test3() {

	}

}

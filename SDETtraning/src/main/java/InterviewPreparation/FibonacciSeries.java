package InterviewPreparation;

import org.junit.Test;

public class FibonacciSeries {
	/*Comments*/
	@Test
	public void test1() {
		int count=10;
		printFibonocciSeries(count);
	}

	private void printFibonocciSeries(int count) {
		//0+1+1+2+3+5+8
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for (int i = 2; i < count; i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}
}

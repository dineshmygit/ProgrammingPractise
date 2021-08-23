package InterviewPreparation;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

public class LongestEvenLengthWord {
	/*Comments*/
	@Test
	public void test1() {
		String data="Times to write great code";
		findLongestLength(data);
	}

	@Test
	public void test2() {

	}

	@Test
	public void test3() {
		
	}

	private void findLongestLength(String data) {
		String[] arr=data.split(" ");
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			int len=arr[i].length();
			if(arr[i].length()%2==0 && len>max) {
				max=arr[i].length();
				System.out.println(arr[i]);
			}
		}

	}

}



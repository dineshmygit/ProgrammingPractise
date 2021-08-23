package InterviewPreparation;

import org.junit.Test;

import junit.framework.Assert;

public class CircularTime {
	/*Comments
	 * input:string
	 * output:int 
	 * */
	@Test
	public void test1() {
		String data="BZA";
		//A B Z A
		Assert.assertEquals(findCircularSeconds(data), 4);
	
	}

	@Test
	public void test2() {
		String data="AZA";
		Assert.assertEquals(findCircularSeconds(data), 2);
	}

	@Test
	public void test3() {
		String data="AA";
		Assert.assertEquals(findCircularSeconds(data), 0);
	}
	@Test
	public void test4() {
		String data="ANMZ";//13+1+13=27
		Assert.assertEquals(findCircularSeconds(data), 27);
	}

	/* COnvert the string to char[]
	 * initialize first char =A
	 * create a var result
	 Iterate the given char ,
	 find diff of char[i]-firstChar
	 Check the char[i]-'A' >13 , then 26-diff
	 add diff to result
	 * BAZ
	 * */
	private Object findCircularSeconds(String data) {
		char[] arr=data.toCharArray();
		char charFirst='A';
		int result=0;
		int difference=0;
		for (int i = 0; i < arr.length; i++) {
			difference=Math.abs((arr[i]-'A')-(charFirst-'A'));
			if(difference>13) {
				difference=26-difference;
			}
			charFirst=arr[i];
			result += difference;
		}	
		return result;
	}
}

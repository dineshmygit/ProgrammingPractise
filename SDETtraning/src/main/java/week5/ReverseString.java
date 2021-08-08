package week5;

import org.junit.Test;

public class ReverseString {
	String str="";
	/*Comments*/
	@Test
	public void test1() {
		String data="abcde";
		reverseStringUsingRecursion(data);
	}

	@Test
	public void test2() {

	}
	@Test
	public void test3() {
		String data="abcde";
		reverseStringUsingRecursion(data);
	}

	private String reverseStringUsingRecursion(String data) {
		if ((data==null))
			return "";
		else
		{
			str+=data.charAt(data.length()-1);
			reverseStringUsingRecursion(data.substring(0,data.length()-1));
		}
		return data;
	}
}

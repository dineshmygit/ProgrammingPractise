package mypractise;

import org.junit.Test;

public class OccuranceOfCharacter {
	@Test
	public void test1() {
		String data="java programming";
		char ch='a';
		findOccurance(data,ch);
	}

	private void findOccurance(String data, char ch) {
		int stringLength=data.length();
		int lengthRemoved=data.replace("a", "").length();
		int result=stringLength-lengthRemoved;
		System.out.println(result);
	}

}

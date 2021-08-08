package week5;

import org.junit.Test;

import junit.framework.Assert;

public class DecodingString {

	@Test
	public void test3() {
		String data="3[a]2[bc]";
		Assert.assertEquals(decodeStringValues(data), "accaccacc");
	}

	StringBuilder sb=new StringBuilder();
	private String decodeString(String data) {
		if(!data.contains("]")) {
			return "";
		}
		int count=1;
		int Openindex=0,closeIndex=0;
		closeIndex=data.lastIndexOf(']');
		Openindex=data.lastIndexOf('[');
		if(Character.isDigit(data.charAt(Openindex-1))) {
			count=data.charAt(Openindex-1);
		}
		while(count<=1)
			sb.append(data.substring(Openindex+1, closeIndex));
		decodeString(data.replace(data.substring(Openindex, closeIndex+1), sb.toString()));
		System.out.println(sb.toString());
		return sb.toString();
	}

	/*
	 * 3[a]2[bc] 
	 * aaabcbc
	 * 2[ab]
	 * abab
	 */
	private String decodeStringValues(String data) {
		int firstOpeningIndex=0,lastClosingIndex=0;
		for (int i = 0; i < data.length(); i++) {
			lastClosingIndex=data.lastIndexOf(']');
			firstOpeningIndex=data.lastIndexOf('[');
			String substring = data.substring(firstOpeningIndex+1, lastClosingIndex);
			if(Character.isDigit(data.charAt(firstOpeningIndex-1))) {
				Character num=data.charAt(firstOpeningIndex-1);
				printSubstring(num,substring);
				System.out.println(num);
				
			}
		}


		return "";
	}

	private void printSubstring(Character num, String substring) {
		int num1=Integer.parseInt(String.valueOf(num));
		StringBuilder sb=new StringBuilder();
		while(num!=0) {
			sb.append(substring);
		num--;
		}
	}
}

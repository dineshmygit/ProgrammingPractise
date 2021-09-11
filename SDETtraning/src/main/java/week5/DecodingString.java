package week5;

import java.util.Stack;

import org.junit.Test;

public class DecodingString {

	@Test
	public void test3() {
		String data="3[a]2[bc]";
		decodeStringValues(data);
	}

	/*
	 * 3[a]2[bc] 
	 * aaabcbc
	 * 2[ab]
	 * abab
	 */
	private void decodeStringValues(String data) {
		Stack<Integer> numStack=new Stack<Integer>();
		Stack<String> strStack=new Stack<String>();
		int index=0;
		StringBuilder res=new StringBuilder();
		while(index<data.length()) {
			if(Character.isDigit(data.charAt(index))){
				int num=0;
				while(Character.isDigit(data.charAt(index))) {					
				num=num*10 + (data.charAt(index) - '0');
				index++;
				}
				numStack.push(num);
			}else if(data.charAt(index)=='[') {
				strStack.push(res.toString());
				res=new StringBuilder("");
			}else if(data.charAt(index)==']') {
				StringBuilder temp=new StringBuilder();
				int len=numStack.pop();
				for (int i = 0; i < len; i++) {
					temp.append(strStack.pop());
				}
				res.append(temp);
				index++;
			 }else {
				res.append(data.charAt(index));
				index++;
			}
			
		}
		System.out.println(res.toString());
	}
}

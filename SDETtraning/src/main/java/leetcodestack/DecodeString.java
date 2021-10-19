package leetcodestack;

import java.util.Iterator;
import java.util.Stack;

public class DecodeString {
	
	public void test1() {
		String s = "3[a]2[bc]";
		decodeString(s);
	}

	private void decodeString(String s) {
		Stack<StringBuilder> str=new Stack<>();
		Stack<StringBuilder> num=new Stack<>();
		int count=0;
		StringBuilder result=new StringBuilder();
		for (int i = 0; i <s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				count=count*10+s.charAt(i)-'0';
			}else if(s.charAt(i)=='[') {
			//	StringBuilder tmp=
			}else if(s.charAt(i)==']') {
				
			}else {
				result.append(s.charAt(i));
			}
		}
		
	}

}

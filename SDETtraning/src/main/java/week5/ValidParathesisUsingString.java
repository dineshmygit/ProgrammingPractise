package week5;

import org.junit.Test;

public class ValidParathesisUsingString {

	@Test
	public void test1() {
		String s = "(a(b(c)d)";
		findValidParanthesis(s);

	}

	private void findValidParanthesis(String s) {
		StringBuilder sb=new StringBuilder();
		char[] arr=s.toCharArray();
		int openBraces=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]=='(') {
				openBraces++;
			}else if(arr[i]==')'){
				if(openBraces==0) 
					continue;
				openBraces--;
			}
			sb.append(arr[i]);
		}
		StringBuilder result=new StringBuilder();
		for (int j = sb.length()-1; j >=0; j--) {
			if(sb.charAt(j)=='(' && openBraces-->0) continue; 
			result.append(sb.charAt(j));
		}
		System.out.println(result.reverse());
	}
}


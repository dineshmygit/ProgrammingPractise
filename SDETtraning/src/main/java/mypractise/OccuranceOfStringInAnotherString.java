package mypractise;

import org.junit.Test;

public class OccuranceOfStringInAnotherString {
	@Test
	public void test1() {
		String s1="abcabdece";
		String s2="abc";
		findOccurance(s1,s2);
	}

	private void findOccurance(String s1, String s2) {
		char[] ch=s1.toCharArray();
		int i =0;
		String result;
		while(i<s1.length()) {
			StringBuilder sb=new StringBuilder();
			for (i = 0; i <s2.length(); i++) {
				sb.append(ch[i]);
			}
			if(sb.toString().equals(s2)) {
				System.out.println(sb.toString());
			}else {				
				i++;
			}
		}
	}

}

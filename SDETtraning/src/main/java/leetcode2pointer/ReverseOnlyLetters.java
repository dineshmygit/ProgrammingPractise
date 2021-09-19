package leetcode2pointer;

import java.util.Arrays;
import java.util.regex.Pattern;

import org.junit.Test;

public class ReverseOnlyLetters {
	//917. Reverse Only Letters
	/*Comments*/
	@Test
	public void test1() {
		String s="a-bC-dEf-ghIj";
		doReverseLetterWithoutConvertingToArray(s);
	}

	private String doReverseLetter(String s) {
		
		int start=0,end=s.length()-1;
		char[] ch = s.toCharArray();
		char tmp;
		if(s.isEmpty()) return "";
		else if(s.length()==1) return s;
		else {
			while(start<end) {
				if((Character.isAlphabetic(ch[start])) &&(Character.isAlphabetic(ch[end]))) {
					tmp=ch[end];
					ch[end]=ch[start];
					ch[start]=tmp;
					start++;
					end--;
				}else if(!(Character.isAlphabetic(ch[start])) &&(Character.isAlphabetic(ch[end]))) {
					start++;
				}else if((Character.isAlphabetic(ch[start])) &&!(Character.isAlphabetic(ch[end]))) {
					end--;
				}else {
					start++;
					end--;
				}
			}
		}
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < ch.length; i++) {
			sb.append(ch[i]);
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	private String doReverseLetterWithoutConvertingToArray(String s) {
		int start=0,end=s.length()-1;
		StringBuilder sb=new StringBuilder(s);
		while(start<end) {
			if(!Character.isAlphabetic(s.charAt(start))) start++;
			else if(!Character.isAlphabetic(s.charAt(end))) end--;
			else {
				sb.setCharAt(start, s.charAt(end));
				sb.setCharAt(end,s.charAt(start));
				start++;
				end--;
			}
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
}

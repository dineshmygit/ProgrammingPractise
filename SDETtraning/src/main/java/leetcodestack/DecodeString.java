package leetcodestack;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class DecodeString {
	@Test
	public void test1() {
		String s = "13[a]2[bc]";
		decodeStringRecurison(s);
		Assert.assertEquals(decodeString(s),"aaabcbc" );
	}

	private String decodeString(String s) {
		StringBuilder sb=new StringBuilder();
		sb.reverse();
		Stack<Integer> num=new Stack<>();
		Stack<StringBuilder> str=new Stack<>();
		int count=0;
		StringBuilder result=new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			//3[a]1 2[bc]
			if(Character.isDigit(s.charAt(i))) {
				count=10*count+s.charAt(i)-'0';
			}else if(s.charAt(i)=='[') {
				str.push(result);
				result=new StringBuilder();			
				num.push(count);
				count=0;
			}else if(s.charAt(i)==']') {
				StringBuilder tmp=new StringBuilder();
				tmp=str.pop();
				int count1=num.pop();
				for (int j = 0; j < count1; j++) {
					tmp.append(result);
				}
				result=tmp;
			}else {
				result.append(s.charAt(i));
			}
		}
		return result.toString();
	}
	public String decodeStringRecurison(String s) {
		if(!s.contains("]")) return s;
		int count=1;
		int nums=0;
		String digit="";
		String out="";
		int index2=s.indexOf(']');
		int index1=s.substring(0,index2).lastIndexOf('[');
		String subString=s.substring(index1+count, index2);
		
		while(index1-count>=0 && Character.isDigit(s.charAt(index1-count))) {
			nums=Character.isDigit(s.charAt(index1-count))?Character.getNumericValue(s.charAt(index1-count)):1;
			digit=s.substring(index1-count, index1);
			count++;
		}
		nums=Integer.parseInt(digit);
		index1=index1-count+2;
		while(nums>0) {
			out+=subString;
			nums--;
		}
		s=s.substring(0,index1-1)+out+s.substring(index2+1,s.length());
		return decodeStringRecurison(s);
	}
}
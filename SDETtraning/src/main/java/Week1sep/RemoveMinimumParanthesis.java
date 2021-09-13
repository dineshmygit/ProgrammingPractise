package Week1sep;

import java.util.Stack;

import org.junit.Test;

public class RemoveMinimumParanthesis {

	/*Comments*/
	@Test
	public void test1() {
		String s = "abc)a(c)e)de(";
		removeMinimumParenthesis(s);
	}
	@Test
	public void test2() {
		String s = "a(b(c)d";
		removeMinimumParenthesis(s);
	}
	@Test
	public void test3() {
		String s = "))((";
		removeMinimumParenthesis(s);
	}
	//abc(a(c)e)de)
	private void removeMinimumParenthesis(String s) {
		int count1=0,count2=0;
		for(Character c:s.toCharArray()) {
			if(c==')') count1++;
			if(c=='(') count2++;
		}
		if(count1==count2) {
			System.out.println(s);
		}else if(count1>count2) {
			//3-2=1
			int minDiff=count1-count2;
			char[] charArray = s.toCharArray();
			StringBuilder sb=new StringBuilder();
			for (int i = 0; i <charArray.length ; i++) {
				if(minDiff>0 && charArray[i]==')') {	
					minDiff--;
				}else {
					sb.append(charArray[i]);
				}
			}
			System.out.println(sb.toString());
		}else {
			int minDiff=count2-count1;
			char[] charArray = s.toCharArray();
			StringBuilder sb=new StringBuilder();
			for (int i = 0; i <charArray.length-1 ; i++) {
				if(minDiff>0 && charArray[i]=='(') {	
					minDiff--;
				}else {
					sb.append(charArray[i]);
				}
			}	
			System.out.println(sb.toString());
		}
	}
	private void removeMinimumParenthesisUsingStack(String s) {
		Stack<Integer> st=new Stack<Integer>();
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(st.isEmpty()) {
				if((charArray[i]==')')||(charArray[i]=='(')){
					st.push(i);
				}
			}else {
				if(charArray[i]=='('){
					st.push(i);				} 
			}
			if(charArray[i]==')') {
				if(st.peek()=='(') st.pop();
			}else {
				st.push(i);
			}
		}
	}
}
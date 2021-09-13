package week2sep;

import java.util.Stack;

import org.junit.Test;

public class ValidParanthesis {
	//20. Valid Parentheses
	/*Comments*/
	@Test
	public void test1() {
		String s="(])";
		findValidParanthesis(s);
	}

	@Test
	public void test2() {

	}

	@Test
	public void test3() {

	}
	private boolean findValidParanthesis(String s) {
		Stack<Character> st=new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(st.isEmpty()) st.push(s.charAt(i));
			else if(s.charAt(i)=='}' || s.charAt(i)==')' || s.charAt(i)==']'){
				if(s.charAt(i)=='}') {
					if(st.peek()=='{') {
						st.pop();
					} 
				}
				if(s.charAt(i)==')') {
					if(st.peek()=='(') {
						st.pop();
					}
				}
				if(s.charAt(i)==']'){
					if(st.peek()=='[') {
						st.pop();
					}
				}
			}else st.push(s.charAt(i));
		}
		if(st.isEmpty()) return true;
		else return false;
	}
}

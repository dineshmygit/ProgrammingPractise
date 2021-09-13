package Week1sep;

import java.util.Stack;

import org.junit.Test;

public class ValidParanthesis {
	/*Comments*/
	@Test
	public void test1() {
		String brackets= "{{()}}";
		validateParanthesis(brackets);

	}

	@Test
	public void test2() {

	}

	//@Test
	public void test3() {
		String brackets= "{{()}}";
		validateParanthesis(brackets);
	}

	private void validateParanthesis(String brackets) {
		char[] charArray = brackets.toCharArray();
		Stack<Character> s=new Stack<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if(s.isEmpty()) s.push(charArray[i]);
			else {
				if(charArray[i]=='}') s.pop();
				else if(charArray[i]==')') s.pop();
				else s.push(charArray[i]);
			}
		}
		if(s.size()==0) {
			System.out.println("Valid paranthesis");
		}else {
			System.out.println("invalid");
		}
		
	}
}

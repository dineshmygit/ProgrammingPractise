package Week6sep;

import java.util.Stack;

import org.junit.Test;

public class RemoveAdjacentDuplicatesInString {
	
	@Test
	public void test1() {
		String s ="deeedbbcccbdaa";
		int k=3;
		removeDuplicate(s,k);
	}

	@Test
	public void test2() {
		String s ="abcd";
		int k=2;
		removeDuplicate(s,k);
	}

	@Test
	public void test3() {
		String s ="deeedbbcccbdaad";
		int k=3;
		removeDuplicate(s,k);
	}
	/*Time complexity : O(n)
	 * Space complexity:O(n)
	 * */
	private void removeDuplicate(String s, int k) {
		Stack<Character> s1=new Stack<>();
		Stack<Integer> s2=new Stack<>();
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if(s1.isEmpty()) {
				s1.push(s.charAt(i));
				s2.push(1);
			}else {
				if((s1.peek()==s.charAt(i)) && !(s1.isEmpty())) {
					s1.push(s.charAt(i));
					s2.push(s2.peek()+1);
					if(s2.peek()==k) {
						int num=k;
						while(num>0) {
							s1.pop();
							s2.pop();
							num--;
						}
					}
				}else {
					s1.push(s.charAt(i));
					s2.push(1);
				}
			}
		}
		int length=s1.size();
		for (int i = 0; i < length; i++)
			sb.append(s1.pop());
		System.out.println(sb.reverse().toString());
	}
}

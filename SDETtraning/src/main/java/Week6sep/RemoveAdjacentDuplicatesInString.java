package Week6sep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class RemoveAdjacentDuplicatesInString {
	
	@Test
	public void test1() {
		String s ="deeedbbcccbdaa";
		int k=3;
		//removeDuplicate(s,k);
		findDuplicatesUsingMap(s,k);
	}

	@Test
	public void test2() {
		String s ="abcd";
		int k=1;
		//removeDuplicate(s,k);
		findDuplicatesUsingMap(s,k);
	}

	@Test
	public void test3() {
		String s ="deeedbbcccbdaad";
		int k=3;
		//removeDuplicate(s,k);
		findDuplicatesUsingMap(s,k);
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
	public void findDuplicatesUsingMap(String s,int k) {
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map     .getOrDefault(s.charAt(i), 0)+1);
			if(map.containsValue(k)) map.remove(s.charAt(i));
		}
		StringBuilder sb1=new StringBuilder();
		for(Map.Entry<Character,Integer>map2:map.entrySet()) {
		 int value=map2.getValue();
			while(value>0) {
				sb1.append(map2.getKey());
				value--;
			}
		}
		System.out.println(sb1);
	}
}

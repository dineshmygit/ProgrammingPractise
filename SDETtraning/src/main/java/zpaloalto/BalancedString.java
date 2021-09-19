package zpaloalto;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class BalancedString {
	/*Comments*/
	//@Test
	public void test1() {
		String s ="azABaabza";
		findBalancedStringSW(s);
	}

	//@Test
	public void test2() {
		String s ="TacoCat";
		findBalancedStringSW(s);
	}

	@Test
	public void test3() {
		String s ="abasdfghjkxcvbn";
		findBalancedStringSW(s);
	}

	private int findBalancedString(String s) {
		Set<Character> set=new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		for (int i = 0; i < s.length(); i++) {
			if(set.contains(Character.toUpperCase(s.charAt(i)))&&set.contains(Character.toLowerCase(s.charAt(i)))) {
				continue;
			}
			//azABaabza
			int s1 = findBalancedString(s.substring(0, i));
			int s2 = findBalancedString(s.substring(i+1));
			return s1>= s2? s1 : s2;
		}
		if(s.length()==0) return -1;
		else
			return s.length();
	}
	private int findBalancedStringSW(String s) {
		int first=0,second=0,max=0,count=0;
		Set<Character> set=new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		while(second<s.length()){
			if(set.contains(Character.toUpperCase(s.charAt(second)))&&set.contains(Character.toLowerCase(s.charAt(second)))) {
				second++;
				count++;
				if(max<count) max=count;
			}else {
				first=second+1;
				second=first;
				count=0;
			}
		}
		System.out.println(max);
		if(max==0 || max==1) return -1;
		else
		return max;
	}
}
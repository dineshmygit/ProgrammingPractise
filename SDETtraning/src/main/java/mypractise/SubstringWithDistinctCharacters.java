package mypractise;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SubstringWithDistinctCharacters {

	/*Comments*/
	@Test
	public void test1() {
		String s="xyzzaz";
		int size=3;
		findSubstring(s,size);
	}

	@Test
	public void test2() {

	}

	@Test
	public void test3() {
		String s="xyzzaz";
		int size=3;
		findSubstring(s,size);
	}

	private void findSubstring(String s, int size) {
		char[] data=s.toCharArray();
		int count=0;
		for (int i = 0; i <= data.length-size; i++) {
			Set<Character>set=new HashSet<Character>();
			for (int j = i; j < i+size; j++) {
				set.add(data[j]);
			}
			if(set.size()==size) {
				count++;
			}
		}
		System.out.println(count);
	}

	private void findSubstringSlidingWindow(String s, int size) {
		char[] data=s.toCharArray();
		int count=0;
		int left=0,right=0;
		for (int i = 0; i < size; i++) {
			Set<Character>set=new HashSet<Character>();
			set.add(data[i]);
			if(set.size()==size) {
				count++;
			}
		} 
		for (int i = 1; i < data.length-size; i++) {
			Set<Character>set1=new HashSet<Character>();
			set1.add(data[i]);
			
		}
		System.out.println(count);
	}
}

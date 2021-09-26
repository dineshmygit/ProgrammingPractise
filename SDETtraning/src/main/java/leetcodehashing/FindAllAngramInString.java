package leetcodehashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class FindAllAngramInString {
	/*Comments
	 * 438. Find All Anagrams in a String*/
	@Test
	public void test1() {
		String s = "abab", p = "ab";
		findAnagrams(s,p);
	}

	private List<Integer> findAnagrams(String s, String p) {
		int targetLen=p.length();
		char[] arrTarget=p.toCharArray();
        Arrays.sort(arrTarget);
        String target=new String(arrTarget);
        List<Integer> resultIndexes=new LinkedList<>();
		for (int i = 0; i <= s.length()-targetLen; i++) {
			List<String> result=new LinkedList<>();
			String s1=s.substring(i, i+targetLen);
			result.add(s1);
			char[] charArray = s1.toCharArray();
			Arrays.sort(charArray);
			String s2=new String(charArray);
			if(s2.equals(target)) {
				resultIndexes.add(i);
			}
		}
		System.out.println(resultIndexes);
		return resultIndexes;
	}
}

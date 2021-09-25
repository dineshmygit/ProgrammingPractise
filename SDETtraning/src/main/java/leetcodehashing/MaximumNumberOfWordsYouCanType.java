package leetcodehashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MaximumNumberOfWordsYouCanType {
	/*Comments*/
	@Test
	public void test1() {
		String text = "a b c d e", brokenLetters = "abcde";
		canBeTypedWords(text,brokenLetters);
	}
	//@Test
	public void test2() {
		String text = "hello world", brokenLetters = "ad";
		canBeTypedWords(text,brokenLetters);
	}

	private int canBeTypedWords(String text, String brokenLetters) {
		String[] split = text.split(" ");
		if(brokenLetters.length()==0) return split.length;
		else {
			List<String> ls=new ArrayList<>();
			for (int i = 0; i < split.length; i++) {
				ls.add(split[i]);
			}
			System.out.println(ls);
			Map<String,Integer> map = new HashMap<>();
			int j=0,count=0;
			while(j<brokenLetters.length()) {
				for (int i = 0; i < ls.size(); i++) {
					if(!ls.get(i).contains(brokenLetters.charAt(j)+"")) {
						map.put(ls.get(i),map.getOrDefault(ls.get(i), 0)+1);					
					}else {
						map.remove(ls.get(i));
						ls.remove(i);
					}
				}
				j++;
			}
			for(Map.Entry entry:map.entrySet()) {
				if((int)entry.getValue()!=0) {
					count++;
				}
			}
			System.out.println(count);
			return count;
		}
	}
	private int canBeTypedWords2(String text, String brokenLetters) {
		String[] split = text.split(" ");
		List<String> ls=new ArrayList<>();
		Set<Character> set =new HashSet<>();
		for (int i = 0; i < brokenLetters.length(); i++) {
			set.add(brokenLetters.charAt(i));
		}
		for (int i = 0; i < split.length; i++) {
			if(!split[i].contains(brokenLetters.charAt(i)+"")) {
				ls.add(split[i]);
			}
		}
		
		return 0;
	}
}

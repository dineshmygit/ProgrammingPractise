package leetcodehashing;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class FunAnagram {
	@Test
	public void test1() {
		List<String> text=new LinkedList<>();
		text.add("code");
		text.add("doce");
		text.add("ecod");
		text.add("framer");
		text.add("frame");
		findFunAnangram(text);
	}

	private void findFunAnangram(List<String> text) {
		Set<String> set=new LinkedHashSet<>();
		List<String> result=new LinkedList<>();
		for (int j = 0; j < text.size(); j++) {
			char[] arr=text.get(j).toCharArray();
			Arrays.sort(arr);
			String word = new String(arr);
			if(set.contains(word)) {
					continue;
			}else {
				set.add(word);
				result.add(text.get(j));
			}
		}
		System.out.println(result);
	}
}
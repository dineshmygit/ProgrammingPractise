package slidingwindowprograms;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class Permutation {
	/*Comments*/
	@Test
	public void test1() {
		String str="XYYZXZYZXXYZ";
		String target="XYZ";
		findPermutationIndex(str,target);
	}

	private void findPermutationIndex(String str, String target) {
		int start=0,end=target.length();
		Set<Character> set=new TreeSet<>();
		Set<Character> resultSet=new TreeSet<>();
		for (int i = 0; i < target.length(); i++) {
			set.add(str.charAt(i));
		}
		for (start = 0; start < str.length(); start++) {
			int count=0;
			while(count<target.length()) {				
			resultSet.add(str.charAt(end));
			count++;
			end++;
			}
			if(set.containsAll(resultSet)) {
				System.out.println(start);
			}
		}
	}
}
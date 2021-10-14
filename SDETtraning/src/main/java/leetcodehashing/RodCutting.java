package leetcodehashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RodCutting {
	//1 1 3 4
	public void test1() {
		List<Integer> ls=new LinkedList<>(Arrays.asList(1,1,3,4));
		findRods(ls);
	}

	private void findRods(List<Integer> ls) {
		Collections.sort(ls);
		for (int i = 0; i < ls.size(); i++) {
			int remainRod=ls.get(i);
			if(ls.get(i)>0) {
				
			}
			
			
		}
		
	}
}

package dunzo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class GeologicalSorting {
	/*Comments*/
	@Test
	public void test1() {
		List<Integer> ls1=new LinkedList<>();
		ls1.add(7000);
		ls1.add(13400);
		ls1.add(7000);
		ls1.add(14000);
		List<Integer> ls2=new LinkedList<>();
		ls2.add(7000);
		ls2.add(13400);
		ls2.add(150000);
		ls2.add(7000);
		sortIntersection(ls1,ls2);
	}

	private void sortIntersection(List<Integer> ls1, List<Integer> ls2) {
		Collections.sort(ls1);
		Collections.sort(ls2);
		int len=0;
		if(ls1.size()>=ls2.size()) {
			len=ls1.size();
		} else {
			len=ls2.size();
		}
		for (int i = 0; i < len; i++) {
		//	if()
		}
		
		
	}

	
}

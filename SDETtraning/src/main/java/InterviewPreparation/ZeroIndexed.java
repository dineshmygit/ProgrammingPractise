package InterviewPreparation;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class ZeroIndexed {
	
	/*Comments*/
	@Test
	public void test1() {
		int[] A= {1,7,2,0,4,5,0};
		Assert.assertEquals(findNumbers(A), false);
	}

	@Test
	public void test2() {

	}

	@Test
	public void test3() {
		int[] A= {1,2,4,0,0,7,5};
		findNumbers(A);
	}

	private boolean findNumbers(int[] a) {
		List<Integer> ls=new LinkedList<>();
		for (int i = 0; i < a.length; i++) {
			ls.add(a[i]);
		}
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < ls.size(); i++) {
			if(ls.get(i)==0) {
				sb.append(ls.get(i));
			}else if(ls.get(i)==7){
				sb.append(ls.get(i));
			}
		}
		if(sb.toString().equals("007")) return true;
		else
		return false;
	}
}

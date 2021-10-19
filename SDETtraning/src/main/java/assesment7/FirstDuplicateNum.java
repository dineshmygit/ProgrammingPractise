package assesment7;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class FirstDuplicateNum {
	@Test
	public void test1() {
		int[] arr= {4,1,2,9,1};
		Assert.assertEquals(findDuplicate(arr), 1);
		

	}

	private int findDuplicate(int[] arr) {
		Set<Integer> set=new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if(set.contains(arr[i])) {
				return arr[i];
			}else {
				set.add(arr[i]);
			}
		}
		return 0;
	}
}    
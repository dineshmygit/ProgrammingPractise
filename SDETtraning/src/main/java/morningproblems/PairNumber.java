package morningproblems;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class PairNumber {
	@Test
	public void test1() {
		int[] arr= {-10,-10};
		findPair(arr);

	}

	private void findPair(int[] arr) {
		int db=0;
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map);
		for(Map.Entry entry:map.entrySet()) {
			db+=(int)entry.getValue()/2;
		}
		System.out.println(db);
	}
}
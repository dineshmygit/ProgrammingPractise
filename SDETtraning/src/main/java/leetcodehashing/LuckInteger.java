package leetcodehashing;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class LuckInteger {
	/*Comments
	 * 1394. Find Lucky Integer in an Array
	 * */
	@Test
	public void test1() {
		int[] arr= {1,2,2,3,3,3};
		findLuckNumber(arr);
	}

	private int findLuckNumber(int[] arr) {
		int max=0;
		Map<Integer,Integer> map =new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		Collection<Integer> values = map.values();
		
		for(Map.Entry entry:map.entrySet()){
			if(entry.getKey()==entry.getValue()) {
				if((int)entry.getKey()>max) max=(int) entry.getKey();
			}
		}
		if(max>0) return max;
		else return -1;
	}


}

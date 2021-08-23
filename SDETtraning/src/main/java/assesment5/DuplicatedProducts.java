package assesment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class DuplicatedProducts {
	/*Comments*/
	@Test
	public void test1() {
		List<String> name=new ArrayList<String>();
		name.add("ball");
		name.add("bat");
		name.add("glove");
		name.add("glove");
		name.add("glove");
		List<Integer> price=new ArrayList<Integer>();
		price.add(2);
		price.add(3);
		price.add(1);
		price.add(2);
		price.add(1);
		List<Integer> weight=new ArrayList<Integer>();
		weight.add(2);
		weight.add(5);
		weight.add(1);
		weight.add(1);
		weight.add(1);
		int result=findDuplicate(name,price,weight);
	}

	private int findDuplicate(List<String> name, List<Integer> price, List<Integer> weight) {
		int duplicateCount =0;
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i =0;i<name.size();i++){
			String result=name.get(i) + " " + price.get(i)+ " " + weight.get(i);
			if(map.containsKey(result)) {
				map.put(result, map.get(result)+1);
				duplicateCount++;
			}else {
				map.put(result, 0);
			}
		}
		return duplicateCount;
	}
}

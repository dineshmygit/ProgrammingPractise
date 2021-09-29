package slidingwindowprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class DestinationCity {
	/*Comments*/
	@Test
	public void test1() {
		List<String> ls1=new LinkedList<>();
		ls1.add("London");
		ls1.add("New York");
		List<String> ls2=new LinkedList<>();
		ls2.add("New York");
		ls2.add("Lima");
		List<String> ls3=new LinkedList<>();
		ls3.add("Lima");
		ls3.add("Sao Paulo");
		List<List<String>> paths=new LinkedList<>();
		paths.add(ls1);
		paths.add(ls2);
		paths.add(ls3);
		findDestinationMap(paths);

	}

	private void findDestination(List<List<String>> paths) {
		//=====
		String result="";
		for (int i = 0; i < paths.size(); i++) {
			int count=0;
			for (int j = 0; j < paths.size(); j++) {
				if(paths.get(j).contains(paths.get(i).get(1))) {
					count++;
				}
			}
			if(count==1) {
				result=paths.get(i).get(1);
			}
		}
		System.out.println(result);
	}
	private void findDestinationMap(List<List<String>> paths) {
		String result="";
		Map<String,Integer> map=new HashMap<>();
		for (int i = 0; i < paths.size(); i++) {
			map.put(paths.get(i).get(0), map.getOrDefault(paths.get(i).get(0), 0)+1);
		}
		for (int i = 0; i < paths.size(); i++) {
			if(!map.containsKey(paths.get(i).get(1))) {
				result=paths.get(i).get(1);
			}	
		}
		System.out.println(result);
	}

}

package template;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class LogicCheck {

	@Test
	public void calculation() {
		int arr[]= {4,5,5,6,6,6};
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) 
				map.put(arr[i], map.get(arr[i])+1);
			else 
				map.put(arr[i],1);
		}
		System.out.println(map);
		Set<Integer> dup1 = new LinkedHashSet<Integer>();
		Set<Integer> dup2 = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			//removing dup from array
			dup1.add(arr[i]);
			//Add map to set to remove duplicate of map value
			dup2.add(map.get(arr[i]));
		}
		//compare the size of list and set
		/*
		 * {4=1, 5=1, 6=3} [4, 5, 6] [1, 3]
		 */
		/*
		 * {4=1, 5=2, 6=3} [4, 5, 6] [1, 2, 3]
		 */
		if(dup1.size()==dup2.size()) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}
	}

}

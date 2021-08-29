package assesment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ReverseArrayQueries {
	/*Comments*/
	@Test
	public void test1() {
		List<Integer> arr=Arrays.asList(5,3,2,1,3);		
		List<List<Integer>>operation =Arrays.asList((Arrays.asList(0,1)),(Arrays.asList(1,3)));
		findReverseOrder(arr,operation);
	}
	@Test
	public void test2() {
		List<Integer> arr=Arrays.asList(1,2,3);		
		List<List<Integer>>operation =Arrays.asList((Arrays.asList(0,2)),(Arrays.asList(1,2)),(Arrays.asList(0,2)));
		findReverseOrder(arr,operation);
	}

	private List<Integer> findReverseOrder(List<Integer> arr, List<List<Integer>> operation) {
		for (int i = 0; i < operation.size(); i++) {
			int start=operation.get(i).get(0);
			int end=operation.get(i).get(1);
			List<Integer> result=reverseArray(arr,start,end);
			arr=result;
		}
		System.out.println(arr);
		return arr;
	}

	private List<Integer> reverseArray(List<Integer> arr, int start, int end) {
		List<Integer> reverseList=new ArrayList<Integer>();
		for (int i = 0; i < arr.size(); i++) {
			if(i==start) {
				for (int j = end; j>=start ; j--) {
					reverseList.add(arr.get(j));
					i=end;
				}
			}else {
				reverseList.add(arr.get(i));
			}
		}
		return reverseList;
	}
}
package InterviewPreparation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class FizzBuzz {

	/*Comments
	 * constraint : two pointer,hashmap
	 * given: int 
	 * return : string array
	 * 
	 * 1.Iterate through loop of number till given n;
	 * 2.use two pointers first and last
	 * create a map 
	 * iterate the numbers as value and if condition satisfy make it as a key 
	 * Get the value in array
	 * 
	 *Analysis : 5 mins
	 *psedo code: 5
	 *implementaion:15
	 * */
	@Test
	public void test1() {
		int n=3;
		findFizzBuzz(n);
	}
	@Test
	public void test2() {
		int n=5;
		findFizzBuzz(n);
	}
	@Test
	public void test3() {
		int n = 15;
		findFizzBuzz(n);
	}
	private void findFizzBuzz(int n) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		for (int i = 1; i <= n; i++) {
			if(i%3==0 && i%5==0) map.put(i, "FizzBuzz");
			else if(i%3==0) map.put(i, "Fizz");
			else if(i%5==0) map.put(i, "Buzz");
			else map.put(i, Integer.toString(i));
		}
		String[] arr=new String[n];
		int i=0;
		Iterator<Integer> it=map.keySet().iterator();
		for (Map.Entry<Integer,String> entry : map.entrySet())   
			arr[i++]=entry.getValue();
		System.out.println(Arrays.toString(arr));
	}
}

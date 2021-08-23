package InterviewPreparation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class StringCount {
	/*Comments
	 * Get the Ascii value from a to z in a map
	 *if value exist from the string continously keep updating map 
	 *get the value for the repeted char and return in an array
	 * 
	 * Analysis - 5min
	 * pseduo code-5mins
	 * 
	 * */
	@Test
	public void test1() {
		String input="abbbccaadf";
		int[] target= {4,2,5,3,7};
		int num=5;
		findCountOther(input,target,num);
	}

	@Test
	public void test2() {

	}

	@Test
	public void test3() {
		String input="abbccaadf";
		int[] target= {4,2,5,3,7};
		int num=5;
		findCountOther(input,target,num);
	}

	private void findCount(String input, int[] target, int num) {
		char[] arr=input.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i]))
				map.put(arr[i],(arr[i]-'a')+1);
		}
		//abbccaadf
		int first=0,second=1;
		int count=1;
		Map<Character,Integer> mapResult=new HashMap<Character,Integer>();
		while(second<arr.length) {
			if(arr[first]!=arr[second]) {
				first++;
				second++;
			}else {
				count++;
				mapResult.put(arr[first],map.get(arr[first])*count);
				first++;
				second++;
			}
			count=1;
		}
		String[] arrStr=new String[target.length];
		for (int i = 0; i < target.length; i++) {
			if(mapResult.containsValue(target[i]) || map.containsValue(target[i])) {
				arrStr[i]="True";
			}else {
				arrStr[i]="False";
			}
		}
	}
	private void findCountOther(String input, int[] target, int num) {
		char[] arr=input.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i]))
				map.put(arr[i],(arr[i]-'a')+1);
		}
		//abbbccaadf
		int first=0,second=1;
		int count=1;
		Map<Character,Integer> mapResult=new HashMap<Character,Integer>();
		while(second<arr.length) {
			if(arr[first]!=arr[second]) {
				count=1;
				second++;
				first=second-1;
			}else {		
				count++;
				mapResult.put(arr[first],map.get(arr[first])*count);
				second++;
			}
		}
		String[] arrStr=new String[target.length];
		for (int i = 0; i < target.length; i++) {
			if(mapResult.containsValue(target[i]) || map.containsValue(target[i])) {
				arrStr[i]="True";
			}else {
				arrStr[i]="False";
			}
		}
	}
}

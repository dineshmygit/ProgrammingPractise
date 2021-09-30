package InterviewPreparation;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class NonRepeatingNumber {
	/*Comments
	 * input:int[]
	 * output:int
	 * 
	 * */
	@Test
	public void test1() {
		int[] nums= {1,2,1,3,2};
		findNonRepeatingNumberMap(nums);
	}

	//@Test
	public void test2() {
		int[] nums= {1,2,1,2};
		findNonRepeatingNumber(nums);
	}

	//@Test
	public void test3() {
		int[] nums= {1,2,3,4,5};
		findNonRepeatingNumber(nums);
	}
	/*Iterate through the array 
	 * check for target is present is array
	 * if present continue, if not present return the number
	 * */
	private int findNonRepeatingNumber(int[] nums) {
		//1,2,1,3,2
		int count=1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(i!=j && nums[i]==nums[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(nums[i]);
				return nums[i];
			}else count=1;
		}
		return -1;
	}
	private int findNonRepeatingNumberMap(int[] nums) {
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		for(Map.Entry entry:map.entrySet()) {
			if((int)entry.getValue()==1) {
				System.out.println(entry.getKey());
				return (int)entry.getKey();
			}
		}
		return -1;
	}

}

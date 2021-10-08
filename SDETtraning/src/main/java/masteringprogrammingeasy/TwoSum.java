package masteringprogrammingeasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum {

	@Test
	public void test1() {
		int[] nums= {2,7,11,15};
		int target =9;
		Assert.assertTrue(Arrays.equals(findTwoSumIndex(nums,target), new int[] {0,1}));
	}

	private int[] findTwoSumIndex(int[] nums,int target) {
		/*find the diff sum from targer
		 * iterate through map and check diff is present
		 * if present return the index 
		 * else insert value as key and index as value
		 * */
		Map<Integer, Integer> map=new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				return new int[] {map.get(target-nums[i]),i};
			}
			map.put(nums[i], i);
		}
		return new int[0] ;
	}

}

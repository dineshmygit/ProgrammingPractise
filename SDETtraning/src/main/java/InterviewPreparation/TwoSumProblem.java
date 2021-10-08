package InterviewPreparation;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class TwoSumProblem {

	/*Comments*/
	@Test
	public void test1() {
		int[] nums= {2,7,11,15};
		int k=9;
		System.out.println(Arrays.toString(findTwoSumTwoPointerMap(nums,k)));
	}

	@Test
	public void test2() {

	}

	@Test
	public void test3() {

	}
	/*-1,-2,0,4 k=-2
	 * Iterate through array
	 * add two numbers check it is equal or not
	 * if equal return index
	 * */
	private int[] findTwoSum(int[] nums,int k) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==k) {
					System.out.println(i+"-"+j);
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}
	//-1,-2,0,4
	private int[] findTwoSumTwoPointer(int[] nums,int target) {
		int i = 0, j = nums.length-1, temp1 = 0, temp2 = 0, k = 0;

		int[] arr = new int[nums.length];
		for(int l=0; l<nums.length; l++) {
			arr[k++] = nums[l];
		}

		Arrays.sort(arr);
		while(i < j) {
			if(arr[i]+arr[j] == target) {
				temp1 = arr[i];
				temp2 = arr[j];
			}
			if(arr[i]+arr[j] < target)
				i++;
			else
				j--;
		}

		k=0;
		int[] res = new int[2];
		for(int l=0; l<nums.length; l++) {
			if(temp1 == nums[l] || temp2 == nums[l])
				res[k++] = l;
		}
		System.out.println(Arrays.toString(res));
		return res;
	}
	private int[] findTwoSumTwoPointerMap(int[] nums,int target) {
		Map<Integer,Integer> map = new LinkedHashMap<>();
		System.out.println(map.size());
        for(int i=0; i<nums.length;i++){
            int value=target-nums[i];
            if(map.containsKey(value)){
                return new int[] {map.get(value),i};
            }else{
                 map.put(nums[i],i); 
            }
        }
        return new int[] {};
	}     
}

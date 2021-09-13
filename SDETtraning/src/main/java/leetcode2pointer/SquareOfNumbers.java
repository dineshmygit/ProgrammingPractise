package leetcode2pointer;

import java.util.Arrays;

import org.junit.Test;

public class SquareOfNumbers {
	/*Comments*/
	@Test
	public void test1() {
		int[] nums= {-4,-1,11,3,10};
		findSquareWithoutSort(nums);
	}

	@Test
	public void test2() {

	}

	@Test
	public void test3() {

	}

	private void findSquare(int[] nums) {
		int left=0,right=nums.length-1;
		int[] result=new int[nums.length];
		while(left<=right){
			result[left]=nums[left]*nums[left];
			if(left==right) break;
			result[right]=nums[right]*nums[right];
			left++;
			right--;
		}
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
		//return result;
	}
	private void findSquareWithoutSort(int[] nums) {
		int left=0,right=nums.length-1,i=nums.length-1;
		int[] result=new int[nums.length];
		while(i>=0){
			if(nums[left]*nums[left] > nums[right]*nums[right]){
				result[i--] = nums[left]*nums[left];
				left++;
			}else{
				result[i--] = nums[right]*nums[right];
				right--;
			}
		}     
		System.out.println(Arrays.toString(result));
		//return result;
	}
}

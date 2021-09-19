package week7sep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SortColors {
	//75. Sort Colors
	/*Comments*/
	@Test
	public void test1() {
		int[] nums= {2,0,2,1,1,0};
		findColorsSecMethod(nums);
	}

	@Test
	public void test2() {

	}

	@Test
	public void test3() {

	}
	private void findColors(int[] nums) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		//map.con
		List<Integer>l1=new ArrayList<Integer>();
		List<Integer>l2=new ArrayList<Integer>();
		List<Integer>l3=new ArrayList<Integer>();
		List<Integer>result=new LinkedList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) {
				l1.add(nums[i]);
			}else if(nums[i]==1) {
				l2.add(nums[i]);
			}else {
				l3.add(nums[i]);
			}
		}
		result.addAll(l1);
		result.addAll(l2);
		result.addAll(l3);
		for (int i = 0; i < nums.length; i++) {
			nums[i]=result.get(i);
		}
	}
	private void findColorsSecMethod(int[] nums) {
		int red=0,blue=0,green=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==0) red++;
			else if(nums[i]==1) blue++;
			else green++;
		}
		for (int i = 0; i < nums.length; i++) {
			if(red>0) {
				nums[i]=0;
				red--;
			}else if(blue>0) {
				nums[i]=1;
				blue--;
			}else {
				nums[i]=2;
				green--;
			}
		}
		
	}
}

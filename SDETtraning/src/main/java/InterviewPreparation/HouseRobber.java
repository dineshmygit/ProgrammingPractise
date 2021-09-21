package InterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class HouseRobber {
	/*Comments*/
	@Test
	public void test1() {
		int[] nums= {2,1,1,2};
		robMaxMoney(nums);
	}

//	@Test	
	public void test2() {
		int[] nums= {2,7,9,3,1};
		robMaxMoney(nums);
	}

	private int robMaxMoney(int[] nums) {
	// find max
		int max=0;
		// Add in list
		List<Integer> ls = new ArrayList<>();
		List<Integer> lsNS = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			ls.add(nums[i]);
			lsNS.add(nums[i]);
		}
		Collections.sort(ls);
		max=ls.get(ls.size()-1);
		for (int i = 0; i < lsNS.size(); i++) {
			if(lsNS.contains(max)) {
				
			}
		}
		return 0;
		
	}
	
	public void removeAdj(List<Integer>ls,int max) {
		
	}
}

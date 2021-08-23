package InterviewPreparation;

import org.junit.Test;

import junit.framework.Assert;

public class TrappingRainWater {
	/*Comments
	 * input : int[]
	 * output : int
	 * constrain :
	 * Approach:two pointer uni directional
	 * 
	 * 
	 * 
	 * */
	@Test
	public void test1() {
		int[] height= {0,1,0,2,1,0,1,3,2,1,2,1};
		Assert.assertEquals(findTrap(height), 6);
	}

	@Test
	public void test2() {
		int[] height= {4,2,0,3,2,5};
		Assert.assertEquals(findTrap(height), 9);
	}

	/* 
	 * Init two pointers left=0 and  right=left+1, sum =0
	 * iterate through the height until right reaches length
	 * compare value at left and right index
	 * if value at right is greater than left then left =right++ 
	 * if right is less than left then update the sum(diff of values) and right++
	 *  if right reaches length , break
	 *  */
	private int findTrap(int[] height) {
		int left=0,right=left+1,sum=0;
		while(right<height.length) {
			if(height[right]>height[left]) {
				if(left!=0) 
					sum+=height[right]-height[right-1];
				left=right++;
			}else if(height[right]<height[left]) {
				sum+=height[right++]-height[left];
			}else {
				left++;
				right++;
			}
		}

		return sum;
	}
}

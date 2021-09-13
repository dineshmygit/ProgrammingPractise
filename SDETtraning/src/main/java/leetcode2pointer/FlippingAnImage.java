package leetcode2pointer;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class FlippingAnImage {
	//832. Flipping an Image
	/*iterate through array
	 * constrain : use 2 pointer
	 * left=0 and right=length-1
	 * flip where 0=1,1=0
	 * reverse and send    
	 * */
	/*Comments*/
	@Test
	public void test1() {	
		int[][] image= {{1,1,0},{1,0,1},{0,0,0}};
		//int[][] result = findFlip(image);
	//	Assert.assertEquals(result, new int[][] {{1,0,0},{0,1,0},{1,1,1}});
		//Assert.assertEquals(new int[][] {{1,0,0},{0,1,0},{1,1,1}}, result);
		Assert.assertTrue(Arrays.equals(findFlip(image), new int[][] {{1,0,0},{0,1,0},{1,1,1}}));
	}
    //[[1,0,0],[0,1,0],[1,1,1]]
	/*Time complexity:O(n*m)
	 * Space complexity: O(1)
	 * */
	private int[][] findFlip(int[][] image) {
		int left=0,right=0,tmp=0;
		for (int i = 0; i < image.length; i++) {
			left=0;
			right=image[i].length-1;
				while(left<=right) {	
					if(image[i][right]==0) image[i][right]=1;
					else image[i][right]=0;
					if(left==right) break;
					if(image[i][left]==0) image[i][left]=1;
					else image[i][left]=0;
					tmp=image[i][right];
					image[i][right]=image[i][left];
					image[i][left]=tmp;
					left++;
					right--;
				}
			}
		System.out.println(Arrays.deepToString(image));
		return image;
	}
}


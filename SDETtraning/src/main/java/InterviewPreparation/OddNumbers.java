package InterviewPreparation;

import org.junit.Assert;
import org.junit.Test;

public class OddNumbers {
	
	/*Comments*/
	//@Test
	public void test1() {
		int[] A= {2,-1};
		Assert.assertEquals(oddNumber(A), true);
	}

	@Test
	public void test2() {
		int[] A= {-1,-3,4,7,7,7};
		Assert.assertEquals(oddNumber(A), false);
	}

	//@Test
	public void test3() {

	}
	 public boolean oddNumber(int[] arr)
	    {
		 int n=arr.length;
	        if (n % 2 == 1)
	            return false; 
	        // Initialize count of odd & even
	        int odd_count = 0, even_count = 0;
	        for (int i = 0; i < n; i++)
	        {
	            if (arr[i] % 2 == 0)
	            	even_count++;
	            else            
	            odd_count++;
	        }
	        if (even_count - odd_count == 0)
	        {
	            return true;
	        }
	        return false;
	    }
	}
package assesment3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class KsubArray {
	/*Comments*/
	@Test
	public void test1() {
		int k=5;
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(15);
		nums.add(5);
		nums.add(45);
		nums.add(15);
		nums.add(7);
		nums.add(8);
		nums.add(10);
		//6
		findKarray(k,nums);
	}

	private void findKarray(int k, List<Integer> nums) {
		int count=0;
		int sum=0;
		int add=0;
		for (int i = 0; i < nums.size(); i++) {

			if(nums.get(i)%k==0) {
				count++;
			}
			//15,5,45,15,7,8,10
			sum=nums.get(i);
			for (int j = i+1; j < nums.size(); j++) {
				sum+=nums.get(j);
				if((sum%5)==0) {
					count++;
				}
			}
			sum=0;
		}
	}
}

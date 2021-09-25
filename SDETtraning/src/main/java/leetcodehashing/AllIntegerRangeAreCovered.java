package leetcodehashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class AllIntegerRangeAreCovered {
	@Test
	public void test1() {
		int[][] ranges = {{1,50}};
		int left = 1, right = 50;
		isCovered(ranges,left,right);
	}

	public boolean isCovered(int[][] ranges, int left, int right) {
		List<Integer> ls=new ArrayList<>();
			for(int j=0;j<=right;j++){
				ls.add(j);
		}
		for(int i=left;i<=right;i++){
			if(!ls.contains(i))
				return false;
		}
		return true;

	}    
	 public boolean isCoveredOne(int[][] ranges, int left, int right) {
	        HashSet<Integer> hs = new HashSet<>();
	        
	        for(int[] range: ranges){
	            for(int i=range[0]; i<=range[range.length-1]; i++)
	                hs.add(i);
	        }
	        for(int i=left; i<=right; i++){
	            if(!hs.contains(i))
	                return false;
	        }
	        return true;
	    }
}

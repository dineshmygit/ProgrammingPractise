package Week4;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestConsecutiveSequenceHashSet {
	@Test
	public void test1() {
		int[] data= {100,4,200,1,3,2};//1 2 3 4
		int result=findConecutiveSeq(data);
	}

	private int findConecutiveSeq(int[] data) {
		Set<Integer>set=new HashSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			set.add(data[i]);
		}
		int count=0;
		for (int i = 0; i < data.length; i++) {
			if(!set.contains(data[i]-1)) {
				int currentNum=data[i];
				int currentLength=1;
				while(set.contains(currentNum+1)) {
					currentNum+=1;
					currentLength+=1;
				}
				count=Math.max(count, currentLength);
			}
		}
		System.out.println(count);
		return count;
	}
}

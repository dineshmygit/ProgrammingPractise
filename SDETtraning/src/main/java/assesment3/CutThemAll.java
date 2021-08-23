package assesment3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CutThemAll {
	/*Comments*/
	@Test
	public void test1() {
		int n=3;
		List<Integer> lengths=new ArrayList<Integer>();
		lengths.add(4);
		lengths.add(2);
		lengths.add(3);
		long minLength=7;
		System.out.println(findLength(lengths,minLength));

	}

	private String findLength(List<Integer> lengths, long minLength) {
		int sum=0;
		int sum2=0;
		for (int i = 0; i < lengths.size(); i++) {
			sum+=lengths.get(i);
		}
		for (int i = 0; i < 2; i++) {
			sum2+=lengths.get(i);
		}
		int result=sum-sum2;
		if(sum2>=minLength ) {
			return "possible";
		}else {
			return "impossible";
		}
	}
}

package assesment3;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class ProgrammingContest {
	@Test
	public void test1() {	
		int n=4;
		int[] ratings= {4,2,5,1};
		findContest(n,ratings);
	}

	private void findContest(int n, int[] ratings) {
		Arrays.sort(ratings);
		int min=0;
		int diff=0;
		for (int i = 0; i < n; i++) {
			min=ratings[i+1]-ratings[i];
			diff+=min;
			i++;
		}
	}

}

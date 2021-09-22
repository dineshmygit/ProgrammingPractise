package leetcodehashing;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class PathCrossing {
	/*Comments
	 * 1496. Path Crossing
	 * */
	@Test
	public void test1() {
		String path=  "NNSWWEWSSESSWENNW";
		isPathCrossing(path);
	}

	private boolean isPathCrossing(String path) {
		Map<Character,Integer> map=new HashMap<>();
		int countS=0,countH=0, result=0;
		for (int i = 0; i < path.length(); i++) {
			if(path.charAt(i)=='N') {
				map.put('N', map.getOrDefault('N', 0)+1);
			}
			else if(path.charAt(i)=='S') {
				map.put('S', map.getOrDefault('S', 0)+1);
			}else if(path.charAt(i)=='E') {
				map.put('E', map.getOrDefault('E', 0)+1);
			}else {
				map.put('W', map.getOrDefault('W', 0)+1);
			}
		}
		System.out.println(map);
		return false;
	}
}

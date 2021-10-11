package Java8Practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class StreamPractise {
	
	@Test
	public void test1() {
		List<String> lsTeams=Arrays.asList("csk","dc","kkr","rcb");
		//assume map name,age string,integer emp,find no of emp 
		//shose age is greate rthan 30
		Map<String,Integer> emp=new HashMap<>();
		emp.put("dinesh", 27);
		emp.put("kumar", 31);
		emp.put("anand", 33);
		emp.put("sri", 29);
		System.out.println(emp.entrySet().stream().filter(age->age.getValue()>30).count());
		emp.entrySet().stream().filter(age->age.getValue()>30).forEach(entry->System.out.println(entry.getKey()));
		
	}

}

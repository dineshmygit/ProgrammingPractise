package Assesment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class problem2 {

	@Test
	public void test1() {
		List<String> ls=new ArrayList<String>();
		ls.add("bin");
		ls.add("can");
		ls.add("can");
		ls.add("can");
		groupingTransaction(ls);
		
	}
	@Test
	public void test2() {
		
	}
	
 	public void groupingTransaction(List<String> transactions) {
		      Map<String,Integer>map=new LinkedHashMap<String,Integer>();
		         for (int i = 0; i < transactions.size(); i++) {
		             if(map.containsKey(transactions.get(i))){
		                 map.put(transactions.get(i), map.get(transactions.get(i))+1);
		             }else{
		                 map.put(transactions.get(i), 1);
		             }
		         }
		        //StringBuilder sb=new StringBuilder();
		      List<String> ls1=new ArrayList<String>();
		        for(Map.Entry<String, Integer> value :map.entrySet()){
		            String key=value.getKey();
		            Integer valueKey=value.getValue();
		            String str=key.concat(" ").concat(valueKey.toString());
		            ls1.add(str);
		        }
		        //   Collections.reverse(ls1);
		        System.out.println(ls1);
		        
		 //   return ls1;
		    }
	}


package assesment5;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ConferanceSchedule {
	//@Test
	public void test1() {
		int[] scheduleStart= {1,1,2};
		int[] scheduleStop=  {3,2,4};
		findConferanceSchedule(scheduleStart,scheduleStop);
	}
	//@Test
	public void test2() {
		int[] scheduleStart= {1,1,2,3};
		int[] scheduleStop=  {2,3,3,4};
		findConferanceSchedule(scheduleStart,scheduleStop);
	}
	@Test
		public void test3() {
			int[] scheduleStart= {1,1,2};
			int[] scheduleStop=  {3,4,4};
			findConferanceSchedule(scheduleStart,scheduleStop);
		}

	/*
	 * Iterate throught both the given array
	 * initialize new array sub and find both the array and store in new array
	 * Declare a Map, with start time as key 
	 * insert the meeting time as value 
	 * return the size of the map
	 * */
	private void findConferanceSchedule(int[] scheduleStart, int[] scheduleStop) {
		int[] meetingHour=new int[scheduleStart.length];
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int firstMeetingStart=scheduleStart[0];
		int firstMeetingEnd=scheduleStop[0];
		int result=0;
		for (int i = 0; i < scheduleStop.length; i++) {
			meetingHour[i]=scheduleStop[i]-scheduleStart[i];
		}
		for (int i = 0; i < scheduleStart.length; i++) {
			if(map.containsKey(scheduleStart[i])) {
				if(!(map.get(scheduleStart[i])<scheduleStop[i])){
					map.put(scheduleStart[i], scheduleStop[i]);	
					firstMeetingEnd=scheduleStart[i];
				}		
			}else {
				if(firstMeetingEnd<=scheduleStart[i]) {
					map.put(scheduleStart[i], scheduleStop[i]);	
					firstMeetingEnd=scheduleStop[i];
				}
			}
		}
		result=map.size();
		System.out.println(result);
	}
}

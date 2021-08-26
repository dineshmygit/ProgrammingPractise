package assesment5;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

import org.junit.Test;

public class MeetingRoom {

	/*Comments*/
	@Test
	public void test1() throws ParseException {
		String[][] meetingTimes = 
			{{"09 00", "09 45"},
					{"09 30", "10 30"},
					{"10 40", "12 00"},{"11 00", "13 00"},
					{"11 45", "14 00"},{"16 00", "17 00"}};
		findNumberOfRooms(meetingTimes);
	}

	//@Test
	public void test2() throws ParseException {
		String[][] meetingTimes = 
			{{"09 00", "09 45"},
					{"09 45", "10 30"},
					{"10 40", "12 00"},{"11 00", "13 00"},
					{"11 45", "14 00"},{"16 00", "17 00"}};
		findNumberOfRooms(meetingTimes);
	}

//	@Test
	public void test3() throws ParseException {
		String[][] meetingTimes = 
			{{"09 00", "09 45"},
					{"09 45", "10 30"},
					{"10 30", "12 00"}};
		findNumberOfRooms(meetingTimes);
	}

	/* Input:string two dim array
	 * output: int
	 * Covert string 2-array to date two dimensional array
	 * 
	 *  */
	private int findNumberOfRooms(String[][] meetingTimes) throws ParseException {
		Arrays.sort(meetingTimes, new Comparator<String[]>() { // sort the array
			SimpleDateFormat f = new SimpleDateFormat("HH mm");
			// SimpleDateFormat  to parse the String Date
			@Override
			public int compare(String[] o1, String[] o2) {
				try {
					return f.parse(o1[0]).compareTo(f.parse(o2[1]));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return -1;
			}
		});
		int count=meetingTimes.length;
		for (int i = 0; i < meetingTimes.length; i++) {
			SimpleDateFormat f = new SimpleDateFormat("HH mm");
			if(f.parse(meetingTimes[i][1]).compareTo(f.parse(meetingTimes[i][0]))>=0) {
				count--;
			}
		}
		System.out.println(count);
		return count;
	}
	
	/* 
	 * 
	 * */
	private int findNumberOfRoomsNew(String[][] meetingTimes) throws ParseException {
		Arrays.sort(meetingTimes, new Comparator<String[]>() { // sort the array
			SimpleDateFormat f = new SimpleDateFormat("HH mm");
			// SimpleDateFormat  to parse the String Date
			@Override
			public int compare(String[] o1, String[] o2) {
				try {
					return f.parse(o1[0]).compareTo(f.parse(o2[1]));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return -1;
			}
		});
		int count=meetingTimes.length;
		for (int i = 0; i < meetingTimes.length; i++) {
			SimpleDateFormat f = new SimpleDateFormat("HH mm");
			if(f.parse(meetingTimes[i][1]).compareTo(f.parse(meetingTimes[i][0]))>=0) {
				count--;
			}
		}
		System.out.println(count);
		return count;
	}
}
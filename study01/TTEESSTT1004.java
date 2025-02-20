package study01;

import Calendar_250219.Test3_1;

public class TTEESSTT1004 {
	
	public static void main(String[] args) {
		
		String d1 = "2025-08-31";
		String d2 = "2025-08-07";

		long t1 = Test3_1.myDateUnixTime(d1);
		long t2 = Test3_1.myDateUnixTime(d2);
		
		long min = t2 - t1;
		int result = (int)(min/(60*60*24));
		
		result = Math.abs(result);
		
		System.out.println(result);
	}
}

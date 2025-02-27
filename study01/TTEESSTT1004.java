package study01;

import Calendar_250219.MyCalendar;
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
		System.out.println("=======================");
		
		
		
		
		
		String[] dates = {"2025-01-01","2025-01-05"};
		//static 붙어있을때
		System.out.println(MyCalendar.dateDif2(dates[0], dates[1]));
		//static 없을때
		MyCalendar mc = new MyCalendar();
		System.out.println(mc.dateDif2(dates[0], dates[1]));
		
		System.out.println("=======================");
		
		
		
		long a1 = 10000000000L;
		long a2 = 6974L;
		int a3 = (int)((a1-a2)/1000);	//정상
		int a4 = (int)(a1-a2/1000);		//비정상
		//형변환을 우선처리하고 나누기처리
		int a5 = (int)(a1-a2)/1000;		//비정상
		System.out.println(a3 + "\n" + a4 + " \n" + a5);
		
	}
}

package lambda;

import java.util.Calendar;

/*
 * 두 날짜의 차이
 */
interface DatesInterface {
	public int method(String date1, String date2);
}

interface DateUnixTime {
	public long method(String date);
}
public class Dates {
	
	public static void main(String[] args) {
		
		DateUnixTime unix =(date)-> {
			Calendar cal = Calendar.getInstance();
			
			String[] str = date.split("-");
			// String -> Integer
			int yy = Integer.parseInt(str[0]);
			int mm = Integer.parseInt(str[1]);
			int dd = Integer.parseInt(str[2]);
			cal.set(yy,(mm-1),dd);
			// 특정날짜의 유닉스시간
			return cal.getTimeInMillis();	
		};
		
		DatesInterface df =(date1, date2)-> {
			long d1 = unix.method(date1)/1000;
			long d2 = unix.method(date2)/1000;
			
			long minus = d2 - d1;
			int result = (int)(minus/(60*60*24));
			result = Math.abs(result);	//절대값
			
			return result;
		};
		String d1 = "2025-03-06";
		String d2 = "2025-03-20";
		int ret = df.method(d1,d2);
		System.out.println(d1 + ", " + d2 + " 날짜차이 : " + ret);
	}

}

package Calendar_250219;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2025,11,25);
		
		Date date = cal.getTime();
		
		//Date date = new Date();
		System.out.println(date);
		
		// 2025.27.20(목)__4:27:19
		//String pattern = "y.m.d(E)__h:m:s";
		// 올해의 몇번째 날인가 : 51
		//String pattern = "올해의 몇번째 날인가 : D";
		// AD 25/02 20 (오후)04:25:38
		String pattern = "G y/MM/dd (a)hh:mm:ss";
		SimpleDateFormat simple = new SimpleDateFormat(pattern);
		System.out.println(simple.format(date));
		
		
	}
	
}

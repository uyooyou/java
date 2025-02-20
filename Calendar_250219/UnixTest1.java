package Calendar_250219;

import java.util.Calendar;

public class UnixTest1 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2025,11,25);
		
		long unixTime = cal.getTimeInMillis();
		int time = (int)(unixTime/1000);
		
		System.out.println(unixTime);
		System.out.println(time);
		
		//유닉스시간에 맞는 날짜 출력
		//cal.setTimeInMillis(1766630788926L);
		cal.setTimeInMillis(1L);
		
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH);
		int dd = cal.get(Calendar.DATE);

		System.out.println(yy+"/"+(mm+1)+"/"+dd);
		
		System.out.println("================");
		Calendar cal2 = Calendar.getInstance();
		
		String data = "115432154123215";
		
		//int time2 = Integer.parseInt(data);     예외사항발생
		long unixtime = Long.parseLong(data);

		cal2.setTimeInMillis(unixtime);

		int yy2 = cal2.get(Calendar.YEAR);
		int mm2 = cal2.get(Calendar.MONTH);
		int dd2 = cal2.get(Calendar.DATE);
		
		int lastday2 = cal2.getActualMaximum(Calendar.DATE);	//마지막날짜

		System.out.println(yy2+"/"+(mm2+1)+"/"+dd2 + "/" + lastday2 + "일까지있음");
		
		
		
		
		
		
		
		
		
		
		
	}
}

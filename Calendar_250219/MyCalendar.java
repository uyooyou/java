package Calendar_250219;

import java.util.Calendar;

public class MyCalendar {
	
	
	public static long getDateUnixTime(String date) {
		Calendar cal = Calendar.getInstance();
		String[] str = date.split("-");
		
		int yy = Integer.parseInt(str[0]);
		int mm = Integer.parseInt(str[1]);
		int dd = Integer.parseInt(str[2]);
		cal.set(yy,(mm-1),dd);
		
		return cal.getTimeInMillis();
	}
	
	

	public static int doomDay(String date) {
		// 형식체크 (생략) 	2025-12-25
		Calendar cal = Calendar.getInstance();	//Calendar 클래스의 인스턴스화
		//현재의 유닉스시간
		long unix1 = cal.getTimeInMillis();
		
		//특정날짜의 유닉스시간
		long unix2 = getDateUnixTime(date);
		
		//두 날짜(유닉스시간)의 차이 계산 -> 초단위의 계산 결과
		//자바에서는 1초가 1000임
		int min = (int)((unix2/1000) - (unix1/1000));
		int result = min/(60*60*24);
		result = Math.abs(result);
		
		return result;
	}
	
	
	
	//풀어보기 4
	public static int dateDif2(String date1, String date2) {
		long unix1 = getDateUnixTime(date1);
		long unix2 = getDateUnixTime(date2);

		int min = (int)((unix2/1000) - (unix1/1000));
		int result = min/(60*60*24);
		result = Math.abs(result);
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		//수능날의 D-Day 설정
		String date1 = "2025-11-14";
		System.out.println("수능 D-Day : " + date1 + "으로 " + doomDay(date1) + "일 남음");
		
		
		
		System.out.println(dateDif2("2025-01-01","2025-01-03"));
		
		
		
		
		
		
		
		
		
		
		
	}

}

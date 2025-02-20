package Calendar_250219;

import java.util.Calendar;

//풜어보기2 기출변형
public class Test3_1 {
	
	public static long myDateUnixTime(String date) {	//매개변수
		Calendar cal = Calendar.getInstance();
		String[] arr = date.split("-");

		int y = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int d = Integer.parseInt(arr[2]);
		
		cal.set(y,(m-1),d);		//시점세팅
		long unix = cal.getTimeInMillis()/1000;
		
		return unix;
	}
	
	
	
	
	public static void main(String[] args) {
		
		String date1 = "2025-02-24";
		String date2 = "2025-02-22";

		long unix1 = Test3_1.myDateUnixTime(date1);
		long unix2 = Test3_1.myDateUnixTime(date2);
		
		long min = unix2 - unix1;
		int result = (int)(min/(64*64*24));
		//절대값 메소드
		result = Math.abs(result);
		
		
		System.out.println(date1 + "와" + date2 + "는" + result + "일 차이 입니다.");
		
		
		
		
		
		
	}
}

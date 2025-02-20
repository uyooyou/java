package Calendar_250219;

import java.util.Calendar;

public class Test4 {

		public static void main(String[] args) {
			
			String data = "33294158618761873";
			
			Calendar cal = Calendar.getInstance();
			
			// 1. data 변수의 Long 타입 변환
			// 2. 초단위로 변환
			long unix1 = Long.parseLong(data)/1000;

			// 3. 60일을 초단위로 계산
			int plus = (60*60*24)*60;
			
			// 4. 초단위로 변환된 결과 값과 합산
			long unix2 = unix1 + plus;
			unix2 = unix2*1000;
			
			// 5. setTimeInMillis() 로 시점 변환
			cal.setTimeInMillis(unix2);
			
			// 6. get() 메소드를 통해 년월일 가져옴
			int yy = cal.get(Calendar.YEAR);
			int mm = cal.get(Calendar.MONTH);
			int dd = cal.get(Calendar.DATE);
			
			System.out.println(yy + "/" + mm + "/" + dd);
			
		}
}

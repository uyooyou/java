package study02;

public class Test5 {

	public static void main(String[] args) {
		//컴퓨터는 위에서 아래, 좌에서 우로 읽음
		//삼항연산자(조건연산자) : 형식  __  (조건)?true:false
		int eng = 80;
		System.out.println((eng < 60)?"불합격":"합격");
		System.out.println((eng >= 60)?"합격":"불합격");
		
		System.out.println((eng == 100)?"만점":"만점아녀");
		System.out.println((eng != 100)?"만점아녀":"만점");
		
		int nm = 17;
		int result = nm%5;
		System.out.println((result == 0)?"5의배수 맞네":"5의배수 아닌데?");
		
		//노래점수가 90이상이면 10분 추가, 미만은 5분추가
		int song = 88;  //노래점수88점
		int time = 30;  //남은 시간 30분
		int addTime = (song >= 90)?10:5;
		System.out.println("점수가" + song + "점으로" + addTime + "분이 연장 되었습니다.");
		System.out.println((time + addTime) + "분 후 종료됨");
		System.out.println("==============");
		
		//실습
		int temp = 20;
		System.out.println((temp < 0)?"현재 기온은 영하 " + (-temp) + "도 입니다." :"현재 기온은 영상 " + temp + "도 입니다." );
		temp = -5;
		System.out.println((temp < 0)?"현재 기온은 영하 " + (-temp) + "도 입니다." :"현재 기온은 영상 " + temp + "도 입니다." );
		temp = 0;
		System.out.println((temp == 0)?"현재 기온은 " + temp + "도 입니다.":"뭐");
		System.out.println("==============");
		
		// 쎔 풀이
		System.out.println("**쌤 풀이**");
		int temp1 = 0;
		String result1 = (temp1 >= 0)?"영상":"영하";
		System.out.println("현재 기온은 " + result1 + " " + temp1 +"도 입니다.");
		
		String result2 = (temp1 > 0)?"영상":(temp1 < 0)?"영하":"";  //중복 조건
		System.out.println("현재 기온은 " + result2 + " " + temp1 +"도 입니다.");
		
		System.out.println("==============");
		
		
		int gender = 1;
		System.out.println((gender == 1)?"입력된 숫자는 " + gender + "로 남성입니다.":"입력된 숫자는 " + gender + "로 여성입니다." );
		gender = 2;
		System.out.println((gender == 1)?"입력된 숫자는 " + gender + "로 남성입니다.":"입력된 숫자는 " + gender + "로 여성입니다." );
		System.out.println("==============");

		System.out.println("**쌤 풀이**");
		int gender1 = 3;
		String result3 = (gender1 == 1)?"남성":"여성";  //맞으면 남성 아닌번호는 전부 여성
		String result4 = (gender1 == 1)?"남성":(gender1 == 2)?"여성":"잘못된 번호";  //1남성 2여성 아닌번호는 잘못된 번호
		System.out.println("입력된 숫자는 " + gender1 + "로 " + result3 + "입니다.");
		System.out.println("입력된 숫자는 " + gender1 + "로 " + result4 + "입니다.");
		System.out.println("==============");
		
		

		int number = 17;
		System.out.println((number%2 == 0)?"입력된 숫자는 " + number + "(으)로 짝수입니다.":"입력된 숫자는 " + number + "(으)로 홀수입니다.");
		System.out.println("==============");
		
		System.out.println("**쌤 풀이**");
		int number1 = 22;
		String result5 = (number1%2 == 0)?"짝수":"홀수";
		System.out.println("입력된 숫자는 " + number1 + "로 " + result5 + "입니다.");
		
		

		// 1. 오전/오후
		// 지금 시간은 오후 1시 입니다.
		int hh = 12; // 13시 :: 0 ~ 23
		String n1 = (hh - 12) >= 0?"오후":"오전";
		int n2 = (hh - 12) > 0? hh-12 : hh;
		System.out.println("지금 시간은 " + n1 + " " + n2 + "시 입니다." );
		
		
		System.out.println("==============");
		
		
		// 2. 성적 출력 - 우수(80점 이상), 보통(60점 이상), 노력
		//68점 득점으로 보통 성적에 해당됩니다.
		int score = 55;
		String result10 = (score >= 80)?"우수":
						  (score >= 60)?"보통":"노력";
		
		System.out.println(score + "점 득점으로 " + result10 + "에 해당됩니다.");
		
	}

}

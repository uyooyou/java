package study04;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("이름이 뭐여?");
		String yourName = scan.next();
		System.out.println("몇년차여?");
		int year = scan.nextInt();
		if(year >= 16) {
			System.out.println(yourName + "님의 연차는 " + year + "로 특급");
		}else if(year >= 11) {
			System.out.println(yourName + "님의 연차는 " + year + "로 고급");
		}else if(year >= 6) {
			System.out.println(yourName + "님의 연차는 " + year + "로 중급");
		}else if(year >= 3) {
			System.out.println(yourName + "님의 연차는 " + year + "로 초급");
		}else {
			System.out.println(yourName + "님의 연차는 " + year + "로 폐급");
		}
		*/
		
		/*
		System.out.println("이름을 입력해 봐용");
		String name = scan.next();
		System.out.println("연차는?");
		int year = scan.nextInt();
		String level = "";
		
		if(year >= 16) {
			level = "특급";
		}else if(year >= 11) {
			level = "고급";
		}else if(year >= 6) {
			level = "중급";
		}else if(year >= 3) {
			level = "초급";
		}else {
			level = "신입";
		}
		System.out.println(name + "님의 연수는" + year + "년으로 " + level + "입니다." );
		*/
		
		
		
		String name = "홍";
		String gender = "M";
		String address = "구리시";
		String msg = "";
		
		if(gender =="M") {
			msg = "남성";
		}else if(gender == "F") {
			msg = "여성";
		}else {
			msg = "설정 안됨";
		}
		
		System.out.println("이름" + name + " 주소 " + address + " 성별" + msg);
		
		
		
		
		
		
		
		
		
		

		int time1 = 11;
		int time2 = 12;
		
		if(time1 != time2) {
			System.out.println("점심아님");
		}else {
			System.out.println("점심");
		}
		
		
		/*
		 * 논리연산자
		 * 1. && : 그리고(and) _ 두 조건이 모두 true 여야 실행
		 * 2.|| : 또는(or) _ 조건중 하나 이상 만족하면 실행
		 * 3. ! : 양변이 거짓일 경우 실행
		 */
		// 두 과목 모두 60이상일 때 합격
		int kor = 50;
		int eng = 80;
		String txt = "";
		if(kor >= 60 && eng >=60) {
			txt = "합격";
		}else {
			txt = "불합격";
		}
		System.out.println(txt + kor + eng);
		
		//둘 중 하나라도 만족하면 합격
		if(kor >= 60 || eng >=60) {
			txt = "합격";
		}else {
			txt = "불합격";
		}
		System.out.println(txt + kor + eng);
		
		
		
		
		
		
	}

}

package study04;

import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//논리 연산자 풀어보기
		
		
		/*
		//풀어보기 1번
		System.out.print("몇시?");
		byte t1 = scan.nextByte();  //시
		System.out.print("몇분?");
		byte t2 = scan.nextByte();  //분
		System.out.print("몇초?");
		byte t3 = scan.nextByte();  //초
		
		String str1 = "";
		if((t1 <= 23 && t1 >=0) && (t2 >= 0 && t2 <= 59) && (t3 >= 0 && t3 <= 59)) {
			str1 = "올바른";
		}else {
			str1 = "잘못된";
		}
		System.out.println(t1 + "시 " + t2 + "분 " + t3 + "초는 " + str1 + "시간");
		
		
		
		
		
		//풀어보기 2번
		System.out.print("몇시에왔노?");
		byte tt1 = scan.nextByte();  //시
		System.out.print("몇분에왔노?");
		byte tt2 = scan.nextByte();  //분
		System.out.print("몇초에왔노?");
		byte tt3 = scan.nextByte();  //초
		
		String str2 = "";
		if((tt1 <= 9 && tt1 >=0) && (tt2 >= 0 && tt2 <= 29) && (tt3 >= 0 && tt3 <= 59)) {
			str2 = "정상출석";
		}else if((tt1 <= 13 && tt1 >9) && (tt2 >= 30 && tt2 <= 59) && (tt3 >= 0 && tt3 <= 59)) {
			str2 = "지각";
		}
		System.out.println(tt1 + "시 " + tt2 + "분 " + tt3 + "초는 " + str2);
		
		
		
		
		
		//풀어보기 3번
		int number = 24;
		
		System.out.println("짝수이고 10의 배수가 아니다");
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		//풀어보기 쌤풀이
		//1은 나랑 같네..
		
		
		
		
		//2
		byte tt4 = 9;   //  6~9 ;  9    ;   9    ; 10~14
		byte tt5 = 30;  //   x  ;  0~30 ;  31~59 ;
		byte tt6 = 30;  //   x  ;  x    ;
		
		String str = "무효";
		
//		if(tt4 < 6) {
//			str = "무효";
//		}
		if(tt4 >= 6 && tt4 <= 8) {
			str = "출석";
		}else if(tt4 == 9) {
			if(tt5 >= 0 && tt5 <= 30) {
				str = "출석";
			}else {
				str = "지각";
			}
		}else if(tt4 > 9 && tt4 < 14) {
			str = "지각";
		}else if (tt4 >= 14 && tt4 <= 18) {
			str = "결석";
		}
		
		System.out.println(tt4 + "시 " + tt5 + "분 " + tt6 + "초는 " + str);
		
		
		
				
		//3
		int number1 = 20;
		String msg1 = "";
		String msg2 = "";
		if( number1%2 == 0) {
			msg1 = "짝수";
		}else {
			msg1 = "홀수";
		}
		if(number1%10 ==0) {
			msg2 = "맞맞";
		}else {
			msg2 = "안안";
		}
		
		System.out.println(number1 + "는" + msg1 + "이고 10의 배수가" + msg2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

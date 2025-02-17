package study03;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		//스캐너(Scanner) : 콘솔 화면에 입력상태 제공해 주는 클래스(파일)
		Scanner scan = new Scanner(System.in);  //사용 선언
		System.out.print("영어점수 입력해봐 : ");  //출력되는 문구
		int eng = scan.nextInt();  //입력상태 제공 (nextInt 사용하기 위해 스캐너 사용선언한것)
		
		//60점 이상 합격
		if(eng >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		System.out.println("숫자 입력해봐");
		int number = scan.nextInt();
		if(number%5 == 0) {
			 System.out.println("5의배수임");
		}else {
			System.out.println("5의배수 아님");
		}
		
		
		System.out.println("님 나이가?");
		int age = scan.nextInt();
		if(age >= 20) {
			System.out.println("담배맨");
		}else {
			System.out.println("어딜감히 담배!를!");
		}
		
		System.out.println("몇년생이고?");
		int birY = scan.nextInt();
		if(birY <= 2005) {
			System.out.println("담배쟁이 어서오고");
		}else {
			System.out.println("어딜감히 담배!를!");
		}
		
		System.out.println("을마았노?");
		int myMoney = scan.nextInt();
		int cookie = 3000;
		if(myMoney >= cookie) {
			System.out.println("쿡히 겟또~" + (myMoney - cookie) + "원 남았네");
		}else {
			System.out.println("뭐 이런 그지새끼가 다 있어?!!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

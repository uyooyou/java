package study04;

import java.util.Scanner;

public class IfTest6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		System.out.println("점수를 입력하세요");
		int kor = scan.nextInt();
		String msg = "";
		if(kor >= 90 && kor <= 100) {
			msg = "A학점";
		}else if(kor >= 80 && kor <= 89) {
			msg = "B학점";
		}else if(kor >= 70 && kor <= 79) {
			msg = "C학점";
		}else if(kor >= 60 && kor <= 69) {
			msg = "D학점";
		}else if(kor >= 0 && kor <= 59) {
			msg = "F학점";
		}else {
			msg = "잘못된점수";
		}
		System.out.println(name + "님의 국어 점수는" + kor +  "점으로 " + msg + "입니다.");
		
		
		
		
		
		
		
		
		
		

	}

}

package study07;

import java.util.Scanner;

public class Method7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("성별 (M or F or 종료:0)");
			// 성별 -> "F"
			String gender = scan.next();
			if(!gender.equals("0")) {
				methodGender(gender);
			}else {
				System.out.println("종료");
				break;
			}
		}
		
	}
	
	//매개변수 : 외부데이터 값을 갖게 되는 변수
	//아규먼트 : 매개변수에 대입되는 값
	public static void methodGender(String gender) {   //매개변수
		if(gender.equals("M")) {
			System.out.println("남성");
		}else if(gender.equals("F")) {
			System.out.println("여성");
		}else {
			System.out.println("잚못된 데이터");
		}
	}
}

package study04;

import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력해");
		int score = scan.nextInt();
		String str = "";
		if(score < 0 || score > 100) {
			str = "비정상!! 0~100 사이가 아니여";
		}else {
			str = "정상 입력";
		}
		System.out.println(str);
		
		
		System.out.print("점수 입력해222");	
		int score2 = scan.nextInt();
		String str2 = "";
		if(score2 >= 0 && score2 <= 100) {
			str2 = "정상";
		}else {
			str2 = "비정상";
		}
		System.out.println(str2);

	}

}

package study11;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int number = scan.nextInt();
		System.out.println("입력숫자 : " + number);
		
		System.out.println(Math.max(95, 80));		//큰 수 리턴

	}

}

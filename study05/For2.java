package study05;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		int year1 = 2025;
		
		for(int year = 1990; year <= 2025; year++) {
			int result = year1 - year;
			System.out.println(year + "년생은 " + result + "세 입니다.");
		}
		
		
		
		System.out.println("3단");
		for(int a = 1; a<=9; a++) {
			System.out.println(3 + " x " + a + " = " + (3*a));
		}
		
		
		
		System.out.println("단을 입력");
		int dan = scan.nextInt();
		System.out.println(dan + "단");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + (dan*i));
		}
		
		
		
		
		System.out.println("숫자입력");
		int aa = scan.nextInt();
		for(int bb = 0; bb <= aa; bb++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		//달력형식 (1~31) 7개씩 끊어서 출력
		for(int d = 1; d <= 31; d++) {
			if(d < 10) {
				System.out.print("0");
			}
			System.out.print (d + " ");
			//if(d == 7 ||d == 14 ||d == 21 ||d == 28 ) {
			if(d%7 == 0) {
				System.out.println();
			}
		}
		
		
		
		System.out.println("\n\n\n");   //  \n : 개행
		
		
		
		
		System.out.println("========================");
		for(int i = 0; i <= 5; i++) {
			for(int f = 0; f <= 5; f++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int k = 0; k <= 5; k++) {
			for(int l = 0; l <= k; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int q = 6; q >= 0; q--) {
			for(int w = 0; w <= q; w++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		System.out.println("=====================");
		for(int i = 1; i <=9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}

		System.out.println("=====================");
		
		
		
		//예제1 (-5 ~ 5)
		for(int i = -5; i <= 5; i++) {
			System.out.print(i + " ");
		}
		

		//예제2 101 ~ 103, 104 ~ 106, 107 ~ 109 
		System.out.println("\n");
		
		for(int i = 1; i <= 51; i++) {
			System.out.print(100 + i + " ");
			if(i%3 == 0) {
				System.out.println();
			}
		}
		System.out.println("+++++++++");
		//쌤풀이
		int cnt = 0;
		for(int i = 101; i <= 109; i++) {
			cnt++;
			System.out.print(i + " ");
			if(cnt%3 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("=====================");
		
		
		//예제3
		for(int i = 2; i <= 4; i++) {
			System.out.println("<font size = '" + i + "'>java</font>");
		}
		
	
		//예제4 0~5(새벽), 6~11(오전), 12~16(오후), 17~23(저녁)
		String str = "";
		for(int i = 0; i <= 23; i++) {
			if(i >= 0 && i <= 5) {
				str = "새벽";
			}else if(i >= 6 && i <= 11) {
				str = "오전";
			}else if(i >= 12 && i <= 18) {
				str = "오후";
			}else {
				str = "저녁";
			}
			System.out.println(str + " " + i + "시");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

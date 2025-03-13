package ExamFolder1;

import java.util.Scanner;

public class Test250207 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 * 시험1 작업공간 위치 확인방법 
		 */
		System.out.println("작업경로 확인 방법 : eclipse 실행 - Window 메뉴 - Preferences - General - Workspace - Show full workspace path");
		
		
		System.out.print("\n\n");
		
		
		/*
		 * 시험2
		 * 1. point 300증가
		 * 2. point 20차감
		 */
		String nickname = "유철성";
		int point = 1000;
		System.out.println (nickname + "님의 보유 포인트는 " + (point + 300 - 20) + "입니다.");

		
		System.out.print("\n\n");
		
		
		/*/
		 * 시험3
		 * 조건문사용
		 */
		int yy = 1992;
		int yy2 = 2025;
		int age = yy2 - yy;
		int mm = 3;
		int dd = 20;
		String season = "";
		
		if(mm == 12 || mm == 1 || mm == 2 ) {
			season = "겨울";
		}else if(mm >= 3 && mm <= 5) {
			season = "봄";
		}else if(mm >= 6 && mm <= 8) {
			season = "여름";
		}else if(mm >= 9 && mm <= 11) {
			season = "가을";
		}else {
			season = "잘못된 달";
		}
		System.out.println("회원님의 생일은 " + yy + "/" + mm + "/" + dd + "로 올해" + age + "세이고 " + season + "에 태어났습니다.");

		
		System.out.print("\n\n");
				
		
		/*/
		 * 시험4
		 * 반복문사용
		 * 0시 ~ 23시 출력 (가로)
		 */
		for(int i = 0; i <= 23; i++) {
			System.out.print(i + "시 ");
		}

		
		System.out.print("\n\n\n");
		
		
		/*
		 * 시험5
		 * 반복문사용
		 * (출력)
		 * 10대,20대,30대,40대,50대 
		 */
		for(int j = 10; j <= 50; j++) {
			if(j%10 == 0) {
				System.out.print(j + "대 ");
			}
		}

		
		System.out.print("\n\n\n");
		
		
		/*
		 * 시험6
		 * 반복문 별찍기 
		 */
		for(int q = 2; q <= 8; q+=3) {
			System.out.print(q + 1 + " ");
			for(int w = 0; w <= q; w++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		System.out.print("\n\n");
		
		
		/*
		 * 시험7
		 * 1 ~ 31까지의 숫자중 5의 배수는 몇개?
		 * 또는 1 ~ 100까지의 숫자중 7의 배수는 몇개?
		 * 스캐너 이용
		 */
		System.out.print("끝 번호 입력 >> ");
		int num1 = scan.nextInt();
		System.out.print("알아볼 배수 >> ");
		int num2 = scan.nextInt();

		int result = num1/num2;
		
		System.out.println("1부터 " + num1 + "까지의 " + num2 + "의 배수는 " + result + "개 있습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

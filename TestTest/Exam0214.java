package TestTest;

import java.util.Scanner;

public class Exam0214 {

	public static void main(String[] args) {
		mth1();
		System.out.println("===========================");

		
		double ret1 = mth2(30,31);
		System.out.println("평균 : " + ret1);
		System.out.println("===========================");
		

		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호 앞자리 입력 : ");
		int juminF = scan.nextInt();
		System.out.println("주민번호 뒷자리 입력 : ");
		int juminB = scan.nextInt();
		
		
	}
	
		
	public static void mth1() {
		// 1. 0~9 출력
		int mth1 = 0;
		while( mth1 <= 9) {
			System.out.print(mth1 + " ");
			mth1++;
		}
		System.out.print("\n");
		
	}
	
	
	public static double mth2(int a, int b) {
		// 2. 숫자 두개 받아서 평균값 return
		double avg1 = ((double)(a+b)/2);
		return avg1;
	}
	
	public static void mth3(String jumin) {
		// 3. 주민번호 앞 정상,뒷정상,성별정상
		//String jumin = "920320-1223334";
		//String jumin = "9203200123-1223334";
		//String jumin = "920320-1223334354";
		//String jumin = "920320-8223334";

		System.out.println("1.앞 번호 : 정상/비정상");
		System.out.println("2.뒷 번호 : 정상/비정상");
		System.out.println("3.성별 : 정상/비정상");
	}
	
	public static int mth4() {
		
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

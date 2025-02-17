package study07;

public class Method10 {

	public static void main(String[] args) {
		a1();
		a2();
		//System.out.println(a1);  error
	}
	public static void a1() {
		System.out.println("101");
	}
	public static void a2() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	
	
	
	// void : return 처리 안되는 메소드
	public static void a3() {
		//return a3;   error
	}
	
	// return 값을 가지는 메소드 : 사용자에게 값을 리턴 - 리턴값의 타입을 세팅해줘야 함
	public static String a4() {
		
		return "";
	}
	public static String a5() {
		String name = "AK47";
		return name;
	}
	public static String a6() {
		String jumsu = "90, 80, 92, 88, 52";
		return jumsu;
	}
	
	public static int a7() {
		
		return 0;
	}
	public static int a8() {
		int score = 90;
		return score;
	}
	public static double a9() {
		
		return 0.0;
	}
	public static double a10() {
		double pi = 3.14159;
		return pi;
	}
	// char 타입은 홑 따옴표
	public static char a11() {
		
		return ' ';
	}
	public static char a12() {
		char j = 'A';
		return ' ';
	}
	public static boolean a13() {
		boolean j = true;
		return j;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package study12;

public class SampleSum {

	public static void main(String[] args) {
		sum();
		sum(40,50);
		sum(100,300,500);
		sum(1000,2000,3000,4000);
	}
	
	/*
	 * 매개변수의 개수 및 종류(타입)의 차이를 두고
	 * 같은 이름의 메소드를 만드는 방법을 다형성(오버로딩)이라고 한다.
	 */
	
	/*
	 * 합계 처리 - 이름이 같아야 함
	 * 1. 두개의 숫자만 합계
	 * 2. 세게의 숫자만 합계
	 * 3. 배역의 내용을 합계
	 */
	
	public static void sum() {
		System.out.println(4 + 5);
	}
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void sum(String a, int b) {
		System.out.println(a + b);
	}
	
	/*
	public static void sum(int c, int d) {
		System.out.println(c + d);
	}
	*/
	
	public static void sum(int a, int b, int c) {
		System.out.println(a + b + c);	//연산(숫자)
	}
	
	public static void sum(String a, int b, int c) {
		System.out.println(a + b + c);	//연결(문자)
	}
	
	/*
	public static void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	*/
	
	public static void sum(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

}

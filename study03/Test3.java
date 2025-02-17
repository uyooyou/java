package study03;

public class Test3 {

	public static void main(String[] args) {
		//논리형 변수(boolean 참 거짓)
		boolean bn1 = true;
		System.out.println(bn1);
		boolean bn2 = false;
		System.out.println(bn2);
		
		boolean bn3 = 10 < 20;
		System.out.println(bn3);
		
		
		//boolean bn3 = 123;
		//boolean bn4 = '15';
		//boolean bn5 = "true";
		
		

		//상수 (변수)
		String color = "blue";  //변수 초기 선언
		System.out.println(color);  // blue 출력
		color = "red";  // 값의 재정의
		System.out.println(color);  // red 출력
		
		//final 붙으면 상수처리 됨
		final int eng = 100;
		System.out.println(eng);
		//eng = 80;  변수값 재정의 불가
		
		final boolean b1 = true;
		//b1 = false;  재정의 불가
		
		final String SCHOOL_NAME = "hi고등학교";  //변하면 안되는(상수) 변수명은 대문자로 표현(일반적인 코딩방식)
		String name = "홍박사";
		System.out.println(SCHOOL_NAME + " " + name);
		name = "쟌구";
		System.out.println(SCHOOL_NAME + " " + name);
		
		
		
		
	}

}

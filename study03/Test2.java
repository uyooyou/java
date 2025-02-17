package study03;

public class Test2 {

	public static void main(String[] args) {
		/*변수의 종류
		 * 1. 자료형(기본형) 변수 : 메모리의 stack영역에 저장 _ 크기가 정해져있음
		 *  1) 정수형 : byte, short, int, long
		 *  2) 실수형 : float, double
		 *  3) 문자형 : char
		 *  4) 논리형 : boolean
		 * 2. 참조형 변수 : 메모리의 stack과 heap영역에 나누어 저장 _ 설정값이 많을 수 있어 공간활용 위해 나눔
		 */
		
		byte num1 = 90;
		short num2 = 90;
		int num3 = 90;
		long num4 = 90;
		
		//정수 
		//최대값의 크기가 커질 수록 용량이 커짐
		byte b1 = 127;
		short s1 = 32767;
		int i1 = 2147483647;
		long l1 = 9223372036854775807L; //기본 속싱이 int 라서 숫자 끝에 알파벳 L 붙여줘야 long타입으로 인정
		
		//실수
		float f1 = 1.1234F;
		System.out.println(f1);
		float f2 = 1.1234567890123456789f;  //소수점 아래 7자리까지
		System.out.println(f2);
		double d1 = 1.1234;
		System.out.println(d1);
		double d2 = 1.12345678901234567890123123456456789789;
		System.out.println(d2);
		
		
		
		//문자타입(char) _ 단 한개의 문자만 담음
		char c1 = 'a';
		//char c2 = 'ab';  에러
		//char c2 = "a";  에러
		char c4 = 'F';
		char c5 = '한';
		//char c6 = '한글';  에러
		char c7 = 65535;
		System.out.println(c1 + "," + c4 +"," + c5 +"," + c7);
		System.out.println((int)c1 + "," + (int)c4 +"," + (int)c5 +"," + (int)c7);
		
		char u1 = 8251;
		System.out.println("당구장" + u1);
		
		

		
		
		
		int jj = 100;
		char cc = 'a';
		String ss = "abcd";
		
		
		
		
	}

}

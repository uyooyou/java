package study01;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * 변수 (String : 문자열, int : 숫자)
		 * 변수의 특징
		 * 1.
		 * 2.
		 * 3.
		 * 4.
		 * */
		String welcome = "hello";
//		System.out.println(welcome);
//		System.out.println("welcome"); // "" -  변수의 기능 상실(일반문자취급)
		System.out.println(welcome);
		System.out.println(welcome);
		System.out.println();
		
		String massage = "변수란 무엇인가?";
		System.out.println(massage);
		System.out.println();

		int kor = 90;
		int eng = 100;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println();

		// 초기변수 세팅은 변수타입 무조건 설정
		String mycolor = "blue";
		System.out.println(mycolor);
		// 변수값 재설정 (타입설정 불가능)
		mycolor = "red";
		System.out.println(mycolor);
		// 변수값 재설정 (타입설정 불가능)
		mycolor = "yellow";
		System.out.println(mycolor);
		// 문법오류 :: 변수타입의 중복선언(설정)
		// String mycolor = "green";
		
		
		// 오류~~
		//String class = "abc";   오류 예약어 사용 금지
		//String name = '길동이';   오류 문자열 홑따옴표 사용 불가
		//String eng1 = 100;   오류 문자열은 반드시 쌍 따옴표 사용
		//String book = "자바의 첫걸음";   정상코딩
		
		//int age = "55";   오류 숫자타입은 쌍따옴표 불가
		//int weight = 300;   정상코딩
		//int public = 80;   오류 예약어 사용 금지
		//int #number = 77;   오류 특수문자사용
		//int number = 77;
		//int 7number = 77;   // 변수이름 첫글자는 무조건 영문
		//int num7ber= 77;
		//int number_7 = 77;
		
		String lotte_tower_height = "555m";  // o
		int namsan = 470;  // o
		//int namsan#height = 480;   //x 특수문자
		//int namsan = 480;   //x 변수명 중복
		namsan = 480;   //o
		String _name = "감자탕";   //x 첫글자는 무조건 영어
		String name_ = "감자탕";   //o
		//String 44size = "희망사항";  //x
		String lucky7 = "행운";   //o
		String 하이미디어 = "학원";   //o 가능하지만 실무에서는 한글 사용 안함
		System.out.println(하이미디어);

	}

}

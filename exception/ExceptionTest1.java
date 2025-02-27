package exception;

public class ExceptionTest1 {

	public static void main(String[] args) {
		//나누기
		/*
		System.out.println(200/2);
		System.out.println(0.114236354746235413254/7);
		//System.out.println(abs/2);		문법오류
		//System.out.println(a/a);			문법오류
		//System.out.println(true/2);		문법오류
		System.out.println(0.1555822463854632341/0.235511);
		System.out.println(200/0);			//예외상황
		*/

		//1 연산관련
		try {
			System.out.println("-나누기 프로그램-");		//출력
			System.out.println(0/200);		//정상	//출력
			System.out.println(200/0);		//불허	//예외처리
		}catch(Exception e) {	//catch : 예외상황(오류)이 발생했을경우 실행
			System.out.println("0으로 나누기 불허");		//출력
		}
		System.out.println("자바스크립트");

//		System.out.println("===============================");

//		System.out.println("-나누기 프로그램-");		//출력
//		System.out.println(0/200);		//정상	//출력
//		System.out.println(200/0);		//불허	//예외처리
//		System.out.println("자바스크립트");
		

		System.out.println("===============================");
		
		//2배열
		int[] array = {100,200};
		
		try {
			System.out.println(array[0]);
			System.out.println(array[1]);
			//System.out.println(array(1));		문법오류
			System.out.println(array[2]);		//index번호 잘못입력
		}catch(Exception e) {
			System.out.println("index번호 잘못입력");
		}

		
		System.out.println("===============================");
		
		
		//2-1
		try {
			String str = "java";
			System.out.println(str.substring(0,1));
			System.out.println(str.substring(1,2));
			System.out.println(str.substring(2,3));
			System.out.println(str.substring(3,4));
			System.out.println(str.substring(3,5));
		}catch(Exception e) {
			System.out.println("잘못된 인덱스번호");
		}
		
		
		System.out.println("===============================");
		
		
		//3 예외상황 이후의 내용 실행 여부
		System.out.println(100);
		System.out.println(200);
		try {
			System.out.println("300");
			System.out.println(0/0);
			System.out.println("400");
		}catch(Exception e ) {
			System.out.println("0으로 나누기 금지");
		}
		System.out.println(500);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

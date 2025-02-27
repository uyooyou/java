package exception;

public class Test1 {

	public static void main(String[] args) {
		
		//try 구조 및 제어구조 내부에서 선언된 새로운 변수는 외부에서 인식 불가
		
		int eng = 0;
		try {
			eng = 100;
			System.out.println(eng/10);
		}catch(Exception e) {
			
		}finally {
			
		}
		System.out.println(eng+100);
		int kor = 0;
		if(eng < 100) {
			kor = 90;
			System.out.println(eng+kor);
		}
		System.out.println(kor + 100);
		
		// 예외상황 -> 문법오류와 관계없음

		/*
		 * 1.나누기오류 : 0으로 나누기 금지
		 * 2.배열 번호 오류 : 없는 인덱스(위치)번호
		 * 3.문자열 자리번호 오류 : substring(), cahrAt()
		 * 4.Scanner의 메소드 :  nextInt() ::문자 입력시 예외처리
		 * 5.외부 문서를 연결하는 경우 : 파일명이 잘못된 경우 예외처리
		 * 6. 데이터베이스를 연결하는 경우 : 연결정보 설정이 잘못 기제된 경우
		 */
		
	}

}

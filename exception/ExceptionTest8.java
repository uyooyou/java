package exception;

public class ExceptionTest8 {

	//String userid;
	//Stirng pass;
	//String getUserid() {
		//return userid;
//	}
	
	public static void main(String[] args) {
		
		/*
		 * throw new : 특정 익셉션(예외상황)을 발생시키는 키워드
		 */
		try {
			//System.out.println(0/0);
			//int[] a = {11,22};
			//System.out.println(a[33]);
			//관련(예외처리) 클래스의 예외처리가 발생
			throw new ArithmeticException("0으로 나누기 오류발생시킴");
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());		//예외상황 메세지
			System.out.println(e.toString());		//예외상황&관련클래스명 메세지 출력
		}catch(Exception e) {
		System.out.println(e.toString());
		}

	}

}

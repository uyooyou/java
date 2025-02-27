package exception;

/*
 * 내가 만든 익셉션 클래스(User Exception)
 */

class abc extends Exception {
	public static String message = "Hellow";

}

public class ExceptionTest10 {

	public static void main(String[] args) {
		
		try {
			System.out.println("11");
			System.out.println(100/10);
		}catch(Exception e) {
			System.out.println("오류");
			
		}
		
		
	}

}

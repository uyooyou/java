package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest4 {
	
	public static void main(String[] args) {
		String str = "java";
		int index = 1;
		try {
			System.out.println("문자열 " + str + "의 " + index + "번은 \"" + str.charAt(index) + "\" 입니다.");	
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("문자열 " + str + "의 " + index + "번은 없는 번호 입니다.");
		}
		
		
		try {
			Scanner scan = new Scanner(System.in);
			int number1 = 10;
			System.out.print("숫자입력 : ");
			int number2 = scan.nextInt();
			
			System.out.println(number1 + "을 " + number2 +"(으)로 나눈 나머지 값은" + number1%number2 + "입니다.");
		}catch(InputMismatchException e) {
			System.out.println("문자입력안돼");
		}catch(Exception e) {
			System.out.println("0으로 못나눠");
		}
		
		
	}
}

package exception;

import java.util.Scanner;

public class ExceptionTest6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("#연산시작#");
		
		System.out.print("숫자1 : ");
		int number1;
		try {
			number1 = scan.nextInt();
		}catch(Exception e) {
			number1 = 0;
		}

		System.out.print("숫자2 : ");
		int number2;
		try {
			number2 = scan.nextInt();
		}catch(Exception e) {
			number2 = 0;
		}
		
		//switch 사용
		System.out.print("연산기호 : ");
		String mark = scan.next();
		
		int result = 0;
		String message = "";
		switch(mark) {
		case "+" : result = number1 + number2;
		break;
		case "-" : result = number1 - number2;
		break;
		case "/" : result = number1 / number2;
		break;
		case "*" : result = number1 * number2;
		break;
		default : message = "잘못된연산기호";
		}
		
		
		System.out.print("결과 : " + (message.equals("")?""+result:message));
		System.out.println("#연산종료#");
		
	}
}

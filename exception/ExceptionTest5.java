package exception;

import java.util.Scanner;

//숫자 맞추기 게임
public class ExceptionTest5 {

	public static void main(String[] args) {
		Scanner scan = null;
		
		int number1 = (int)(Math.random()*100) + 1;
		//System.out.println("시스템값 : " + number1);
		
		int count = 0;
		while(true) {
			
			try {
				count++;
				scan = new Scanner(System.in);
				System.out.print("몇 번이게?");
				int number2 = scan.nextInt();
				
				if(number2 < number1) {
					System.out.println(number2 + "보다 크다");
				}else if(number2 > number1) {
					System.out.println(number2 + "보다 작다");
				}else if(number2 == number1) {
					System.out.println(count + "번 만에 정답...ㅗㅗ");
					break;	//반복문 종료
				}
			}catch(Exception e) {
				System.out.println("*****숫자만입력해******");
			}
		}
		
	}

}

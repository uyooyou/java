package study05;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		int number = 21;
		switch(number) {
			case 1 : System.out.println("1입니다.");
			break;
			case 2 : System.out.println("2입니다.");
			break;
			case 3 : System.out.println("3입니다.");
			break;
			default : System.out.println("???");
		}
		
		
		
		char gender = 'F';
		switch(gender) {
			case 'M' : System.out.println("남");
			break;
			case 'F' : System.out.println("여");
			break;
			default : System.out.println("잘못");
		}
		
		
		
		int a = 20;
		int b = 10;
		System.out.print("연산기호압력");
		String mark = scan.next();
		switch(mark) {
		case "+" : System.out.println(a + b);
		break;
		case "-" : System.out.println(a - b);
		break;
		case "*" : System.out.println(a * b);
		break;
		case "/" : System.out.println(a / b);
		break;
		default : System.out.println("없어");
		}
		//if 사용시
		if(mark.equals("/")) {
			System.out.println(a / b);
		}else {
			System.out.println("f");
		}
		
		//switch(조건식) {}  XX  switch에는 조건식 불가
		
		
		
		
		System.out.print("이름");
		String name = scan.next();
		int pay = 100;
		System.out.print("연차");
		int level = scan.nextInt();
		switch(level) {
		case 1 : pay += 30;
		break;
		case 2 : pay += 20;
		break;
		case 3 : pay += 10;
		break;
		}
		System.out.println(name + "님의 최종급여는" + pay + "원입니다.");
		
		
		
		
		int age = 30;
		String msg = "";
		switch(age%10) {
		case 9 : msg ="아홉수맨";
		break;
		default : msg = "평범한해";
		break;
		}
		System.out.println(msg);
		
		
		
		
		
		
		
		
		
	}

}

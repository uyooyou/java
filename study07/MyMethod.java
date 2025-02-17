package study07;

import java.util.Scanner;

public class MyMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("크기 입력 : ");
		int size = scan.nextInt();
		roomSize(size);
		
		
		//int a = 100;
		//int b = 20;
		myCalc(10,20,"*");
		
		
	}
	
	public static void roomSize(int size) {
		double result = size * 0.3025;   //소숫점 곱셈
		System.out.println("입력하신 " + size + "평방미터는 " + (size * 0.3025) + "평입니다.");
		System.out.println("입력하신 " + size + "평방미터는 " + result + "평입니다.");
	}

	
	public static void myCalc(int a, int b, String c) {
		
		int result = 0;
		switch(c) {
		case "+" : result = a + b;
		break;
		case "-" : result = a - b;
		break;
		case "/" : result = a / b;
		break;
		case "*" : result = a * b;
		break;
		}
		//10 + 20 = 30
		System.out.println(a + c + b + "=" + result);
	}
	
	
	
	public static String examResult(int score1, int score2) {
		String result = "";
		if(score1 >= 60 && score2 >=60) {
			result = "합격";
		}else if(score1 < 60 && score2 < 60) {
			result = "불합격";
		}else {
			result = "재시험";
		}
		//재시험 먼저 세팅
		if(score1 >= 60 && score2 >=60) {
			result = "합격";
		}else if(score1 >= 60 || score2 >= 60) {
			result = "재시험";
		}else {
			result = "불합격";
		}
		//재시험에 걸려서 안넘어감 - 잘못된 세팅 XXX
		if(score1 >= 60 && score2 >=60) {
			result = "합격";
		}else if(score1 < 60 || score2 < 60) {
			result = "재시험";
		}else {
			result = "불합격";
		}
			
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
}

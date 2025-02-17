package study07;

import java.util.Scanner;

public class Method8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = -75;
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		System.out.println(getGender("F"));

		System.out.println("=========================");
		numberGubun(number);
		
		System.out.println("=========================");
		System.out.println(getGrade(number) + "학점");
		
		System.out.println("=========================");
		gugudan(number);
		
		
		
	}
	// 남성 또는 여성이라는 값이 리턴
	public static String getGender(String gender) {
		String value;
		if(gender.equals("M")) value = "남성";
		else if (gender.equals("F")) value = "여성";
		else value = "설정안됨";
		
		return value;
	}

	
	public static void numberGubun(int number) {
		String str = "";
		if(number < 0) {
			str = "음수";
		}else if(number == 0) {
			str = "0";
		}else {
			str = "양수";
		}
		System.out.println(str + "입니다.");
	}
	

	public static String getGrade(int score) {
		String str = "";
		if(score <= 100 && score >= 90) 	str = "A";
		else if(score <= 89 && score >= 80) str = "B";
		else if(score <= 79 && score >= 70) str = "C";
		else if(score <= 69 && score >= 60) str = "D";
		else if(score <= 59 && score >= 0) 	str = "F";
		else str = "ㅗㅡㅡ ㅗ";
			
		return str;
	}
	
	
	public static void gugudan(int number) {
		for(int i = 1; i <= 9; i++) {
			System.out.println(number + "x" + i + " = " + (number*i));
		}
	}
	
	
	
}

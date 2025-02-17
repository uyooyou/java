package study04;

public class IfTest1 {

	public static void main(String[] args) {
		//실습 예제 쌤 풀이
		int age = 25;
		if(age < 20) {
			System.out.println(age + "세는 미성년자이므로 담배 판매 불가능");	
		}else {
			System.out.println(age + "세는 성인이므로 담배 판매 가능");
		}
		//or
		if(age >= 20) {
			System.out.println(age + "세는 성인이므로 담배 판매 가능");
		}else {
			System.out.println(age + "세는 미성년자이므로 담배 판매 불가능");
		}
		
		
		//변수 활용
		String msg1 = "";
		String msg2 = "";
		if (age >= 20) {
			msg1 = "성인";
			msg2 = "가능";
		}else {
			msg1 = "미성년자";
			msg2 = "불가능";
		}
		System.out.println(age + "세는 " + msg1 + "이므로 담배 판매 " + msg2);
		
		//3항연산으로 했을 경우
		String message = (age >= 20)?"23세는 성인 담배 가능":"15세는 미성년자 담배 불가능";
		System.out.println(message);
		System.out.println("====================================");
		
		int year1 = 1992;
		int year2 = 2025;
		
		
		//실습2
		int result = year2 - year1;
		if(result >= 20) {
			System.out.println(result + "성인 담배 가능");
		}else {
			System.out.println(result + "미성년 담배 불가능");
		}
		
		
		//실습3
		int money = 20;
		int price = 1500;
		String goods = "뺍빼";
		
		int result3 = money - price;
		
		if(result3 >= 0) {
			System.out.println(goods + "를 사고 " + result3 + "원이 남음");
		}else {
			System.out.println(goods + " 못 사" + (-result3) + "원 모자라");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package study01;

public class Test6 {

	public static void main(String[] args) {

		
		//실습1
		String fruit = "사과";
		int price = 500;
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
		
		//실습2,3,4
		int eng = 90;
		int math = 100;
		
		System.out.println("영어 " + eng + " 수학 " + math);
		System.out.println("영어(" + eng + "), 수학 (" + math + ")");

		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);

		int sum = eng+math;
		int avg = sum/2;
		System.out.println("합계 : " + sum);
		System.out.println("합계 : " + (eng+math));
		System.out.println("평귶 : " + avg);
		System.out.println("평균 : " + (eng+math)/2);

		//실습5
		int dan = 5;
		System.out.println(dan + " x 1 = " + dan * 1);
		System.out.println(dan + " x 2 = " + dan * 2);
		System.out.println(dan + " x 3 = " + dan * 3);
		System.out.println(dan + " x 4 = " + dan * 4);
		System.out.println(dan + " x 5 = " + dan * 5);
		
		
		
	}

}

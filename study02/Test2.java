package study02;

public class Test2 {

	public static void main(String[] args) {
		
		//대입연산자(=)
		int score1 = 100;
		String myName = "길동이~";
		int score2 = 10+90+30;
		System.out.println();
		
		int number  = 100;
		System.out.println("초기값:" + number);

		number = number + 50;
		System.out.println("50누적:" + number);

		number = number + 80;
		System.out.println("80누적:" + number);
		
		number = number - 30;
		System.out.println("-30누적:" + number);
		
		System.out.println("최종 누적값:" + number);
		System.out.println("===========");
		

		int money = 1000;
		money += 100; //money += 100; == money = money + 100;
		System.out.println(money);
		
		money += 200; //money += 200; == money = money + 200;
		System.out.println(money);
		
		money -= 30; //money -= 30; == money = money - 30;
		System.out.println(money);
		
		
		
		
		//증감연산자(++), 가감연산자(--)
		int a = 1;
		System.out.println(a);
		++a;  //전위연산  a=1+a;
		System.out.println(a);
		a++;  //후위연산  a=a+1;
		System.out.println(a);
		--a;
		System.out.println(a);
		a--;
		System.out.println(a);
		
		//a**; ==  없는 표현식
		
		int b = 1;
		int c = ++b; //연산처리 후 값을 넘김
		System.out.println("b : " + b + ", c : " + c);
		
		int d = 1;
		int e = d++;  //값을 넘긴 후 연산처리
		System.out.println("d : " + d + ", e : " + e);
		
		
		
		
		
		
	}

}

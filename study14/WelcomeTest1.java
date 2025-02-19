package study14;

public abstract class WelcomeTest1 {

	int eng = 100;
	int kor = 80;
	abstract public void welcome1();
	abstract public String welcome2();
	
	//매개변수와 위의 맴버변수와는 같은 이름이라도 무관
	abstract public void welcome6(int eng, String kor);
	
	//public String welcome3();	abstract 생략불가능
	public void welcome4() {
		System.out.println("fuckU");
	}
	
	/*	일반메소드에 abstract 세팅불가
	abstract public void welcome5() {
		System.out.println("fuckU");
	}
	*/
}

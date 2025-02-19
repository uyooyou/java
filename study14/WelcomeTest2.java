package study14;

public class WelcomeTest2 extends WelcomeTest1 {
	
	public void welcome1() {
		System.out.println("Out");
	}
	public String welcome2() {
		
		return "hahaha~!";
	}
	public void welcome6(int aa, String bb) {
		
	}
	
	
	public static void main(String[] args) {
		//Welcome1 t1 = new Welcome1();		추상 클래스는 인스턴스(객체)화 불가
		WelcomeTest2 t2 = new WelcomeTest2();
		t2.welcome1();
		t2.welcome4();
		
		System.out.println(t2.eng);
	}
	
}

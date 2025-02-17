package study12;

public class Test1 {
	
	int a;
	int b;
	
	
	//오버로딩된 생성자가 없는 경우 생략 가능 
	Test1() {}

//	Test1() {
//		System.out.println("100");
//	}
	
	Test1(int a) {		//생성자 오버로딩
		this.a = a;
	}
	
	//Test1(int b) {}	//같은 종류(타입)의 매개변수 사용 오류
	
	public static void main(String[] args) {

		Test1 test1 = new Test1();
		Test1 test2 = new Test1(200);
		//Test1 test3 = new Test1("200");		//없는 생성자로 인한 오류
		
	}
}

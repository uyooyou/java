package study10;

public class OOP_Test1 {

	int a = 10;					//맴버변수, 인스턴스 변수
	int b = 20;					//맴버변수, 인스턴스 변수
	String c = "object";		//맴버변수, 인스턴스 변수
	
	public static void main(String[] args) {
		
		int i =  100;			//지역(local)변수   다른 클래스에서는 호출 불가능
		System.out.println(i);
		
		/*
		 * new : 객체 처리하는 키워드
		 */
//	  	 참조클래스	  참조변수	= new 	생성자();
		OOP_Test1 Test1 = new OOP_Test1();		//인스턴스(객체)처리
		
		System.out.println(Test1.a);
		System.out.println(Test1.b);
		System.out.println(Test1.c);
		
	}

}

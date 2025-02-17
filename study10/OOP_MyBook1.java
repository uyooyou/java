package study10;

public class OOP_MyBook1 {
	
	public static void main(String[] args) {
		
		String message = "객체지향";	//지역변수라서 외부에서 사용 불가능
		
		OOP_BookInfo mk = new OOP_BookInfo();
		System.out.println("제목 : " + mk.title);
		System.out.println("가격 : " + mk.price);
		System.out.println("제조 : " + mk.maker);
		
		mk.price = 15000;
		mk.title = "자바바님 한판해요~";
		System.out.println("제목 : " + mk.title);
		System.out.println("가격 : " + mk.price);
		System.out.println("제조 : " + mk.maker);
		
	}

}

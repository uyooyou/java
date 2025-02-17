package study12;

public class Books1004 {
	int price = 10000;
	String bookName;
	
	//현업이었다면? 매개변수와 객체변수의 이름이 같아야함
//	Books1004(String bookName) {
//		this.bookName = bookName;
//	}
//	
//	Books1004(String bookName, int price) {
//		this.bookName = bookName;
//		this.price = price;
//	}
	
	
	//학습예제
	Books1004() {}
	
	Books1004(String a) {
		this.bookName = a; 
	}
	
	Books1004(String a, int b) {
		this.bookName = a;
		this.price = b;
	}
	
	
	public static void main(String[] args) {
		//기본 생성자 부재시 오류~
		Books1004 html = new Books1004();
		
		Books1004 java = new Books1004("자바의 첫 걸음");
		System.out.println("My book : " + java.bookName + ", 가격 : " + java.price);
		
		Books1004  linux = new Books1004("리눅스 마스터", 35000);
		System.out.println("My book : " + linux.bookName + ", 가격 : " + linux.price);

	}

}

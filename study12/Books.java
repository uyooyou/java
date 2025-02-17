package study12;

public class Books {
	
	String bookName = "JSP기초";
	//기본형은 생략과 관계없이 존재
	Books() {
		System.out.println("<< 한빛미디어 >>");
	}
	
	//생성자 오버로딩
	Books(String name) {
		System.out.println("<< 한빛미디어 >>");
		this.bookName = name;
	}
	

	public static void main(String[] args) {
		
		Books jspBook = new Books();
		System.out.println(jspBook.bookName);
		
		
		Books javaBook = new Books("JAVA master");
		System.out.println(javaBook.bookName);
		

	}

}

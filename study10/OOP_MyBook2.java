package study10;

public class OOP_MyBook2 {

	public static void main(String[] args) {
		
		OOP_BookInfo book = new OOP_BookInfo();
		System.out.println(book.title);
		System.out.println(book.price);
		
		book.title = "html";
		book.price = 120000;
		System.out.println(book.title);
		System.out.println(book.price);
		
		
	}

}

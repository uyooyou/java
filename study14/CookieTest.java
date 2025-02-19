package study14;

public class CookieTest {

	public static void main(String[] args) {
		//인터페이스 파일은 인스턴스처리 불가
		//Cookie cc = new Cookie();
		
		
		MyCook my = new MyCook();
		my.makeCookie();
		my.makeSalad();

		System.out.println(my.a);
		System.out.println(MyCook.a);
	}

}

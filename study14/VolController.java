package study14;

public class VolController {

	public static void main(String[] args) {
		VolMake tv = new VolMake();
		VolMake radio = new VolMake();
		
		tv.volUp(10);
		System.out.println("TV " + tv.getVolumn());
		radio.volUp(20);
		System.out.println("Radio " + radio.getVolumn());
		tv.volUp(1);
		System.out.println("TV " + tv.getVolumn());
	}
	
}

package study11;

public class CoffeeInfo {
	String name = "";				//맴버변수, 인스턴스변수(고유메모리)
	int price = 0;					//맴버변수, 인스턴스변수(고유메모리)
	static String maker = "";		//맴버변수, 클래스변수(공유메모리)
	
	public void getPrice(int pp) {
		if(pp < 100000) {
			price = pp;
		}
	}
	public static void setMaker(String mm) {
	}
}

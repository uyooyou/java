package study14;

//public abstract Cookie {}		추상클래스

public interface Cookie {
	int a = 100;		//맴버변수, 인스턴스변수
	static int b = 90;	//맴버변수, 클래스변수(공유메모리)
	
	//public abstract void makeCookie();
	public void makeCookie();
	//public abstract void makeSalad();
	public void makeSalad();

	
	/*완성형 메소드 불가능
	public void abc() {
		System.out.println("dd");
	}
	*/
}

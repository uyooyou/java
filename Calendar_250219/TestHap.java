package Calendar_250219;

abstract class Test11 {			//추상클래스
	public abstract void hqp();	//명세처리
}
interface Test22 {				//인터페이스(파일)
	public void hap();			//명세처리
}
class MyHap extends Test11 {
	int a = 10;		//맴버변수, 인스턴스변수
	int b = 20;
	static int c = 30; 		//맴버변수, 클래스변수
	static final int d = 100;	//맴버변수, 클래스변수, 종단변수
	
	@Override	//어노테이션
	public void hap() {
		System.out.println(a + b);
	}
}
class MHap2 implements Test22 {
	@Override
	public void hap() {
		System.out.println(1000+200);
	}
	public void hap(int a, int b, int c) {
		
	}
}

public class TestHap {

	public static void main(String[] args) {
	  //참조클래스 참조변수 = new 생성자;
		MyHap my1  = new MyHap();	//인스턴스(객체)화
		
		my1.a = 90;
		
		MyHap.c = 5000;
		//MyHap.d = 5000;	상수변수
		
	}

}

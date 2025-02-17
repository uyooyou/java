package study07;

public class Method9 {

	public static void main(String[] args) {
		String name = "길동이";
		int eng = 90;
		int kor = 80;
		int math = 100;
		System.out.println("영국 : " + hap(eng,kor));
		System.out.println("영국수 : " + hap(eng,kor,math));
		System.out.println("영국수 : " + hap(eng,kor,math,name));

		//System.out.println(hap(eng));   error
		//System.out.println(hap(name,math,name,eng));   error  메소드의 순서가 어긋남
		
	}
	
	public static int hap(int a, int b) {
		return a+b;
	}
	public static int hap(int a, int b, int c) {
		return a+b+c;
	}
	public static int hap(int a, int b, int c, String d) {
		return a+b+c;
	}
	

}

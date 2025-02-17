package study07;

public class Method3 {

	public static void main(String[] args) {
		//Method2.programbooks();
		//Method1.scriptProgram();
		count10();
		System.out.println("============================");
		count20();
		System.out.println("============================");
		oddNumber100();
	}
	
	//1~10까지 출력
	public static void count10() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	//1~20까지 출력
	public static void count20() {
		int a = 1;
		while (a <= 20) {
			System.out.println(a);
			a++;
		}
	}
	//1~100 중 홀수 출력
	public static void oddNumber100() {
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 1) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	
}

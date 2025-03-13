package lambda;

public class MyFunction1 {
	
	public static void main(String[] args) {
		
		MyInterface1 f1 =()-> {
			System.out.println("java");
		};

		MyInterface2 f2 =()-> {
			System.out.println("react");
		};

		MyInterface3 f3 =(a,b)-> {
			System.out.println(a + " + " + b + " = " + (a + b));
		};
		
		MyInterface4 f4 =(a,b)-> {
			return a+b;
		};
		
		MyUnixTime unixTime =()-> {
			return System.currentTimeMillis()/1000;
		};
		
		f1.method();
		f2.method();
		f3.method(50,70);
		f3.method(520,7120);
		int sum = f4.method(984,1158);
		System.out.println("f4 sum : " + sum);
		System.out.println("현재 유닉스 시간 : " + unixTime.method() + " 초");
		
		
	}
	
}

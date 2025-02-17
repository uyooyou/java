package study10;

public class TypeTest1 {

	public static void main(String[] args) {
		
		System.out.println((double)67/3);
		System.out.println(67/(double)3);
		System.out.println(67/3.0);
		System.out.println(67.0/3);
		System.out.println(67.0/3.0);
		System.out.println("==========================");
		System.out.println(67/3);
		
		int a = 67;
		int b = 3;
		double result = a/b;
		System.out.println(result);
		result = (double)(a/b);
		System.out.println(result);
		result = (double)a/b;
		System.out.println(result);
		

		System.out.println("===========================");
		
		int i = 55;
		int j = 7;
		int ret1 = i*j;
		double ret2 = i*j;
		System.out.println(ret1);
		System.out.println(ret2);
		
		double d1 = 55.0;
		double d2 = 7.7;
		double ret3 = d1*d2;
		System.out.println(ret3);
		//int ret4 = d1*d2;			문법오류  double, int 용량차이
		int ret4 = (int)(d1*d2);
		System.out.println(ret4);
		
		
		
		
	}

}

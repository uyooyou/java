package lambda;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * 함수적 인터페이스 Supplier
 */
public class SupplierTest {
	
	public static void main(String[] args) {
		
		Supplier<String> s1 =()-> {
			return "himedia";
		};
		System.out.println(s1.get());
		
		Supplier<Integer> s2 =()-> {
			int num = (int)(Math.random()*100)+1;
			return num;
		};
		System.out.println(s2.get());
		
		IntSupplier s3 =()-> {
			int num = (int)(Math.random()*100)+1;
			return num;
		};
		System.out.println(s3.getAsInt());
		
		
		
	}
}

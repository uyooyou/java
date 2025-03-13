package lambda;

import java.util.function.BiConsumer;

/*
 * 함수적 인터페이스 Consumer
 */

import java.util.function.Consumer;


interface Inter1 {
	public void method(String t);
}


public class ConsumerTest {

	public static void main(String[] args) {
		
		//만든 인터페이스
		Inter1 it =(t)-> {
			System.out.println(t);
		};
		it.method("JAVA");
		
		
		//자바 제공 인터페이스
		Consumer<String> cons1 =(t)-> {
			System.out.println(t);
		};
		cons1.accept("java");
		
		Consumer<Integer> cons2 =(t)-> {
			System.out.println(t+100);
		};
		cons2.accept(100);
		
		//복수의 데이터
		BiConsumer<Integer,Integer> cons3 =(t1,t2)-> {
			System.out.println(t1+t2);
		};
		cons3.accept(50,500);
		
		Consumer<String> strUp =(str)-> {
			System.out.println(str.toUpperCase());
			//return str.toUpperCase();
		};
		strUp.accept("java");
	}
}

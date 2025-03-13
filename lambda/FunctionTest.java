package lambda;

import java.util.function.Function;

/*
 * 함수적 인터페이스 function
 * 매개변수가 있고 리턴값도 있음
 * 타입변환 역할
 */
public class FunctionTest {

	public static void main(String[] args) {
	
		//String => Integer 변환
		Function<String,Integer> fn1 =(s)-> {
			return Integer.parseInt(s);	
		};
		System.out.println(fn1.apply("1004") + 1004);
		
		//String => Integer 변환
		Function<Integer,String> fn2 =(s)-> {
			return Integer.toString(s);	
		};
		System.out.println(fn2.apply(1004) + 1004);
		
		
		
		
	}
	
}

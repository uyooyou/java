package study09;

public class MathClass {

	public static void main(String[] args) {
		double d1 = 98.3;
		double d2 = 98.8;
		// 1. ceil() 메소드 : 소수점 아래 올림, 실수형으로 변환
		System.out.println(Math.ceil(d1));
		System.out.println(Math.ceil(d2));
		System.out.println(Math.ceil(98.134));
		
		
		// 2. floor() 메소드 : 소수점 아래 내림, 실수형으로 변환
		System.out.println(Math.floor(d1));
		System.out.println(Math.floor(d2));
		System.out.println(Math.floor(98.134));
		
		
		// 3. round() 메소드 : 소수점 아래 반올림, 정수형으로 변환
		System.out.println(Math.round(d1));
		System.out.println(Math.round(d2));
		System.out.println(Math.round(98.134));
		
		
		// 4. rint() 메소드 : 소수점 아래 반올림, 실수형으로 변환
		System.out.println(Math.rint(d1));
		System.out.println(Math.rint(d2));
		System.out.println(Math.rint(98.134));
		
		
		// 5. abs() 메소드 : 절대값으로 변환 (음수만 적용됨)
		System.out.println(Math.abs(-98));
		System.out.println(Math.abs(98));
		
		
		// 6. pow() 메소드 : 지수 승 변환, 제곱수
		System.out.println(Math.pow(10,2));
		System.out.println(Math.pow(10,3));
		System.out.println(Math.pow(10,4));
		
		
		// 7. sqrt() 메소드 : 제곱근변환 (루트)
		System.out.println(Math.sqrt(100));
		System.out.println(Math.sqrt(36));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.sqrt(16));
		
		
		// 8. max()/min() 메소드 : 인자들 중 가장 큰/작은 값 변환 - 인자값은 2개까지만
		System.out.println(Math.max(100,80));
		//System.out.println(Math.max(1,2,3));		error
		System.out.println(Math.min(30,15));
		//System.out.println(Math.min(45,9,78));	error
		
		
		// 9. sin(), cos(), tan()
		
		
		// 10. random() 메소드 : 난수발생 - 0~1(0초과 1미만) 사이의 실수
		double ran = Math.random();
		System.out.println(ran);
		System.out.println(ran*100);				//0~99사이 실수
		System.out.println((int)(ran*100));			//0~99사이 정수
		System.out.println((int)(ran*100)+1);		//1~100사이 정수
		System.out.println((int)(ran*45)+1);		//1~45사이 정수
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

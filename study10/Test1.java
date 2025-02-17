package study10;

public class Test1 {
	
	//다시 해봐 ==
	public static void main(String[] args) {
		double a1 = 1.123456;
		//1.12 or 1.123 소숫점 줄이기..
		// 방법1. 문자타입으로 전환 후 문자열 메소드 이용
		//String s1 = a1 + "";		//문자처리됨   정식 x 야매라네 ==ㅋ
		/*
		String s1 = Double.toString(a1);
		System.out.println(s1);
		System.out.println(s1.substring(0,4));
		double a2 = Double.parseDouble(s1.substring(0,4));	//문자타입으로 바꾼 걸 다시 더블타입으로
		System.out.println(a2);
		*/

		double result = myPow(a1,3);
		System.out.println(result);
	}
	
	public static double myPow(double dd, int nn) {
		// 소수점 아래 2자리까지 표현
		int p = (int)Math.pow(10,nn);
		double ret1 = dd*p;
		double ret2 = (int)ret1/(double)p;
		
		//Math.pow(10,2);	//10*10
		
		return ret2;
	}

}

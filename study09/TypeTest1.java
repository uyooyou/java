package study09;

public class TypeTest1 {

	public static void main(String[] args) {
		// +=(누적)  => 숫자는 연산, 문자는 연결처리
		
		int n1 = 10;
		n1 += 5;
		n1 += 20;
		n1 -= 5;
		
		String s1 = "";
		//String s1 = "11 12 13 14 15"
		for(int i = 11; i < 16; i++) {
			s1 += i + " ";
		}
		s1 = s1.trim();		//공백제거

		System.out.println(s1);
		
		
		
		int a = 10;
		int b = 7;
		
		int c1 = a/b;				//정수/정수=정수
		double c2 = a/b;			//결과값이 실수로 변환
		
		//실수/정수=실수  :  10.0/7 => 소수접 아래 출력
		double c3 = (double)a/b;	//(double) 정수변수를 실수변수로 형변화 후 계산 (1회성 변환)
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	
		System.out.println(67/3);	//22
		System.out.println((double)67/3);	//22.33333333333333333
		
		
		// a ~ z 반복문 사용 출력
		char alp = 'a';		//유니코드 - 문자의 고유번호
		String str = "";
		for(int i = 0; i < 26; i++) {
			str += alp + " ";
			alp++;
		}
		System.out.print(str);
		
		
	}

}

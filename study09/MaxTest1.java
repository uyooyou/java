package study09;

public class MaxTest1 {

	public static void main(String[] args) {
		int a1 = 95;
		int a2 = 80;
		int a3 = 100;
		int a4 = 1800;
		
		System.out.println(mini(88,55));
		
		
//		System.out.println(Math.min(a1, 
//						   Math.min(a2, 
//						   Math.min(a3,a4))));
		
	
		int maxNumber = Math.max(a1, 
						Math.max(a2, 
						Math.max(a3,a4)));
		
		int maxNumber2 = myMax3(a1,a2,a3); 
		System.out.println(maxNumber);
	}
	
	//사용자 메소드 ; 매개변수 - 외부 데이터 값을 받는 변수
	public static int myMax3(int n1,int n2, int n3) {
		int max = Math.max(n1, 
				  Math.max(n2, n3));
		return max;
	}
	public static int myMax4(int n1,int n2, int n3,int n4) {
		int max = Math.max(n1, 
				  Math.max(n2, 
				  Math.max(n3, n4)));
		return max;
	}
	
	
	//min 메소드 만들어보기
	public static int mini(int a, int b) {
		
		//3항 연산
		int min = (a < b)? a : b;
		
		//if사용
//		int min = 0;
//		if( a > b) {
//			min = b;
//		}else if(a < b) {
//			min = a;
//		}else {
//			min = a;
//		}
		
		return min;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

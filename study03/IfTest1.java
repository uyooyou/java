package study03;

public class IfTest1 {

	public static void main(String[] args) {
		
		int eng = 80;  //60점 이상 합격
		
		if(eng >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		//3항연산과 비교...
		//System.out.println((eng >= 60)?"합격":"불합격");
		
		eng = 100;
		if(eng == 100) {
			System.out.println("만점");
		}else {
			System.out.println("아님");
		}
		
		
		int number = 34;
		if(number%5 == 0) {
			 System.out.println("5의배수임");
		}else {
			System.out.println("5의배수 아님");
		}
		
		
		//성별 (1남 2여 이외꺼져)
		int gender = 1;
		if(gender == 1) {
			System.out.println("남성");
		}else if (gender == 2) {
			System.out.println("여성");
		}else {
			System.out.println("꺼져");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

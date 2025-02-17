package study05;

public class For3Test {

	public static void main(String[] args) {
		//무한루프(;;)
		int a = 0;
		for(;;) {
			a++;
			//System.out.println(a);
			if(a == 100000000) {
				break;  //반복문 종료
			}
		}
		
		
		
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
			if(i == 50) {
				break;
			}
		}
		
		
		for(int i = 1; i <= 100; i++) {
			if(i == 50) {
				break;
			}
			System.out.println(i);
		}
		
		

		for(int i = 1; i <= 100; i++) {
			if(i == 50) {
				continue;   //건너뛰기
			}
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

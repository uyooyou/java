package Study06;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//기본구조
//		if(true) {
//			System.out.println("a");
//		}
//		for(;;) {
//			System.out.println("a");
//		}
//		while(true) { 
//			System.out.println("a");
//		}
		
		// 1 ~ 10
		int a = 1;
		while( a <= 10) {
			System.out.print(a + " ");
			a++;
		}

		System.out.println();
		System.out.println();
		
//		for(int b = 1; b <= 10; b++) {
//			System.out.print(b + " ");
//		}
		
		// 10 ~ 1
		int b = 10;
		while(b >= 1) {
			System.out.print(b + " ");
			b--;
		}
		
		System.out.println();
		System.out.println();
		
		// 10 ~ 100 (10 배수)
		int c = 10;
		while(c <= 100) {
			System.out.print(c + " ");
			c += 10;
		}
		
		
		int cnt = 1;
		while(true) {
			System.out.println(cnt + " ");
			if(cnt%1000000 == 0) {
				System.out.println("계속 : Y");
				String stop = scan.next();
				if(!stop.equals("Y")) {
					System.out.println("종료됨");
					break;
				}
			}
			cnt++;
			
		}	
	
		

	}

}

package study05;

public class For1 {

	public static void main(String[] args) {
		//반복문
		
		for(int i = 0; i <= 6; i++) {
			System.out.println("java");
		}
		
		
		for(int a = 11; a <= 20; a++) {
			System.out.println(a + " ");
		}
		
		
		for(int i = 0; i <= 99; i++) {
			if(i%2 == 1) {
				System.out.print(i + " ");
				System.out.println();
			}
		}
		System.out.println("===========================");
		
		
		int dan = 2;
		int cnt = 1;
		for(int i = 1; i <= 5; i += 2) {
			System.out.println("문항" + cnt + ": " + dan + " x " + i + "= " + (dan*i));
			cnt++;
		}
		for(int i = 1; i <= 5; i ++) {
			if(i%2 == 1) {
			System.out.println("문항" + cnt + ": " + dan + " x " + i + "= " + (dan*i));
			cnt++;
			}
		}
		
		
		
		
		
		
	}

}

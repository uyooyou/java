package myThread;

public class ThreadTest1 {
	
	public static void main(String[] args) {

		for(int i = 0; i <= 10; i++) {
			System.out.println("호 : " + i);
			
			try {
				Thread.sleep(100);	//0.5초 지연
			}catch(Exception e) {
				
			}
		}
		

		for(int i = 0; i <= 10; i++) {
			System.out.println("꿀 : " + i);
			
			try {
				Thread.sleep(100);	//0.5초 지연
			}catch(Exception e) {
				
			}
		}
		
	}
	
}

package myThread;

public class MyThreadTest3 extends Thread {
	
	public void run() {
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("호 : " + i);
			try {
				Thread.sleep(100);	//0.5초 지연
			}catch(Exception e) {
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		MyThreadTest3 my3 = new MyThreadTest3();
		my3.start();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("개 : " + i);
			try {
				Thread.sleep(100);	//0.5초 지연
			}catch(Exception e) {
				
			}
		}
		
		
	}

}

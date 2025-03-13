package myThread;

class MultiThread extends Thread {
	String name;
	MultiThread() {}
	public MultiThread(String name) {
		System.out.println(getName() + "스레드 실행");
			this.name = name;
	}
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(getName() + "(" + name + ")");
			try {
				sleep(300);
			}catch(InterruptedException e) {
				
			}
		}
	}
	
}

public class TutorialThread {
	
	public static void main(String[] args) {
		
		MultiThread mt1 = new MultiThread("첫번째");
		MultiThread mt2 = new MultiThread("두번째");
		MultiThread mt3 = new MultiThread("세번째");
		mt1.start();
		mt2.start();
		mt3.start();
		
	}
	
}

package myThread;

//Tread화 된 클래스는 run() 메소드가 반드시 필요

public class MyThreadTest2 extends Thread {

	public void run() {
		System.out.println("Thread start");
	}
	
	public static void main(String[] args) {
		
		MyThreadTest2 my2 = new MyThreadTest2();
		my2.run();
		
		my2.start();
		
	}
	
}

package myThread;

public class MyThreadLotto extends Thread {
	
	public void run() {
		for(int i = 0; i < 2; i++) {
			int z = (int)Math.ceil(Math.random()*45);
			System.out.print(z + " ");
			try {
				sleep(2000);	//딜레이
			}catch(Exception e) {
				
			}
		}
		
		//반올림 테스트
//		int z = (int)Math.round(Math.random()*45);
//		double d1 = Math.random()*45;
//		double d2 = Math.round(d1);		//반올림
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println((int)d2);
		
	}

	public static void main(String[] args) {
		MyThreadLotto lt1 = new MyThreadLotto();
		MyThreadLotto lt2 = new MyThreadLotto();
		MyThreadLotto lt3 = new MyThreadLotto();
		lt1.start();
		lt2.start();
		lt3.start();
		
	}
}

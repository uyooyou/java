package ExamFolder2;
/*
 * 1. 0~100까지 1씩 증가하는 반복문을 3개 만들어 동시 실행
 * 2. 한 번 회전할 때마다 0.1초씩 지연시간을 세팅
 * 3. 30의 배수마다 출력(예:2번 복문 30M 통과)
 * 4. 회전이 끝나면 끝났다는 문구 출력
 */
public class TestThread extends Thread {
	
	int number;
	TestThread(int number) {
		this.number = number;
	}
	
	public void run() {
		for(int i = 0; i <= 100; i++) {
			if(i%30 == 0) {
				System.out.print("(" + number + "번)" + i + "M ");
			}
			try {
				Thread.sleep(20);
			}catch(Exception e) {
				
			}
		}
		System.out.println("\n(" + number + "1번)회전끝");
	}
	
	public static void main(String[] args) {
		TestThread t1 = new TestThread(1);
		TestThread t2 = new TestThread(2);
		TestThread t3 = new TestThread(3);
		t1.start();
		t2.start();
		t3.start();
	}

}

package ExamFolder2;
//1~31까지 7의 배수만 출력 
public class LoopTest {

	public static void main(String[] args) {
		
		System.out.println("for");
		for(int i = 1; i <= 31; i++) {
			if(i%7 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("==================");
		System.out.println("while");
		
		int a = 1;
		while(a <= 31) {
			if(a%7 == 0) {
				System.out.println(a);
			}
			a++;
		}
		
	}
	
}

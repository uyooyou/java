package exception;

public class ExceptionTest3 {

	public static void main(String[] args) {
		String[] program = {"java","oracle","linux"};
		
		int i = 0;
		while(i < 5) {
			try {
				if(i==3) {
					System.out.println(i/0);
				}else {
					System.out.println(program[i]);
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열번호 오류");
			}catch(ArithmeticException e) {
				System.out.println("제로나누기 오류");
			}catch(Exception e) {
				System.out.println("오류");
			}finally {
				System.out.println("========");
			}
			i++;
		}
		
		
//		for(int i = 0; i < program.length; i++) {
//			System.out.println(program[i]);
//		}

	}

}

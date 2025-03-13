package ExamFolder2;
//배열,형변환
public class ArrayTest {
	
	public static void main(String[] args) {
		
		String[] subject = {"영어","수학","과학","체육","국어"}; 
		String[] score = {"65","80","75","55","95"};
		
		for(int i = 0; i < subject.length; i++) {
			int score1 = Integer.parseInt(score[i]);
			String str = "";
			if(score1 >= 90) {
				str = "A";
			}else if(score1 >= 80) {
				str = "B";
			}else if(score1 >= 70) {
				str = "C";
			}else if(score1 >= 60) {
				str = "D";
			}else {
				str = "F";
			}
			
			System.out.print("[" + subject[i] + ":" + str + "]");
		}
		
	}

}

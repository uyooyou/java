package study03;

public class Test1 {

	public static void main(String[] args) {
		//1증가
		int count = 1;
		count = count + 1;
		count += 1;
		count++;
		++count;
		//3증가
		count = count + 3;
		count += 3;
		
		System.out.println("값은 " + count + "입니다.");
		
		//3항 연산
		//100보다 크거나 작다.
		int number = 100;
		String result = (number > 100)?"크다":"작다";
		System.out.println("입력한 값은 " + number + "(으)로 100보다 " + result);
		//100보다 크거나 작거나 같다
		String result2 = (number > 100)?"크다":(number < 100)?"작다":"같다";
		System.out.println(result2);
		
		
		//학점 (A,B,C,D,F)
		int math = 50;
		String level = (math >= 90)?"A":
			 		   (math >= 80)?"B":
			 		   (math >= 70)?"C":
			 		   (math >= 60)?"D":"F";
		
		//수학점수는 88점으로 B학점입니다.
		System.out.println("수학점수는 " + math + "점으로 " + level + "학점입니다.");
		
		

	}

}

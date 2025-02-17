package study03;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[] scores1 = {90,100,58,85};
		
		int[] scores2 = new int[4];
		scores2[0] = 90;
		scores2[1] = 100;
		scores2[2] = 58;
		scores2[3] = 85;
		
		System.out.println(scores1[2]);
		System.out.println(scores2[2]);
		
		System.out.println(scores1.length);
		System.out.println(scores2.length);
		
		System.out.println("===========================");
		System.out.println("===========================");
		
		
		//2차원 배열
		int[][] jumsu = {{60,80,70,90},{75,35,45},{100,88,44,66}};
		System.out.println(jumsu[0][0]);  //의미 : 첫번째 배열의 1번째 값 출력
		System.out.println(jumsu[0][1]);  //의미 : 첫번째 배열의 2번째 값 출력
		System.out.println(jumsu[0][2]);  //의미 : 첫번째 배열의 3번째 값 출력
		System.out.println(jumsu[0][3]);  //의미 : 첫번째 배열의 4번째 값 출력
		System.out.println("===========================");

		System.out.println(jumsu[1][0]);  //의미 : 두번째 배열의 1번째 값 출력
		System.out.println(jumsu[1][1]);  //의미 : 두번째 배열의 2번째 값 출력
		System.out.println(jumsu[1][2]);  //의미 : 두번째 배열의 3번째 값 출력
		System.out.println("===========================");
		
		System.out.println(jumsu[2][0]);  //의미 : 세번째 배열의 1번째 값 출력
		System.out.println(jumsu[2][1]);  //의미 : 세번째 배열의 2번째 값 출력
		System.out.println(jumsu[2][2]);  //의미 : 세번째 배열의 3번째 값 출력
		System.out.println(jumsu[2][3]);  //의미 : 세번째 배열의 4번째 값 출력
		System.out.println("===========================");
		
		//3차원 배열
		int[][][] school = {{{60,80,70,90},{88,75,35,45},{100,88,44,66}} , {{90,54},{78,96}}};
		System.out.println(school[0][0][0]);
		System.out.println(school[0][0][1]);
		System.out.println(school[0][0][2]);
		System.out.println(school[0][0][3]);
		System.out.println("===========================");
		
		System.out.println(school[0][1][0]);
		System.out.println(school[0][1][1]);
		System.out.println(school[0][1][2]);
		System.out.println(school[0][1][3]);
		System.out.println("===========================");
		
		System.out.println(school[0][2][0]);
		System.out.println(school[0][2][1]);
		System.out.println(school[0][2][2]);
		System.out.println(school[0][2][3]);
		
		System.out.println("===========================");
		
		System.out.println(school[1][0][0]);
		System.out.println(school[1][0][1]);
		System.out.println("===========================");
		
		System.out.println(school[1][1][0]);
		System.out.println(school[1][1][1]);
		System.out.println("===========================");
		
		
		
		
		
		
		
		
		
		
		
	}

}

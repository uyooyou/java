package study03;

// ArrayTest1 파일명 변경방법 (F2)
public class ArrayTest1 {

	public static void main(String[] args) {
		/*
		 * 배열(Array)
		 */
		int ss = 90;  //일반적인 변수
		// 배열(형식) : 변수명 하나에 다중 변수값을 가짐
		int[] scores = {90,100,58,85};  //배열 _ 무조건 이 형식
		//int{} aa = {1,35};  불가
		//int[] aa = [1,35];  불가
		String[] names = {"징버거","릴파","아이네","비챤"};
		//String[] cc = {"aa","bb",11};  다른 타입은 불가능
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names.length);  //length : 배열요소 갯수
		
		//자리(index)번호 오류 _ 음수 불가, 없는 자리
		//index번호는 0번부터 시작(무조건)
		//System.out.println(names[-1]);
		//System.out.println(names[5]);
		
		//배열 값 변경
		scores[0] = 5;
		System.out.println("scores[0] : " + scores[0]);
		
		//scores 변수값들의 합계, 평균
		int sum1 = scores[0] + scores[1] + scores[2] + scores[3];
		int avg1 = sum1/scores.length;
		System.out.println("합계 : " + sum1 + " 평균 : " + avg1);
		
		int sum2 = 0;
		sum2 += scores[0];
		sum2 += scores[1];
		sum2 += scores[2];
		sum2 += scores[3];
		System.out.println("합계 : " + sum2);
		
		

	}

}

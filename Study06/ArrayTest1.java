package Study06;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 배열 : 하나의 이름으로 여러 값을 가지는 변수
		int[] scores = {90,70,60,654,54,65465,47,654,564,56,456,465,465,4,4,7,8,8,7,89,87,78,987,987,987,321,321,87,61,8,561,654,6847,3214,84756321};
		int sum = 0;
		for(int i = 0; i <scores.length; i++) {
			System.out.println(scores[i]);  //index 값
			sum += scores[i];
		}
		int avg = sum/scores.length;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		// int hap1 = scores[0] + scores[1] + scores[2];
		
//		int hap2 = 0;
//		hap2 += scores[0];
//		hap2 += scores[1];
//		hap2 += scores[2];
		
		
		//1. java 2.....
		String[] subject = {"java","react","oracle"};
		for(int i = 0; i < subject.length; i++) {
			System.out.println((i+1) + "." + subject[i]);
		}
		
		

		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//풀어보기1
		for(int i = 1; i <= 17; i++) {
			System.out.print(i);
			if(i%5 == 0) {
				System.out.print("**");
			}
			System.out.print(" ");
		}

		System.out.println();
		System.out.println();
		System.out.println();

		//풀어보기2
		int[] mm = {1,3,10};
		for(int i = 0; i < mm.length; i++) {
			String str = "";
			if(mm[i] >= 3 && mm[i] <= 5)		str = "봄";
			else if(mm[i] >= 3 && mm[i] <= 5)	str = "여름";
			else if(mm[i] >= 3 && mm[i] <= 5)	str = "가을";
			else 								str = "겨울";
			
			String zero = (mm[i] < 10)?"0":"";
			
			System.out.print(zero + mm[i] + "월 : " + str);
			System.out.println();

		}
		
		
		
		
		
		
		

	}

}

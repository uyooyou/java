package study09;

public class MathArrayTest1 {

	public static void main(String[] args) {
		//풀어보기 1
		int age1 = 105;
		int age2 = 82;
		int age3 = 98;

		int maxAge = Math.max(age1, Math.max(age2, age3));
		int minAge = Math.min(age1, Math.min(age2, age3));
		System.out.println("나이 많" + maxAge + "살이고 " +
						   "나이 적" + minAge + "세 입니다.");
		
		
		//풀어보기 2
		int[] a1 = {90,80,-40,95,72,54};
		// abs() = 절대값
		int sum = 0;
		for(int i = 0; i < a1.length; i++) {
			sum += Math.abs(a1[i]);
			//System.out.println(Math.abs(a1[i]));		출력확인완료
		}
		int avg = sum/a1.length;
		double avg1 = (double)sum/a1.length;
		System.out.println("합계 : " + sum + " 평균 : " + avg);		
		
		
		//풀어보기 3
		int max = 0;
		for(int i = 0; i < a1.length; i++) {
			int number = Math.abs(a1[i]);
			max = Math.max(max, number);
		}
		System.out.println("최대값 : " + max);

		
		//int min = max;
		int min = 0;
		for(int i = 0; i < a1.length; i++) {
			int number = Math.abs(a1[i]);
			if(i>0) {
				min = Math.min(min,number);
			}else{
				min = number;
			}
		}
		System.out.println("최소값 : " + min);
	}

}

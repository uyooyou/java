package study07;

public class MyMethod2 {

	public static void main(String[] args) {
		int[] scores = {60,70,80,68,78};
		hap1(scores);
		hap2(scores);
		avg1(scores);
		//합
		//평

	}
	
	public static void hap1(int[] ss) {
		int sum = 0;
		for(int i = 0; i < ss.length; i++) {
			sum += ss[i];
		}
		System.out.println("(합계 : " + sum + ")");
	}
	public static void hap2(int[] ss) {
		int sum = 0;
		for(int i = 0; i < ss.length; i++) {
			sum += ss[i];
		}
		System.out.println("(영어점수의 합계 : " + sum + "점)");
	}
	public static void avg1(int[] ss) {
		int sum = 0;
		for(int i = 0; i < ss.length; i++) {
			sum += ss[i];
		}
		int avg = sum/ss.length;
		System.out.println("(평균 : " + avg + ")");
	}

}

package study07;

public class MyMethod1 {

	public static void main(String[] args) {
		int[] scores = {60,70,80,68,78};
		int sum = arraySum(scores);
		int avg = sum/scores.length;
		System.out.println("배열값 합 : " + sum + "입니다.");
		System.out.println("배열값 평균 : " + avg + "입니다.");
		
		String[] subject = {"java","javac","javab","javad"};
		arrayString(subject);
	}

	
	public static int arraySum(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static void arrayString(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
	

}

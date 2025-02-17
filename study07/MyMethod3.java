package study07;

public class MyMethod3 {

	public static void main(String[] args) {
		int[] scores = {60,70,80,68,78};
		int sum = hap1(scores);
		int avg = avg1(scores);
		System.out.println("(합계 : " + sum + ")");
		System.out.println("(평균 : " + avg + ")");
	}
	
	public static int hap1(int[] ss) {
		int sum = 0;
		for( int i=0; i<ss.length; i++) {
			sum += ss[i];
		}
		return sum;
	}
	public static int avg1(int[] ss) {
		int avg = hap1(ss)/ss.length;
		return avg;
	}

}

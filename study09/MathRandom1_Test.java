package study09;

public class MathRandom1_Test {

	public static void main(String[] args) {
		String lotto = MathRandom1.lotto7();
		System.out.println(lotto);
		
		String[] array = lotto.split(" ");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(MaxTest1.myMax3(50, 70, 100));

	}

}

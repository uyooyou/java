package study09;

import java.util.Random;

public class MathRandom2 {

	public static void main(String[] args) {
		Random rn = new Random();
		System.out.println(rn.nextInt());
		System.out.println(rn.nextBoolean());
		System.out.println(rn.nextDouble());
		System.out.println(rn.nextFloat());
		System.out.println(rn.nextLong());

	}
	
	public static String lotto() {
		Random rn = new Random();
		String lotto = "";
		for(int i = 0; i < 6; i++) {
			lotto += (rn.nextInt(45) + 1) + " ";
		}
		//앞뒤 공백 제거메소드 사용
		
		lotto = lotto.trim();
		
		return lotto;
	}

}

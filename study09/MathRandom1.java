package study09;

public class MathRandom1 {

	public static void main(String[] args) {
		//1~45사이 랜덤값
		int a1 = (int)0.723;	//소수점 자리 버림
		
		lotto();

	}
	public static void lotto() {
		int r1 = (int)(Math.random()*45)+1;	//1~45
		int r2 = (int)(Math.random()*45)+1;	//1~45
		int r3 = (int)(Math.random()*45)+1;	//1~45
		int r4 = (int)(Math.random()*45)+1;	//1~45
		int r5 = (int)(Math.random()*45)+1;	//1~45
		int r6 = (int)(Math.random()*45)+1;	//1~45
		
		System.out.print(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 + " " + r6 + " ");	
	}
	public static String lotto7() {
		int r1 = (int)(Math.random()*45)+1;	//1~45
		int r2 = (int)(Math.random()*45)+1;	//1~45
		int r3 = (int)(Math.random()*45)+1;	//1~45
		int r4 = (int)(Math.random()*45)+1;	//1~45
		int r5 = (int)(Math.random()*45)+1;	//1~45
		int r6 = (int)(Math.random()*45)+1;	//1~45
		
		String lotto = r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 + " " + r6;
		return lotto;
	}

}

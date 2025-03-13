package myThread;

import java.util.Random;

public class Lotto777 {

	public static void main(String[] args) { 
	
		Random ran = new Random();
		//System.out.println(ran.nextInt());
		//System.out.println(ran.nextInt(45));
		int[] lotto = new int[6];
		String ss = "";		//중복확인용 변수
		
		int i = 0;	//배열번호는 무조건 0부터
		while(true) {
			int num = ran.nextInt(45) + 1;
			
			//중복체크
			int cnt = 0;
			for(int a = 0; a < lotto.length; a++) {
				if(lotto[a] == num) {
					cnt = 1;
					ss += num + ",";
				}
			}
			if(cnt == 0) {
				lotto[i] = num;
				i++;
			}
			
			if( i == 6 ) break;
		}
		for(int j = 0; j < 6 ; j++) {
			System.out.println(lotto[j]);
		}
		
		System.out.println("\n" + ss);

		//lotto1 = lotto1.replace(","," ");	//문자교체
		//lotto1 = lotto1.trim();		//앞 뒤 공백제거
		
		//int z = (int)Math.ceil(Math.random()*45);
		
		

	}

}

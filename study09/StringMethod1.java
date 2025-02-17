package study09;

public class StringMethod1 {

	public static void main(String[] args) {
		
		//풀어보기 3
		String date = "2025-02-12";
		String yy = date.substring(0,4);
		String mm = date.substring(5,7);
		String dd = date.substring(8,10);
		
		String[] str = date.split("-");
		yy = str[0];
		mm = str[1];
		dd = str[2];
		
		System.out.println(yy + mm + dd);

		System.out.println();
		
		
		//풀어보기 4
		//substring 메소드로 표현하긴 부적절함.. 자릿수변하면 잣됨
		String scores = "70,90,100,5,35";
		String s1 = scores.substring(0,2);
		String s2 = scores.substring(3,5);
		String s3 = scores.substring(6,8);
		
		String[] str1  = scores.split(",");
		
		for(int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}
		
		
		//풀어보기 5
		String str5 = "오늘의 학습\n자바\n데이터베이스\n전자정부 프레임워크";
		String str6 = str5.replace("\n","<br>");
		System.out.println(str6);
		
		str6 = str6.replace(" ","&nbsp");
		System.out.println(str6);
		
	}

}

package study10;

public class Student1 {

	public static void main(String[] args) {
		int math = 0;
		
		StudentInfo info = new StudentInfo();
		info.eng = 80;
		info.kor = 75;
		info.name = "홍홍홍";
		//math = 100;
		System.out.println("이름 : " + info.name);
		System.out.println("영어 : " + info.eng);
		System.out.println("국어 : " + info.kor);
		//System.out.println("수학 : " + math);
		
		StudentInfo info1 = new StudentInfo();
		info1.eng = 98;
		info1.kor = 100;
		info1.name = "길길길";
		math = 60;
		System.out.println("이름 : " + info1.name);
		System.out.println("영어 : " + info1.eng);
		System.out.println("국어 : " + info1.kor);
		//System.out.println("수학 : " + math);

		int hong = info.eng + info.kor;
		int gil = info1.eng + info1.kor;

		System.out.println("hong 총점 : " + info.hap());
		System.out.println("hong 평균 : " + info.avg());
		System.out.println("gil 총점 : " + info1.hap());
		System.out.println("gil 평균 : " + info1.avg());
		
		
	}

}

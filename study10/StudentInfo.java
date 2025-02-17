package study10;

public class StudentInfo {
	int eng = 0;
	int kor = 0;
	String name = "";
	
	// static 생략
	public int hap() {
		return eng + kor;
	}
	public int avg() {
		return hap()/2;
	}
}

package study13;

class StudentVO {
	//private 상속은 되지만 호출은 불가
	private String name;
	private int year;
	private int eng;
	private int kor;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
}


public class StudentInfo extends StudentVO {
	
	public int sum() {
		return getEng() + getKor();
	}
	
	public int avg() {
		return sum()/2;
	}
	
	//다른 방법
	public void input(String name, int year, int eng, int kor) {
		setName(name);
		setYear(year);
		setEng(eng);
		setKor(kor);
	}
	public void output() {
		System.out.println(getName());
		System.out.println(getYear());
		System.out.println(sum());
		System.out.println(avg());
	}
	
	
	public static void main(String[] args) {
		StudentInfo info1 = new StudentInfo();
		info1.input("김철수", 1, 90, 80);
		StudentInfo info2 = new StudentInfo();
		info2.input("박철수", 1, 85, 68);
		
		info1.output();
		info2.output();
		//
//		info.setName("철수");
//		info.setYear(1);
//		info.setEng(80);
//		info.setKor(90);
		
		

//		System.out.println(info.getName());
//		System.out.println(info.getYear());
//		System.out.println(info.sum());
//		System.out.println(info.avg());
		
	}
	
}

package study14;

abstract class StudentService {
	abstract public int sum();
}
class StudentImp1 extends StudentService {
	public int sum() {
		return eng + kor;
	}
	
	//get,set
	private String name;
	private int eng;
	private int kor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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


public class StudentControl {

	public static void main(String[] args) {
		int avg = 0;
		StudentImp1 s1 = new StudentImp1();
		
		s1.setName("dd");
		s1.setEng(100);
		s1.setKor(80);

		System.out.println(s1.getName());
		System.out.println(s1.getEng());
		System.out.println(s1.getKor());
		System.out.println(s1.sum());

	}

}

package study13;
/*
 * 다형성
 * 1. 오버로딩 : 상속과 무관
 * 2. 오버라이딩 : 상속과 관련있음 
 */
class JavaProject {
	public void projectName() {
		System.out.println("자바프로젝트");
	}
	String projectLocSeoul() {
		return "강남구";
	}
}

class OracleProject extends JavaProject {
	
	//오버라이딩 : 상위 클래스의 메소드를 덮어 씀
	public void projectName() {
		System.out.println("오라클프로젝트");
	}
	String projectLocBusan() {
		return "해운대구";
	}
	String projectLocBusan(String loc) {
		return "광안리";
	}
}
public class OverWriteTest {

	public static void main(String[] args) {
		OracleProject project = new OracleProject();
		project.projectName();
		project.projectLocSeoul();
		project.projectLocBusan();
		
		
	}
	
}

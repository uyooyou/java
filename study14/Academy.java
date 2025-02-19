package study14;

abstract class MySubject {
	abstract void subjectName();
}

class Java extends MySubject {
	// @ : 어노테이션 - 시스템주석
	// 오버라이드 어노테이션
	@Override
	void subjectName() {
		System.out.println("javaprogram");
	}
}

class Spring extends MySubject {
	@Override
	void subjectName() {
		System.out.println("spring");
	}
}


public class Academy {
	
	public static void main(String[] args) {
		Java java = new Java();
		Spring spring = new Spring();
		
		java.subjectName();
		spring.subjectName();
	}
}

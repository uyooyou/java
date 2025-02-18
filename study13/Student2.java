package study13;

class Person2 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class Student2 extends Person2 {

	public void allSet() {
		//name = "황";	: private 처리된 변수라 직점세팅 불가
		//age = 32;
		setName("손손");
		setAge(22);
	}
	
	public static void main(String[] args) {
		Student2 student2 = new Student2();
		student2.allSet();
		
		student2.setName("유유");
		student2.setAge(30);
		
		String name = student2.getName();
		int age = student2.getAge();

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}

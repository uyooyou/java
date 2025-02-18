package study13;

public class Student1 {

	public static void main(String[] args) {
		
		Person1 p1 = new Person1();		//인스턴스화
		p1.name = "윷";
		p1.age = 34;
		p1.height = 174;
		//p1.weight = 69;	private : 다른 클래스에서는 호출 불가
		p1.setWeight(70);

		System.out.println(p1.name);
		System.out.println(p1.height);
		//System.out.println(p1.weight);
		System.out.println(p1.getWeight());
		
	}

}

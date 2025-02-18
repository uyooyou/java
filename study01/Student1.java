package study01;

import study13.Person1;
// 13강 내용 테스트
public class Student1 {

	public static void main(String[] args) {
		
		Person1 p1 = new Person1();		//인스턴스화
		//p1.name = "윷";
		p1.setName("윷");
		p1.age = 34;
		//p1.height = 174;
		p1.setHeight(174);
		//p1.weight = 69;	private : 다른 클래스에서는 호출 불가
		p1.setWeight(70);

		System.out.println(p1.getName());
		System.out.println(p1.getHeight());
		//System.out.println(p1.weight);
		System.out.println(p1.getWeight());
		
	}

}

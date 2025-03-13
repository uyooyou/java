package ExamFolder2;
//오버로딩
class PeopleInfo {
	String name = "";
	String address = "";
	String gender = "";
	int age;
	
	PeopleInfo(String name) {
		this.name = name;
	}
	
	PeopleInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	PeopleInfo(int age, String gender, String address) {
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
}


public class PeopleMain {

	public static void main(String[] args) {
		PeopleInfo s1 = new PeopleInfo("홍길동");
		System.out.println(s1.name + "입니다.");
		

		PeopleInfo s2 = new PeopleInfo("토마스",25);
		System.out.println(s2.name + "의 나이는 " + s2.age + "세 입니다.");
		

		PeopleInfo s3 = new PeopleInfo(34,"M","겅기도");
		String gen = "";
		if(s3.gender == "F") {
			gen = "여성";
		}else if(s3.gender == "M") {
			gen = "남성";
		}else {
			gen = "잘못입력";
		}
		System.out.println(s3.age + "세의 " + gen + "은 " + s3.address + "에 거주하고 있습니다.");
	}
	
}

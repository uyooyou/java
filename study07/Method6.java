package study07;

public class Method6 {

	public static void main(String[] args) {
		int age = age();
		String str = method1();
		int year = method2();
		System.out.println("회원님의 나이는 " + age + "세로 " + str + "이며 " + year + "년생입니다.");
		//회원님의 나이는 23세로 성인이며 2003년생입니다.
	}
	public static int age() {
		return 23;
	}
	// "성인" 또는 "미성년" 값이 리턴 (method1)
	public static String method1() {
		String str = "";
		if(age() >= 20) {
			str = "성인";
		}else {
			str = "미성년";
		}
		//return str;
		return (age() >= 20)?"성인":"미성년";
		
	}

	// 출생년도가 리턴되는 메소드(method2)
	public static int method2() {
		int year = 2025 - age();
		//return year;
		return 2025 - age();
	}
	
}

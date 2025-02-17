package study07;

public class Method4 {

	public static void main(String[] args) {
		String name = memberName();
		String gender = memberGender();
		String year = memberYear();
		
		String str = "";
		if(gender.equals("M")) {
			str = "남";
		}else {
			str = "여";
		}
		
		// Integer.parseInt(변수명) : 형변환 String -> Int 
		int age = 2025 - Integer.parseInt(year);
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + str);
		System.out.println("연도 : " + year);
		System.out.println("나이 : " + age);
	}
	
	//return : 호출한 위치에 던짐.
	public static String memberName() {
		return "윷";
	}public static String memberGender() {
		return "M";
	}public static String memberYear() {
		return "1992";
	}
	
}

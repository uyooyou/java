package pattern;

public class MemberCheck {

	public static void main(String[] args) {
		//아이디 (영문+숫자) 6~12
		String userid = "cjftjd299";	//true
		//userid = "299ttl";		//false
		//영문,숫자 순서무관
		//String pattern1 = "[0-9a-zA-Z]{6,12}";
		//영문이 앞에 올 수 있게 세팅
		String pattern1 = "[a-zA-z]{1}[0-9a-zA-Z]{5,11}";
		System.out.println("ㅡ아이디 : " + userid.matches(pattern1));
		
		
		//패스워드 (영문+숫자+특수문자(!,@,#,%,-,_,.)) 8~20
		String pass = "1234-_!@#$^abc";
		String pattern2 = "[0-9a-zA-Z-_!@#$^]{8,30}";
		System.out.println("패스워드 : " + pass.matches(pattern2));
		
		
		//이름 (영문,한글) 2~20
		String name = "유철성";
		String pattern3 = "[a-zA-Z가-힣]{2,20}";
		System.out.println("ㅡㅡ이름 : " + name.matches(pattern3));
		
		
		//생년월일 1992-03-20
		String date = "1992-03-20";
		String pattern4 = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";
		System.out.println("생년월일 : " + date.matches(pattern4));
		
		
		//성별 (M or F)
		String gender = "M";
		String pattern5 = "(M|F){1}";
		System.out.println("ㅡㅡ성별 : " + gender.matches(pattern5));
		
		
		//핸드폰 010-2500-9213
		String phone = "010-2500-9213";
		phone = "011-250-9213";
		String pattern6 = "(010|011)-[0-9]{3,4}-[0-9]{4}";
		System.out.println("전화번호 : " + phone.matches(pattern6));
		
		
		//이메일 cjftjd299@naver.com
		String email = "cjftjd299@naver.com";
		String pattern7 = "[a-zA-z]{1}[0-9a-zA-Z]{5,11}@[a-zA-Z0-9]+\\.[a-zA-Z0-9.]+";
		System.out.println("ㅡ이메일 : " + email.matches(pattern7));
		
		
		//문자열에 숫자포함 여부
		String str = "문자열에 숫0자포함 여부";
		str = "1";
		String pattern8 = ".*[0-9]+.*";
		System.out.println("문자열에 숫자포함 여부 : " + str.matches(pattern8));
		
		
		//IP주소확인
		//192.168.0.30
		String ip = "192.168.0.30";
		String pattern9 = "[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";
		System.out.println("IP address : " + ip.matches(pattern9));
		
		
		//한글아닌 값이 한개 이상 있어야함 == 한글 이외의 값이 반드시 한개 이상 포함되어야 함
		String str10 = "자바스크립트";	//false
		str10 = "자바스크립트100";		//true
		str10 = "100";				//true
		//"^"가 정규표현식 사이에 끼어있으면 not의 의미
		//"^"가 정규표현식의 맨 앞에 설정 되었으면 start의 의미
		String pattern10 = ".*[^ㄱ-힣]+.*";
		System.out.println("한글 외의 글자 포함여부 : " + str10.matches(pattern10));
		
		
		
		
		
		
		
		
		
		
	}
	
}

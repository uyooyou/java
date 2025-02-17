package study08;

public class StringMethod1 {

	public static void main(String[] args) {
		
		String subject1 = "spring boot";
		int year = 2025;
		
		// 1. length() 메소드
		System.out.println(subject1.length());  	//길이, 갯수
		//System.out.println(year.length());	//length는 숫자에 사용 불가 (문자전용)
		System.out.println("javascript".length());
		
		// 2. replace("old","new") 메소드 -> 치환 메소드   
		String subject2 = subject1.replace("spring","summer");
		System.out.println(subject2);							//summer boot
		System.out.println(subject2.replace("boot","boat"));	//summer boat
		
		// 3. trim() 메소드 -> 앞, 뒤 공백 제거
		String address = " 경기도 구리시 토평동 1000-11 ";
		System.out.println(address);
		System.out.println(address.length());
		address = address.trim();
		System.out.println(address);
		System.out.println(address.length());
		
		// 4. substring(시작번호,끝번호) 메소드 -> 범위만큼 잘라내기
		// 예) substring(3,7) :: 해당문자열에서 3~6번까지 잘라서 출력
		// address = "경기도 구리시 토평동 1000-11"
		System.out.println(address.substring(0,3)); 	//경기도
		System.out.println(address.substring(4,7)); 	//구리시
		System.out.println(address.substring(8,11)); 	//토평동
		System.out.println(address.substring(12,19)); 	//1000-11
		System.out.println(address.substring(4));		//구리시 토평동 1000-11 - 해당자리 뒤의 모든자리 출력
		//System.out.println(address.substring(-1)); 	//음수 불가능
		//System.out.println(address.substring(4,30)); 	//자릿수 초과 불가능
		
		 // 5. charAt(index) 메소드 -> 세팅 인덱스 번호의 데이터값을 가져옴
		System.out.println(address.charAt(4));			//구
		System.out.println(address.charAt(8));			//토
		//System.out.println(address.charAt(5,6));		//한자리만 가능
		
		// 6-1. indexOf("강남") 메소드 -> 문자열에서 특정 단어 찾기 (자리번호 시작점 얻어줌)
		System.out.println(address.indexOf("구"));
		System.out.println(address.indexOf("경"));
		System.out.println(address.indexOf("?"));		//없는 글자는 -1
		
		// 6-2. contains("강남") 메소드 -> true, false
		System.out.println(address.contains("경기도"));
		System.out.println(address.contains("서브웨이"));
		
		// 7-1. startsWith() -> 시작단어
		System.out.println(address.startsWith("경기도"));
		System.out.println(address.startsWith("경"));
		System.out.println(address.startsWith("구리"));
		
		// 7-2. endsWith() -> 끝단어
		System.out.println(address.endsWith("1000-11"));
		System.out.println(address.endsWith("1"));
		System.out.println(address.endsWith("엿"));
		
		// 8. ★★ split(구분자) 메소드 -> 특정 구분자에 의해 문자열을 나누는 메소드
		// 배열형식의 결과로 분리
		String subjects = "html,css,java";
		String[] ss = subjects.split(",");		// String[] ss = {"html","css","java"};
		
		// split() 메소드 사용
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		System.out.println(ss[2]);
		// split() 메소드를 사용하지 않았을 때
		System.out.println(subjects.substring(0,4));
		System.out.println(subjects.substring(5,8));
		System.out.println(subjects.substring(9,13));
		

		address = "경기도 구리시 토평동 1000-11";
		String[] addr = address.split(" ");
		for(int i = 0; i < addr.length; i++) {
		System.out.println(addr[i]);
		}
		
		// 9. toUpperCase() -> 소문자 => 대문자
		// 9. toLowerCase() -> 대문자 => 소문자
		String title = "Javascript";
		System.out.println(title.toUpperCase());
		System.out.println(title.toLowerCase());
		
		// equals() 메소드 -> 문자열 비교(같음) 메소드
		if(title.toUpperCase().equals("javascript")) {
			System.out.println("같");
		}else {
			System.out.println("다");
		}
		
		// 추가
		if(title.toLowerCase().equals("javascript".toLowerCase())) {
			System.out.println("같");
		}else {
			System.out.println("다");
		}
		
		
		
		
		
	
	
	
	}

}

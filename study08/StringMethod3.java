package study08;

public class StringMethod3 {

	public static void main(String[] args) {
		//풀어보기
		String address = "경기 구리시 건원대로 44 태영빌딩 305~307호 (우)11921";
		
		//1
		System.out.println("주소는 " + address.length() + "자");
		
		//2
		int index = address.indexOf("태영빌딩");
		System.out.println(address.substring(index,index + 4));
		
		//3
		index = address.indexOf("구리시");
		System.out.println("'구리시'라는 단어는 인덱스 번호로 " + index + "번에 있습니다.");				
		
		//4
		String zipcode = address.substring(32);
		String addr = address.substring(0,28);
		
		
		//역슬래쉬 \\ : 뒤에오는 특수문자를 의미없는 일반문자로 변환
		String[] array = address.split("\\(우\\)");
		
		System.out.println("우편 : " + array[1]);
		System.out.println("주소 : " + array[0]);
		
		//5번
		System.out.println(address.replace(" ",""));
		
		
		
		
		
	}

}

package pattern;

public class Test1 {

	/*
	 * matches()  -  패턴 검사 메소드
	 */
	public static void main(String[] args) {
		
		//단 한개의 문자만 허용
		String text = "한";	//true
		text = "a";			//false
		text = "aa";		//true
		text = "";			//false
		text = " ";			//true
		text = "  ";		//false
		text = "#";			//true
		text = "/";			//true
		text = "\\";		//true		\\는 한개로 인식
		
		
		String pattern = ".";
		//1"문자(열)".matches(패턴)
		System.out.println(text.matches(pattern));
		//System.out.println("한".matches(pattern));	//맞는형식
		//System.out.println(pattern.matches(text));	//잘못된형식
		
		
		//2문자가 1개 이상
		String text2 = "사전";	//true
		text2 = "전";			//true
		text2 = "";				//false
		
		String pattern2 = ".+";		//"이상"의 의미
		System.out.println(text2.matches(pattern2));
		
		
		//3시작문자열(단어)을 체크
		String text3 = "정보처리 기사";	//true
		text3 = "정보처리";			//true
		text3 = "정보처";				//false  "정보처리"라는 단어로 시작 안해서 false
		text3 = "자격증대비반";			//false
		//^ : 뒤에 올 문자(열)로 시작
		//"정보처리"라는 단어로 시작해야 하고 뒤의 문자가 0개 이상 올 수가 있다. 
		String pattern3 = "^정보처리.*";
		System.out.println(text3.matches(pattern3));
		
		
		//4
		String text4 = "yellow";	//true
		text4 = "red";	//true
		text4 = "blue";	//true
		text4 = "b";	//true
		text4 = " b";	//false
		String pattern4 = "^(r|y|b).*";	//r또는 y또는 b로 시작되는 문자열
		System.out.println(text4.matches(pattern4));
		
		
		//5 html java oracle 시작
		String text5 = "html css java";
		text5 = "java";			//true
		text5 = "oracle 수업";	//true
		text5 = "css oracle";	//false
		String pattern5 = "^(html|java|oracle).*";
		System.out.println(text5.matches(pattern5));
		
		
		//6 html java oracle 시작
		String text6 = "html css java";
		text6 = "java";			//false
		text6 = "oracle 수업";	//true
		text6 = "css oracle";	//false
		String pattern6 = "^(html|java|oracle).+";
		System.out.println(text6.matches(pattern6));
		
		
		//7 html java oracle 시작
		String text7 = "html css java";
		text7 = "java";			//false
		text7 = "oracle 수업";	//false
		text7 = "css oracle";	//false
		text7 = "oracle ";		//true
		text7 = " oracle ";		//false
		String pattern7 = "^(html|java|oracle).";
		System.out.println(text7.matches(pattern7));
		
		
		//8		날짜형식 (예 : 2025-15-85 - 체크 불가)
		String date = "2025-02-99";	//true
		date = "2025/02/21";		//false
		date = "aaaa-02-21";		//false
		//[숫자]{개수범위}
		String pattern8 = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";
		System.out.println(date.matches(pattern8));
		
		if(date.matches(pattern8)) {
			System.out.println("올바른날짜 형식");
		}else {
			System.out.println("잘못된 형식");
		}
		
		
		//9 주민등록번호 체크
		//숫자6자리 - 숫자7자리 /(1~4)
		String text9 = "920320-1010110";
		String pattern9 = "[0-9]{6}-[1-4]{1}[0-9]{6}";
		System.out.println(text9.matches(pattern9));
		
		
		//10 영어점수 체크
		//숫자1~3
		String eng = "99";
		String pattern10 = "[0-9]{1,3}";	//1~3개
		System.out.println(eng.matches(pattern10));
		
		
		//11 - 한글만 허용 (2~20자리)
		String name = "안유라";	//true
		name = " 율 율 ";			//false
		name = "율";				//false
		name = "yul";			//false
		String pattern11 = "[가-힣]{2,20}";
		System.out.println(name.matches(pattern11));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

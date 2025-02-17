package study08;

import java.util.Scanner;

public class StringMethod4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String title = "자바프로그래밍 입문";
		String content = "자바를 이용하여 기초부터 중급까지 완성한다.";
		System.out.print("검색단어 입력 : ");
		String searchWord = scan.next();
		
		boolean tt = title.contains(searchWord);  //true or false
		boolean ct = content.contains(searchWord);
		String str = "";
		
		if( tt == true && ct == true) {
			str = "제목과 내용에서 검색되었습니다.";
		}else if( tt == true && ct == false) {
			str = "제목에서 검색되었습니다.";
		}else if( tt == false && ct == true) {
			str = "내용에서 검색되었습니다.";
		}else {
			str = "없어";
		}
		System.out.println("검색단어 " + searchWord + "(은)는 " + str);
		
		
		
		//변수가 단독으로 있을경우 기본적이로 true 값임
		if( tt && ct) {
			str = "제목과 내용에서 검색되었습니다.";
		}else if( tt && !ct) {
			str = "제목에서 검색되었습니다.";
		}else if( !tt && ct) {
			str = "내용에서 검색되었습니다.";
		}else {
			str = "없어";
		}
		System.out.println("검색단어 " + searchWord + "(은)는 " + str);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

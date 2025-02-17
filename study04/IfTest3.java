package study04;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별입력 M or F");
		
		
		String name = "홍";
		String gender = scan.next();
		String address = "구리시";
		String msg = "";
		
		//문자비교를 위해선 equals 써줘야 함
		if(gender.equals("M")) {
			msg = "남성";
		}else if(gender.equals("F")) {
			msg = "여성";
		}else {
			msg = "설정 안됨";
		}
		
		System.out.println("이름" + name + " 주소 " + address + " 성별" + msg);
		
		

	}

}

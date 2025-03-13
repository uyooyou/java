package ioservice;

import java.io.File;
import java.util.Scanner;

/*
 * 파일삭제 실습2 (삭제여부 묻기)
 */
public class FileInfo3_1_delete2 {

	public static void main(String[] args) {
		String dirPath = "C:/mytemp";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제파일이름 결정해 : ");
		String filename = scan.next();
		String filePath = dirPath+"/"+filename;
		
		File file = new File(filePath);
		
		//문자 -> 숫자 : 관련메소드 사용
		int filelen = (int)file.length();		//legnth() : long타입
		if(filelen > 0) {
			
			while(true) {
				System.out.println("## 빈파일 아님..삭제할거? (Y / N) : ");
				String yn = scan.next();
				if(yn.toUpperCase().equals("Y")) {
					System.out.println("삭제 할게");
				}else if(yn.toUpperCase().equals("N")) {
					System.out.println("== 삭제 취소 ==");
					return;	//메소드 종료
				}else {
					System.out.println("Y / N 입력하라고");
				}
			}
			
		}
		
		
		if(file.exists()) {
			
			file.delete();
			System.out.println(" ** 삭제완료 ** ");
		}else {
				System.out.println("존재하지않음");
		}

	}

}

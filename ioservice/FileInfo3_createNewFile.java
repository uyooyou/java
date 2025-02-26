package ioservice;

import java.io.File;
import java.util.Scanner;

public class FileInfo3_createNewFile {

	public static void main(String[] args) {
		/*
		 *디렉토리(리눅스용어) 경로 - c:/mytemp
		 *특정파일생성	- 스캐너이용 파일이름설정
		 *			- 존재유무
		 *			- 파일생성
		 *특정파일삭제	- 스캐너이용 파일이름설정
		 *			- 존재유무
		 *			- 파일길이체크
		 *			- 파일삭제(0byte)
		 */
		String dirPath = "C:/mytemp";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일이름 결정해 : ");
		String filename = scan.next();
		String filePath = dirPath+"/"+filename;
		
		File file = new File(filePath);
		if(file.exists()) {
			System.out.println(" ** 이미 존재함 ** ");
		}else {
			try {
				file.createNewFile();
				System.out.println("q생성완료p");
			}catch(Exception e) {
				System.out.println("d생성실패b");
			}
		}
		
		
		
		
	}
}

package ioservice;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		//파일이름, 생성날짜, 파일종류, 파일크기
		String filepath = "c:/mytemp/test1.txt";
		File file = new File(filepath);
		
		System.out.println(file.getName());			//파일명 - test1
		System.out.println(file.length());			//물리적인 크기 - 21byte
		System.out.println(file.exists());			//존재여부 - true
		System.out.println(file.getPath());			//파일경로 - c:\mytemp\test1.txt
		System.out.println(file.isFile());			//파일인지 여부 - true
		System.out.println(file.isDirectory());		//폴더인지 여부 - false
		System.out.println(file.lastModified());	//마지막 수정 날짜(유닉스 시간) - 1740463379457
		System.out.println("==================================");
		//다양한 기능들
		
		/*
		try {
			file.createNewFile();		//(빈)파일행성	(try_catch)
		}catch (Exception e) {}
		*/
		
		//file.delete();			파일삭제
		//file.listFiles();			파일목록 정보
		
		/*
		File file1 = new File("c:/mytemp/javafolder");
		file1.mkdir();				//폴더 생성
		*/
		
		
	}

}

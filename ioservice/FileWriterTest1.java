package ioservice;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterTest1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String filePath = "c:/mytemp/test1992.txt";
		try {
			//기본은 덮어쓰기(false), 이어쓰기 (true) __ (경로,구분(true or false))
			//파일생성기능
			FileWriter fw = new FileWriter(filePath,true);
			System.out.println("내용써봐");
			String text = scan.next();
			fw.write(text + "\n");	//선 입력 후 줄바꿈
			fw.close();		//작성 해 줘야 내용이 입력됨 & 메모리 공간 확보
			System.out.println("쓰기완료");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
}

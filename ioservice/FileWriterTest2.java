package ioservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/*
 * 파일생성 후 글 쓰기 + 파일 내용 전체 출력
 */

public class FileWriterTest2 {
	//						  try/catch 안쓰기 위한 방법...(throws Exception)
	public static void main(String[] args) throws Exception {
		
		//쓰기
		Scanner scan = new Scanner(System.in);
		System.out.println("써보쇼");
		String text = scan.next();
		String filePath = "c:/mytemp/TTSTT.txt";
	
		FileWriter fw = new FileWriter(filePath,true);
		fw.write(text + "\n");
		fw.close();
		System.out.println("입완");
		
		
		//읽기
		FileReader fr = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(fr);
		while(true) {
			String str = buffer.readLine();
			if(str == null) break;
			System.out.println(str);
		}
		buffer.close();
		fr.close();
	
		
		
		
	}
}

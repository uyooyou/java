package ioservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileCopyTest1 {
	
	public static void main(String[] args) throws Exception {
		String filePath1 = "c:/mytemp/post1.csv";			//원본
		String filePath2 = "c:/mytemp/post1.txt.bak";		//copy

		//filepath1 읽어들이기/출력
		//출력 내부에 write() 기능 넣기
		FileReader file = new FileReader(filePath1);
		BufferedReader buffer = new BufferedReader(file);
		FileWriter fw = new FileWriter(filePath2,true);
		while(true) {
			String str = buffer.readLine();
			if(str == null) {
				break;
			}
			fw.write(str + "\n");
		}
		file.close();
		buffer.close();
		fw.close();	
		System.out.println("입완");
		
		
		
		/*
		//쌤
		FileReader file = new FileReader(filePath1);
		BufferedReader buffer = new BufferedReader(file);
		FileWriter fw = new FileWriter(filePath2,true);
		
		while(true) {
			String str = buffer.readLine();
			if(str == null) {
				break;
			}
			fw.write(str + "\n");
		}
		fw.close();
		buffer.close();
		file.close();
		System.out.println("copy 완료");
		*/
	}
}

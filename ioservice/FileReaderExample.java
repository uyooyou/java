package ioservice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FileReaderExample {
	
	
	public static void dirList(String dirPath) {
		
		File dir = new File(dirPath);
		
		File[] names = dir.listFiles();
		SimpleDateFormat df = new SimpleDateFormat("yyyy--MM-dd");
		
		
		for(int i = 0; i < names.length; i++) {
			String str = "<폴더>";
			if(names[i].isDirectory()) {
				
			String name = names[i].getName();
			
			int len = (int)names[i].length();
			int len2 = len/1024;
			
			long unix = names[i].lastModified();
			String date = df.format(unix);
			
			System.out.println(str + " " + name + " " + len2 + " " + date);
			}
		}
		
			
		for(int i = 0; i < names.length; i++) {	
			String str = "[파일]";
			if(!names[i].isDirectory()) {
				
			String name = names[i].getName();
			
			int len = (int)names[i].length();
			int len2 = len/1024;
			
			long unix = names[i].lastModified();
			String date = df.format(unix);
			
			System.out.println(str + " " + name + " " + len2 + " " + date);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String dirPath = "C:\\eclipse-workspace7\\sample1\\src\\study01";
		//String filePath = "c:/mytemp/java.txt";
		dirList(dirPath);
		
		System.out.print("파일명 : ");
		String filename = scan.next();
		String filePath = dirPath+"\\"+filename;
		
		try {
			
			FileReader file = new FileReader(filePath);
			BufferedReader buffer = new BufferedReader(file);
			
			while(true) {
				String str = buffer.readLine();		//한 줄을 읽어들임
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
			//메모리 잡아먹어서 변수 닫아줌
			buffer.close();
			file.close();
			
		}catch(Exception e) {
			System.out.println("없어");
		}
	}
}

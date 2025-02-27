package ioservice;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MyFileAdmin {

	public static String dirPath = "C:/mytemp";
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 파일관리 ]\n");
		System.out.println("(1)목록출력  (2)파일생성  (3)파일삭제");
		System.out.println("메뉴번호 >> ");
		byte menu = scan.nextByte();
		switch(menu) {
			case 1 : MyFileAdmin.dirList();
			break;
			case 2 : MyFileAdmin.createFile();
			break;
			case 3 : MyFileAdmin.deleteFile();
			break;
			default : System.out.println("## 없는 메뉴 번호 ##");
		}
		
	}
	
	
	public static void dirList() {
		String dirpath = "C:/mytemp";
		
		File dir = new File(dirpath);
		
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
	
	
	public static void createFile() {
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
	
	
	public static void deleteFile() {
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

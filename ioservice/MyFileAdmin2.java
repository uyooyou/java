package ioservice;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyFileAdmin2 {
	
	public static void main(String[] args) {
		
		//클래스  .메소드(변수명)
		//Arrays.sort(0000);    Test 크기 순서대로 자동 정렬메소드
		String[] a0 = {"31:aa,54:bb,8:cc,4:dd"};
		int[] a1 = {31,54,8,4};
		Arrays.sort(a1);		//순차적 정리
//		System.out.println(Arrays.toString(a1));
		System.out.println("===============");
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[파일관리2]\n");
		System.out.println("1.특정 폴더의 이미지 파일 추출");
		System.out.println("2.특정 폴더의 목록을 시간별로 출력");
		System.out.println("3.특정 폴더의 사이즈 출력\n");
		
		System.out.print("메뉴번호 입력 : ");
		int menu = 0;
		try {
			menu = scan.nextInt();	
		}catch(Exception e) {
			System.out.println("숫자로 입력해줘잉");
			return;
		}
		
		System.out.print("폴더명 입력 : ");
		String dirName = scan.next();
		System.out.println("==================================");
		
		switch(menu) {
		case 1 : dirListImage(dirName);
		break;
		case 2 : dirListAllFiles(dirName);
		break;
		case 3 : dirTotalSize(dirName);
		break;
		default : System.out.println("메뉴 번호는 1~3번 사이얌");
		}	
	}
	
	
	//
	public static void dirListImage(String dirName) {
		String dirPath = "c:/"+dirName;
		File dir = new File(dirPath);
		File[] names = dir.listFiles();
		
		for(int i = 0; i < names.length; i++) {
			//jpg, png, jpeg, gif
			String filename = (names[i].getName());
			String[] array = filename.split("\\.");		// "." => 구분자로 사용못함.. "\\"로 의미없는문자로 만들기
			
			int len = array.length;
			String ext = array[len-1];		//★★
			
			if(ext.toUpperCase().equals("JPG") ||
			   ext.toUpperCase().equals("PNG") ||
			   ext.toUpperCase().equals("GIF") ||
			   ext.toUpperCase().equals("JPEG")) {
				System.out.println(filename);
			}
		}
	}
	
	public static void dirListAllFiles(String dirName) {
		//순차적 : 12345
		//역순: 54321
		String dirPath = "c:/"+dirName;
		File dir = new File(dirPath);
		File[] names = dir.listFiles();
		
		Map<String,String> map = new HashMap<String,String>();
		
		long[] unixs = new long[names.length];		//빈 배열 변수 생성
		
		for(int i = 0; i < names.length; i++) {
			
			String fileName = names[i].getName();
			long unix = names[i].lastModified();
			unixs[i] = unix;
			map.put(unix + "",fileName);	//(key값, 데이터값)
			
			// 30 10 20 70 15
			//방법1
//			int[] aa = {10,15,20,30,70}; 	// 하나씩 비교하면서 순서대로 배열
			//방법2
//			int[] bb = new int[100];
//			bb[0] = 10;
//			bb[1] = 15;
			//방법3
			//Arrays.sort(array);
		}
		Arrays.sort(unixs);		//순서대로 배열해줌
		//System.out.println(Arrays.toString(array));		가로출력
		for(int i = 0; i < unixs.length; i++) {
			String name = map.get(unixs[i]+"");
			System.out.println(name + " " + unixs[i]);
		}
		
	}
	
	public static void dirTotalSize(String dirName) {
		String dirPath = "c:/"+dirName;
		File dir = new File(dirPath);
		File[] names = dir.listFiles();
		
		long sum = 0;
		for(int i = 0; i < names.length; i++) {
			long fileSize = names[i].length();
			sum += fileSize;
		}
		System.out.println(dirName + "폴더크키 : " + sum);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

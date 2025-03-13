package ioservice;
/*
 * 추가사항작성  __  쌤거 보고 다시 써봐 == 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterTest3 {
	 
	public static String filePath = "c:/mytemp/member_db2.txt";
	
	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("[학생정보관리]");
		System.out.println("1.정보등록");
		System.out.println("2.정보출력");
		System.out.println("3.검색");
		System.out.println("4.정보삭제");
		System.out.println("5.일괄등록");
		System.out.print("번호입력 : ");
		int menu = scan.nextInt();
		switch(menu) {
		case 1 : setMemberInfo();
		break;
		case 2 : getMemberInfo();
		break;
		case 3 : searchMemberInfo();
		break;
		case 4 : delMemberInfo();
		break;
		case 5 : inputBatch();
		break;
		default : System.out.println("없는메뉴");
		}
		
	}
	
	//1
	public static void setMemberInfo() throws Exception {

		Scanner scan = new Scanner(System.in);
		FileWriter fw =  new FileWriter(filePath,true);
		BufferedWriter buffer = new BufferedWriter(fw);
		
		String data = "";
		while(true) {
			System.out.println("학생정보등록(완료 : \".\") : ");
			
			String text = scan.next();
			if(text.equals(".")) {
				System.out.print("저장? Y or N");
				String yn = scan.next();
				if(yn.toUpperCase().equals("Y")) {
					break;	
				}else {
					continue;
				}
				
			}
			data += text;
			data += "\n";
			System.out.print("-보관함에 넣음- \n");	
		}
		buffer.write(data);
		buffer.close();
		System.out.println("\n-저장완료-");
	}
	
	//2
	public static void getMemberInfo() throws Exception {

		FileReader file = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(file);
		
		while(true) {
			String str = buffer.readLine();
			if(str == null) break;
			System.out.println(str);
		}
	}
	
	//5
	public static void inputBatch() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명 : ");
		String name = scan.next();
		String path = "c:/mytemp/" + name;
		File fi = new File(path);
		if(fi.exists() == false) {
			System.out.println("파일명 확인 안해?ㅡㅡ");
			return;
		}

		FileReader file = new FileReader(path);
		BufferedReader buffer = new BufferedReader(file);
		String datas = "";
		while(true) {
			String str = buffer.readLine();
			if(str == null) break;
			str = str.trim();
			datas += str + "\n";
		}
		if(datas.equals("")) {
			System.out.println("입력할 데이터 없음");
			return;
		}
		buffer.close();
		file.close();
		
		FileWriter fw = new FileWriter(filePath,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(datas);
		bw.close();
		fw.close();
		System.out.println("일괄처리완료");
	}
	
	//3
	public static void searchMemberInfo() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생명 검색 : ");
		String searchWord = scan.next();
		
		FileReader file = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(file);
		
		int cnt = 0;
		while(true) {
			String str = buffer.readLine();
			if(str == null) break;
			if(str.indexOf(searchWord) > -1) {
				System.out.println(str);
				cnt++;
			}
		}
		if(cnt == 0) {
			System.out.println(searchWord + "(은)는 없는정보입니다.");
		}
	}
	
	//4
	public static void delMemberInfo() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제 학생명 : ");
		String searchWord = scan.next();
		
		FileReader file = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(file);
		
		int cnt = 0;
		String datas = "";	//누적변수생성
		
		while(true) {
			String str = buffer.readLine();
			if(str == null) break;
			if(str.indexOf(searchWord) > -1) {
				cnt++;
			}else {
				datas += str + "\n";
			}
		}
		if(cnt == 0) {
			System.out.println(searchWord + "(은)는 없는정보입니다.");
		}else {
			FileWriter fw = new FileWriter(filePath,false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(datas);
			bw.close();
			fw.close();
			System.out.println(searchWord + "의 정보가 삭제되었습니다.");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package ioservice;
/*
 * 추가사항작성22
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterTest2 {
	
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		String filePath = "c:/mytemp/member_db.txt";
		
		FileWriter fw =  new FileWriter(filePath,true);
		BufferedWriter buffer = new BufferedWriter(fw);
		
		String data = "";
		while(true) {
			System.out.println("학생정보등록(완료 : \".\") : ");
			
			String text = scan.next();
			if(text.equals(".")) break;
			data += text;
			data += "\n";
			System.out.print(data);
			
		}
		
		buffer.write(data);
		buffer.close();
		System.out.println("__등록완료__");
		
	}

}

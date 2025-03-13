package ioservice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterTest1 {
	
	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		String filePath = "c:/mytemp/member_db.txt";
		
		FileWriter fw =  new FileWriter(filePath,true);
		BufferedWriter buffer = new BufferedWriter(fw);
		
		while(true) {
			System.out.println("학생정보등록(중지 : \".\") : ");
			String data = scan.next();
			if(data.equals(".")) {
				System.out.println("중지");
				break;
			}
			buffer.write(data);
			buffer.newLine();	//개행(이어쓰기시 유용)
			System.out.println("__등록완료__");
		}
		buffer.close();
		
		
		
		
	}

}

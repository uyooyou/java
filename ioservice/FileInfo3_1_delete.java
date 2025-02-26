package ioservice;

import java.io.File;
import java.util.Scanner;

public class FileInfo3_1_delete {

	public static void main(String[] args) {
		String dirPath = "C:/mytemp";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제파일이름 결정해 : ");
		String filename = scan.next();
		String filePath = dirPath+"/"+filename;
		
		File file = new File(filePath);
		if(file.exists()) {
			
			file.delete();
			System.out.println(" ** 삭제완료 ** ");
		}else {
				System.out.println("존재하지않음");
		}
	}

}

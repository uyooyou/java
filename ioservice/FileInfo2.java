package ioservice;

import java.io.File;
import java.util.Calendar;

public class FileInfo2 {
	
	public static void main(String[] args) {
		String filepath = "c:/mytemp/test1.txt";
		File file = new File(filepath);
		
		System.out.println("파일이름 : " + file.getName());			//파일명 - test1
		System.out.println("파일크기 : " + file.length());			//물리적인 크기 - 21byte
		System.out.println("존재여부 : " + ((file.exists())?"존재":"부재") );			//존재여부 - true
		System.out.println("파일경로 : " + file.getPath());			//파일경로 - c:\mytemp\test1.txt
		System.out.println("파일여부 : " + ((file.isFile())?"파일":"파일아님") );			//파일인지 여부 - true
		System.out.println("폴더인가 : " + ((file.isDirectory())?"폴더":"폴더아님") );		//폴더인지 여부 - false
		
		//System.out.println("수정날짜 : " + file.lastModified());	//마지막 수정 날짜(유닉스 시간) - 1740463379457
		long unix = file.lastModified();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(unix);
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH);
		int dd = cal.get(Calendar.DATE);
		System.out.println("수정날짜 : " + yy + "." + (mm + 1) + "." + dd);
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

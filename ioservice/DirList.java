package ioservice;

import java.io.File;
import java.text.SimpleDateFormat;

public class DirList {
	
	public static void main(String[] args) {
	
		String dirpath = "C:/mytemp";
		//String dirpath = "C:\\eclipse-workspace7";
		
		File dir = new File(dirpath);
		
//		String[] str = {"aa","bb"};
//		int[] nn = {11,22};
		//String[] ss = {"aa",22};	타입이 다르면 안됨
		//물리적인 파일 또는 폴더의 배열 _ 폴더에 유효함
		File[] names = dir.listFiles();
		SimpleDateFormat df = new SimpleDateFormat("yyyy--MM-dd");
		for(int i = 0; i < names.length; i++) {
			String str = "[파일]";
			if(names[i].isDirectory()) {
				str = "<폴더>";
			}
			String name = names[i].getName();
			int len = (int)names[i].length();
			long unix = names[i].lastModified();
			
			String date = df.format(unix);
			
			int len2 = len/1024;
			System.out.println(str + ", " + name + ", " + len2 + ", " + date);
		}
		
	}
	
}

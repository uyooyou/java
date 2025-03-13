package ExamFolder2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

//post.csv 파일을 근거로 우편번호만 추출하여 ArrayList에담고 출력_동일한 우편번호는 담지 않음
public class TestArrayList {
	
	public static void main(String[] args) throws Exception {
		//경로설정
		String filePath = "c:/mytemp/post1.csv";
		//일어들이기
		FileReader file = new FileReader(filePath);		//경로인식
		BufferedReader br = new BufferedReader(file);	//일어들이는 메소드
		List<String> list = new ArrayList<String>();
		
		
		long s1 = System.nanoTime();
		long u1 = System.currentTimeMillis();
		
		
		
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			String[] datas = str.split(",");
			
			int cnt = 0;
			int z = 0;
			while(z < list.size()) {
				if(list.get(z).equals(datas[0])) cnt = 1;
				z++;
			}
			
//			for(String data : list) {
//				if(data.equals(datas[0])) cnt = 1;
//			}
			if(cnt == 0) {
				list.add(datas[0]);
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " " + (i+1));
		}
		//확장for문(배열)
		// (출력변수 : 배열변수)
//		for(String post : list) {
//			System.out.println(post);
//		}
		long s2 = System.nanoTime();
		long u2 = System.currentTimeMillis();

		System.out.println("===========================");
		System.out.println(u2 - u1);
		System.out.println(s2 - s1);
	}

}

package myThread;

import java.util.ArrayList;
import java.util.List;

//ArrayList 형식으로 저장후 중복 방지처리

public class Lotto5 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		int i = 0;
		String str = "";
		while(true) {
			int check = 0;
			int num = (int)(Math.random()*45) + 1;
			
			for(int nm : list) {
				if(nm == num) {
					check = 1;
					str += num + "";
				}
			}
			if(check == 0) {
				list.add(num);	//데이터적재..
				i++;	
			}
			if(i == 6) break;
		}
		
		
		
		//두가지 형태의 for 문
		System.out.print("그냥for : ");
		for(int j = 0; j < list.size(); j++) {
			System.out.print(list.get(j) + " ");
		}
		System.out.println();
		
	  //for(데이터 타입 및 변수명 : 배열변수)
		System.out.print("확장for : ");
		for(int n : list) {		//확장 for 문 : 배열형식의 데이터만 가능
			System.out.print(n + " ");
		}

		System.out.println();
		System.out.println(str);
		
	}
}

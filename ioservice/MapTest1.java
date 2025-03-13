package ioservice;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {
		/*
		 * Map : 임시 저장소
		 */
		
		Map<String,String> map = new HashMap<String,String>();		//인스턴스화_사용가능상태 만듦
		
		//	   (key  ,value)
		map.put("eng","100");
		map.put("kor", "85");
		map.put("math","98");

	//key값 세팅, value값 얻기(map.get( key ));
		System.out.println(map.get("eng"));
		System.out.println(map.get("kor"));
		System.out.println(map.get("math"));
		
	}
}

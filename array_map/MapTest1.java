package array_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest1 {
	/*
	 * list와는 다르게 번호순번 상관 없음
	 */
	public static void main(String[] args) {
	  //참조클래스  참조변수		      = new 생성자
		Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();

		map1.put(0,10);
		map1.put(1,20);
		map1.put(2,30);
		map1.put(3,40);
		map1.put(4,50);

		System.out.println(map1.get(1));	//20
		System.out.println(map1.get(2));	//30
		System.out.println(map1.get(3));	//40
		//데이터 삭제후 채워지지 않음
		map1.remove(1);
		System.out.println(map1.get(1));	//null
		System.out.println(map1.get(2));	//30
		System.out.println(map1.get(3));	//40

		System.out.println("\n======================\n");
		
		
		
		
		
		Map<Integer,Integer> map2 = new HashMap<Integer,Integer>();
		Map<Integer,Integer> map3 = new HashMap<Integer,Integer>();
		Map<String,String> map4 = new HashMap<String,String>();

		map4.put("userid","cjf");
		map4.put("name","홍");
		map4.put("userpw","cjf11");
		map4.put("gender","M");
		
		Iterator<String> keys = map4.keySet().iterator();
//		int j = 0;
//		while (j<map4.size()) {
//			String key = keys.next();
//			System.out.println(map4.get(key));
//			j++;
//		}
		//반목문 간소화
		while (keys.hasNext()) { 	//hasNext : 존재여부
			String key = keys.next();
			System.out.println(map4.get(key));
		}
//		for() {
//			//key값이 자동으로...
//			System.out.println(map4.get("name"));
//		}
		
		//System.out.println(map4.get("name"));
		//System.out.println(map4.get("userid"));

		System.out.println("\n======================\n");
		
		
//		map1.put(0,10);
//		map1.put(1,20);
//		map1.put(2,30);
//		map1.put(3,40);
//		map1.put(4,50);
//
//		System.out.println(map1.get(0));
//		System.out.println(map1.get(1));
		

		System.out.println("\n======================\n");

		map2.put(11, 100);
		map2.put(12, 200);
		map2.put(13, 300);
	
		System.out.println(map2.get(11));
		System.out.println(map2.get(12));
	
		
		map3.put(77, 2200);
		map3.put(23, 3300);
		System.out.println(map3.get(23));
		
		for(int i = 0; i<map3.size(); i++) {
			
		}
		System.out.println("\n======================\n");

		
		
		
	}
	
}

package arrayMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayMapShop {
	
	public static List setShopListDatas(String fileName) {
		
		
		
		return null;
	}

	public static void main(String[] args) {
		
		List<Map> list = new ArrayList<Map>();
		Map<String,String> map = new HashMap<String,String>();
		map.put("상품코드","10001");
		map.put("상품명","10002");
		map.put("가격","10003");
		map.put("지은이","10004");
		list.add(map);
		
		for(int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).get("상품코드"));
			System.out.println(list.get(i).get("상품명"));
			System.out.println(list.get(i).get("가격"));
			System.out.println(list.get(i).get("지은이"));
			System.out.println("=======================");
			
		}
	}

}

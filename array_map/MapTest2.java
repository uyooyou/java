package array_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest2 {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();

		map.put("영어",69);
		map.put("국어",87);
		map.put("수학",26);
		
		Iterator<String> keys = map.keySet().iterator();
		int sum = 0;
		double avg = 0;
		String str = "";
		while(keys.hasNext()) {		//존재여부 판단하여 실행
			String key = keys.next();	//값을 가져오는 메소드
			int score = map.get(key);
			if(score < 60) {
				str += key + ",";
			}
			sum += score;	//score에 값 누적
		}
		
		avg = (double)sum/map.size();	//실수타입 결과 획득
	  //String avg2 = avg + "";		//형변환
		String avg2 = Double.toString(avg);
		int dotIndex = avg2.indexOf(".");
		avg2 = avg2.substring(0,dotIndex+3);

		
		if(!str.equals("")) {
			str = str.substring(0,str.length()-1);
		}else {
			str = "과락 없음";
		}

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg2);
		System.out.println("낙제 : " + str);
		
	}

}

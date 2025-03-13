package arrayMap;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest1 {

	public static void main(String[] args) {
		
		//요놈은 삭제가 없고 몇개를 입력할지 정해줘야함.. 유연하지 못함
		int[] ar1 = new int[5];
		ar1[0] = 10;
		ar1[1] = 20;
		ar1[2] = 40;
		ar1[3] = 60;
		for(int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		
		
		
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<String> list2 = new ArrayList<String>();
		List<Double> list3 = new ArrayList<Double>();
		List list4 = new ArrayList();	//가능은 하나 가급적 타입을 써줘..
		
		list1.add(50);
		list1.add(100);
		list1.add(200);
		//list1.add(a100);	X
		//list1.add(1.5);	X
		System.out.println(list1.get(1));	//100
		list1.remove(1);
		System.out.println(list1.get(1));	//200
		
		list2.add("java");
		list2.add("react");
		//list2.add(123);	xx
		
		list3.add(1.5);
		list3.add(3.14159);

		list4.add(11);
		list4.add("aa");
		list4.add(5.4);
		list4.add(true);
		
		for(int i = 0; i < list4.size(); i++) {
			System.out.println(list4.get(i));
		}
		
		System.out.println("\n==================\n");
		
//		System.out.println(list1.get(0));
//		System.out.println(list1.get(1));
//		System.out.println(list1.get(2));
//		
//		System.out.println("\n==================\n");
//		
//		System.out.println(list2.get(0));
//		System.out.println(list2.get(1));
//
//		System.out.println("\n==================\n");
//		
//		System.out.println(list3.get(0));
//		System.out.println(list3.get(1));
//
//		System.out.println("\n==================\n");
//
//		System.out.println(list4.get(0));
//		System.out.println(list4.get(1));
//		System.out.println(list4.get(2));
//		System.out.println(list4.get(3));
//		System.out.println(list4.get(5));
		
		
		

		//인덱스번호는 0번부터 자동부여
		//직접입력시 무조건 0번부터 순차입력
		//데이터 삭제시 밑에서 위로 자동 채움
		
		List<Integer> list5 = new ArrayList<Integer>();
		list5.add(0,11);
		list5.add(1,22);
		list5.add(2,22);
		System.out.println(list5.get(1));
		
		//시작은 무조건 0번부터.. 오류
		List<Integer> list6 = new ArrayList<Integer>();
//		list6.add(10,111);
		list6.add(0,222);
//		list6.add(2,333);	건너띄기도 불가
		System.out.println(list6.get(2));

		System.out.println("\n==================\n");
		
		

	}
	
}
	
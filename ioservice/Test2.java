package ioservice;

public class Test2 {
	
	public static void main(String[] args) {
		
//		String aa = "2025-12-25";
//		String[] bb = aa.split("-");
		
		int[] numbers = {56,564321,684,56,468};
	  //배열변수와 출력변수의 타입은 동일해야함
	  //for(출력변수 :   배열  )
		for(int a : numbers) {
			System.out.println(a);
		}
		
		System.out.println("==================");
		
		for(int nn : numbers) {
			System.out.println(nn);
		}
		
		System.out.println("==================");
		
		String[] subjects = {"html","java","oracle"};
		
		for(String sb : subjects) {
			System.out.println(sb);
		}
		
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		
		
		
		
		
		
		
		
	}
}

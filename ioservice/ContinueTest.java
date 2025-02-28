package ioservice;

import java.util.Scanner;

public class ContinueTest {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		
		while(true) {
			System.out.println("00");
			System.out.println("11");
			
			System.out.println("계속 : Y, 종료 : N, 다시실행 : R");
			String str = scan.next();
			if(str.toUpperCase().equals("N")) {
				break;
			}else if(str.toUpperCase().equals("R")) {
				continue;
			}else {
				System.out.println("진행");
			}
				
			System.out.println("22");
			System.out.println("====");
		}
		System.out.println("end");
		
	}
}

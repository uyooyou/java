package Study06;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = 0;
		 while(true) {
			 if(number != 0 && number%10000000 == 0) {
				 System.out.print("계속 (Y),  종료 (N) : ");
				 String str = scan.next();
				 if(str.equals("N")) {
					 System.out.println("종료됨");
					 break;
				 }else if(!str.equals("Y")) {
					 continue;
				 }
			 }
			 
			 number++;
			 System.out.println(number);
			 
		 }
		
		
		

	}

}

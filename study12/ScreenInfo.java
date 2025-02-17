package study12;

import java.util.Scanner;

public class ScreenInfo {

	String movieTitle = "";
	int ticketPrice = 10000;
	
	/*
	 * 생성자, 다형성(오버로딩)
	 */
	
	ScreenInfo(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	
	ScreenInfo(String movieTitle, int ticketPrice) {
		this.movieTitle = movieTitle;
		this.ticketPrice = ticketPrice;
	}
	
	
	public static void main(String[] args) {
		ScreenInfo info1 = new ScreenInfo("미이라");
		ScreenInfo info2 = new ScreenInfo("아마존",15000);

		System.out.println(info1.movieTitle);
		System.out.println(info2.movieTitle);

		System.out.println(info1.ticketPrice);
		System.out.println(info2.ticketPrice);
		
	
		//Scanner scan = new Scanner(System.in);
		
	}

}

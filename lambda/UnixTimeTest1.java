package lambda;

import java.util.ArrayList;
import java.util.List;

interface MyNanoTime {
	public long method();
}


public class UnixTimeTest1 {

	public static void main(String[] args) {
		
		MyNanoTime nano =()-> {
			return System.nanoTime();
		};

		long nano1 = nano.method();
		
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < 10000; i++) {
			list.add(i+"");
		}
		
		long nano2 = nano.method();
		System.out.println(nano2-nano1);
		
		
		

		nano1 = nano.method();
		
		list = new ArrayList<String>();
		int i = 0;
		while(i<10000) {
			list.add(i+"");
			i++;
		}
		
		nano2 = nano.method();
		System.out.println(nano2-nano1);
	}
}

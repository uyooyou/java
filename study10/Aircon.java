package study10;

public class Aircon {

	public static void main(String[] args) {
		MyRemocon3 air = new MyRemocon3();
		
		//전원
		air.pow();
		
		System.out.println(air.temp);
		//온도증가
		air.tempUp();
		air.tempUp();
		System.out.println("온도 " + air.temp);
		
		//운전선택
		System.out.println("운전 " + air.drive);
		air.setDrive();
		System.out.println("운전 " + air.drive);
		air.setDrive();
		System.out.println("운전 " + air.drive);
		air.setDrive();
		System.out.println("운전 " + air.drive);
		air.setDrive();
		System.out.println("운전 " + air.drive);
		
		//바람세기
		System.out.println("바람 " + air.wind);
		air.setWind();
		System.out.println("바람 " + air.wind);
		air.setWind();
		System.out.println("바람 " + air.wind);
		air.setWind();
		System.out.println("바람 " + air.wind);
		air.setWind();
		System.out.println("바람 " + air.wind);

		//실내온도
		air.setTemp25();
		System.out.println("현재온도 " + air.temp);
		System.out.println("운전상태 " + air.drive);
		
		

	}

}

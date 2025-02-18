package study13;

class CarInfo2{
	
	//private은 상속이 안됨
	private String maker;
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	String carName;
	String carColor;
	int valocity;
}

public class CarColor extends CarInfo2 {
	
	public CarColor(String color, String name,int speed) {
		carName = name;
		valocity = speed;
		carColor = color;
	}
	
	
	public static void main(String[] args) {
		CarColor cc= new CarColor("white","Sonata",100);
		System.out.println(cc.carName + cc.valocity + cc.carColor);
	}
}

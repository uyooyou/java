package study12;

public class MyCar {
	int maxSpeed;
	String carName;
	String carColor;


	MyCar() {}
	
	MyCar(String carName,int maxSpeed) {
		this.carName = carName;
		this.maxSpeed = maxSpeed;
	}
	MyCar(String carName,int maxSpeed,String carColor) {
		this.carName = carName;
		this.maxSpeed = maxSpeed;
		this.carColor = carColor;
	}
	
	//메소드 생성
	public void maxSpeedUpdate(int speed) {
		this.maxSpeed += speed;
	}
	
	
	public static void main(String[] args) {
		
		MyCar mycar = new MyCar();
		mycar.carName = "마이바흐";
		mycar.maxSpeed = 790;
		mycar.carColor = "yellow";
		
		
		
		MyCar car1 = new MyCar("SONATA",230);
		System.out.println(car1.carName + "," + car1.maxSpeed);
		car1.maxSpeedUpdate(-20);
		System.out.println(car1.carName + "," + car1.maxSpeed);
		
		MyCar car2 = new MyCar("GENESIS",280,"skyblue");
		System.out.println(car2.carName + "," + car2.maxSpeed + "," + car2.carColor);
		
	}

}

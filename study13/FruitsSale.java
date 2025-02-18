package study13;

public class FruitsSale extends CherryInfo {	//상속(extends 부모클래스명)
	
	//공유 메모리에 올라감
	static String maker = "KOR";	//맴버변수, 클래스(전역)변수
	
	public static void main(String[] args) {
		//CherryInfo cherry = new CherryInfo();
		FruitsSale cherry = new FruitsSale();

		System.out.println(FruitsSale.maker);
		System.out.println(cherry.price);
		cherry.discount();
		System.out.println(cherry.price);
		
	}
	
}

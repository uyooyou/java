package study13;

class Product {
	//캡슐화
	private String name = "생산품명";
	private int price;
	private String maker = "한국";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
}



//클래스에 붙은 public : 일반(메인)클래스를 의미
public class Mouse extends Product {
	
	//부모클래스의 메소드를 오버라이딩
	public void setPrice(int price) {
		if(price < 1000) {
			price = 1000;
		}else if(price > 10000) {
			price = 10000;
		}
		//부모클래스의 메소드 실행
		super.setPrice(price);
	}
	
	
	
	
	//오버로딩
	public Mouse(String name, int price, String maker) {
		setName(name);
		setPrice(price);
		setMaker(maker);
	}
	
	
	public void input(String name, int price, String maker) {
		setName(name);
		setPrice(price);
		setMaker(maker);
	}
	
	public void print() {
		System.out.println(getName() + getPrice() + getMaker());
	}
	
	
	
	public static void main(String[] args) {
		Mouse m1 = new Mouse("blueMouse",50000,"America");
		Mouse m2 = new Mouse("redMouse",60000,"America");
		
		//Mouse m1 = new Mouse();
		//Mouse m2 = new Mouse();

		//m1.input("blueMouse",50000,"America");
		//m2.input("redMouse",500000,"America");

		m1.print();
		m2.print();
		
	}

}

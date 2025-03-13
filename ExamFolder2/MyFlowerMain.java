package ExamFolder2;
//상속,메소드
class MyFlowerInfo extends FlowerInfo {
	String size;
	int price;
	
	public void discount() {
		this.price = price - (price/8);
	}
}

public class MyFlowerMain{

	public static void main(String[] args) {
		MyFlowerInfo mfi = new MyFlowerInfo();
		
		mfi.setFlowerName("아카시아");
		mfi.setFlowerColor("White");
		mfi.size = "대";
		mfi.price = 50000;
		System.out.println("꽃 : " + mfi.getFlowerName() + "\n" + 
						   "색상 : " + mfi.getFlowerColor() + "\n" +
						   "크기 : " + mfi.size + "\n" + 
						   "가격 : " + mfi.price);
		System.out.println("\n======================\n");
		mfi.discount();
		System.out.println("꽃 : " + mfi.getFlowerName() + "\n" + 
						   "색상 : " + mfi.getFlowerColor() + "\n" +
				           "크기 : " + mfi.size + "\n" + 
				           "할인된 가격 : " + mfi.price);
	}
	
	
}

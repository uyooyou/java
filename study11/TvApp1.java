package study11;

class TvInfo {
	String model;
	String color;
	int size;
	int price;
}

public class TvApp1 {
	public static void main(String[] args) {
		TvInfo tv1 = new TvInfo();
		TvInfo tv2 = new TvInfo();
		tv1.model = "M01TV";
		tv1.color = "RED";
		tv1.size = 50;
		tv1.price = 150;

		tv2.model = "M02TV";
		tv2.color = "WHITE";
		tv2.size = 80;
		tv2.price = 250;

		System.out.println("모델명 : " + tv1.model + ",가격 : " + tv1.price);
		System.out.println("모델명 : " + tv2.model + ",가격 : " + tv2.price);
		
	}

}

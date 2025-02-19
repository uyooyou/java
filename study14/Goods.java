package study14;

abstract class GoodsInfo {
	public int quantity;
	abstract public void quantityUp(int n);
	abstract public void quantityDown(int n);
	public void quantityZero() {
		quantity = 0;
	}
}



public class Goods extends GoodsInfo {
	
	public void quantityUp(int n) {
		quantity += n;
	}
	public void quantityDown(int n) {
		if(quantity < n) {
			//quantity = 0;		변수에 직접세팅은 좋지않아
			quantityZero();		//메소드 사용
		}else {
			quantity -= n;	
		}
	}
	
	public static void main(String[] args) {
	Goods goods = new Goods();
	System.out.println(goods.quantity);
	goods.quantityUp(100);
	System.out.println(goods.quantity);
	goods.quantityDown(50);
	System.out.println(goods.quantity);
	goods.quantityDown(50);
	System.out.println(goods.quantity);
	goods.quantityDown(50);
	System.out.println(goods.quantity);
	goods.quantityZero();
	System.out.println(goods.quantity);
	}
	
}

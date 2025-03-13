package ExamFolder2;
//get/set
class FlowerInfo{
	private String flowerName;
	private String flowerColor;
	
	public String getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}
	
	public String getFlowerColor() {
		return flowerColor;
	}
	public void setFlowerColor(String flowerColor) {
		this.flowerColor = flowerColor;
	}
}

public class FlowerMain {

	public static void main(String[] args) {
		FlowerInfo fi = new FlowerInfo();
		fi.setFlowerName("튤립");
		fi.setFlowerColor("바이올렛");
		
		System.out.println("꽃 : " + fi.getFlowerName() + "\n" + "색상 : " + fi.getFlowerColor());
		
	}
	
}

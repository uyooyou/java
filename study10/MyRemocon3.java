package study10;

public class MyRemocon3 {
	// 전원
	boolean pow = false;
	// 온도
	int temp = 20;
	// 바람세기 (A 미풍, B 약풍, C 강풍)
	char wind = 'A';
	// 운전선택 (A 난방, B 냉방, C 송풍, D 제습)
	char drive = 'A';
	
	public void pow() {
		pow = !pow;
	}
	
	public void tempUp() {
		if(temp < 30) {
			temp++;
		}
	}
	public void tempDown() {
		if(temp > 10) {
			temp--;
		}
	}
	
	// 바람세기 (A 미풍, B 약풍, C 강풍)
	public void setWind() {
		wind++;
		if(wind == 'D') {
			wind = 'A';
		}
	}

	// 운전선택 (A 난방, B 냉방, C 송풍, D 제습)
	public void setDrive() {
		drive++;
		if(drive == 'E') {
			drive = 'A';
		}
	}
	
	public void setTemp25() {
		temp = 25;
	}
	
	
	
	
	
	
	
	
}

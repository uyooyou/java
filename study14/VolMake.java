package study14;

//캡슐화, 다형성(오버라이딩), 상속(implements), 추상화(interface)

public class VolMake implements VolService{
	private int volumn;		//맴버변수, 인스턴스변수 _ 기본값 0세팅
	
	public int getVolumn() {
		return volumn;
	}
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	
	
	public VolMake() {
		volumn = 1;
	}
	
	
	@Override
	public void volUp(int volumn) {
		this.volumn += volumn;
	}

	@Override
	public void volDown(int volumn) {
		this.volumn -= volumn;
	}
	

}

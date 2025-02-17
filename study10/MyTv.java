package study10;

public class MyTv {

	public static void main(String[] args) {
		MyRemocon tv = new MyRemocon();		//인스턴스화 시키기
		
		System.out.println("전원 : " + tv.power);
		tv.power();
		System.out.println("전원 : " + tv.power + ", 채널 : " + tv.channel);
		tv.channel = 11;
		System.out.println("전원 : " + tv.power + ", 채널 : " + tv.channel);
		tv.channelDown();
		System.out.println("전원 : " + tv.power + ", 채널 : " + tv.channel);
		tv.channelUp();
		tv.channelUp();
		System.out.println("전원 : " + tv.power + ", 채널 : " + tv.channel);
		tv.power();
		System.out.println("전원 : " + tv.power);
		
	}

}

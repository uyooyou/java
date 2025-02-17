package study10;

public class MyTv2 {

	public static void main(String[] args) {
		MyRemocon2 mr = new MyRemocon2();

		System.out.println(mr.power);
		mr.power();		//false => ture
		System.out.println(mr.power);
		System.out.println("채널 : " + mr.channel);
		mr.channelUp();
		mr.channelUp();
		System.out.println("채널 : " + mr.channel);
		mr.setChannel(99);
		System.out.println("채널 : " + mr.channel);
		mr.channelUp();
		System.out.println("채널 : " + mr.channel);
		mr.channelUp();
		System.out.println("채널 : " + mr.channel);
		mr.channelUp();
		System.out.println("채널 : " + mr.channel);
		mr.setChannel(590);
		System.out.println("채널 : " + mr.channel);
		mr.channelDown();
		System.out.println("채널 : " + mr.channel);
		mr.channelDown();
		System.out.println("채널 : " + mr.channel);
		mr.channelDown();
		System.out.println("채널 : " + mr.channel);
		mr.channelDown();
		System.out.println("채널 : " + mr.channel);
		mr.power();
		System.out.println(mr.power);
		}

}

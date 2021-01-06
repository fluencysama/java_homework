package package_homework_chapter9;

public class TestTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("tv1's channel is " + tv1.channel
				+ " and voluem level is " + tv1.volumeLevel1);
		
		System.out.println("tv2's channel is " + tv2.channel
				+ " and voluem level is " + tv2.volumeLevel1);
		
	}

}

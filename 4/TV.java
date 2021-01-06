package package_homework_chapter9;

public class TV {
	int channel = 1 ;
	int volumeLevel1 = 1;
	boolean on =false;
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if(on && newChannel >=1 && newChannel <=120)
			channel = newChannel;
	}
	
	public void setVolume(int newVolumeLevel1) {
		if(on && newVolumeLevel1>=1 && newVolumeLevel1 <=7)
			volumeLevel1 = newVolumeLevel1;
	}
	
	public void channelUp() {
		if(on && channel <120)
			channel++;
	}
	
	public void channelDown() {
		if(on && channel >1)
			channel--;
	}
	
	public void volumeUp() {
		if(on && volumeLevel1 < 7)
			volumeLevel1++;
	}
	
	public void volumeDown() {
		if(on && volumeLevel1 >1)
			volumeLevel1--;
	}
}

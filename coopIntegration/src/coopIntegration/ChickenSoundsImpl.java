package coopIntegration;

import java.io.IOException;


public class ChickenSoundsImpl implements ChickenSounds{

	
	public void playOpenSound(String openSoundLocation) {
		//Runtime.getRuntime().exec("sudo reboot");		
		String openSound = "omxplayer "+openSoundLocation;		
		ProcessBuilder executeSound = new ProcessBuilder(openSound);
		try {
			executeSound.start();
		} catch (IOException exception) {			
			exception.printStackTrace();
		}
		
	}

	
	public void playCloseSound(String closeSoundLocation) {
		//Runtime.getRuntime().exec("sudo reboot");
				
				String closeSound = "omxplayer "+closeSoundLocation;		
				ProcessBuilder executeSound = new ProcessBuilder(closeSound);
				try {
					executeSound.start();
				} catch (IOException exception) {			
					exception.printStackTrace();
				}
	}
		
}

package coopIntegration;

import java.io.IOException;

import coopDataStructures.ConfigFile;

public class ChickenSoundsImpl implements ChickenSounds{

	
	public void playOpenSound() {
		//Runtime.getRuntime().exec("sudo reboot");
		CoopConfigImpl getConfig = new CoopConfigImpl();
		ConfigFile config = getConfig.readConfigFile();
		String openSound = "omxplayer "+config.getMp3Open();		
		ProcessBuilder executeSound = new ProcessBuilder(openSound);
		try {
			executeSound.start();
		} catch (IOException exception) {			
			exception.printStackTrace();
		}
		
	}

	
	public void playCloseSound() {
		//Runtime.getRuntime().exec("sudo reboot");
				CoopConfigImpl getConfig = new CoopConfigImpl();
				ConfigFile config = getConfig.readConfigFile();
				String closeSound = "omxplayer "+config.getMp3Close();		
				ProcessBuilder executeSound = new ProcessBuilder(closeSound);
				try {
					executeSound.start();
				} catch (IOException exception) {			
					exception.printStackTrace();
				}
	}
		
}

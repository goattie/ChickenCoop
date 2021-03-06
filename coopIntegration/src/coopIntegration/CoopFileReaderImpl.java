package coopIntegration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import coopDataStructures.CoopConfig;

public class CoopFileReaderImpl implements CoopFileReader {

	public CoopConfig readConfigFile() {
		CoopConfig config = new CoopConfig();		
		File configFile = new File("src/resources/coopConfig.txt");
		String line;

	    try {

	        BufferedReader bufferreader = new BufferedReader(new FileReader(configFile));
	        line = bufferreader.readLine();

	        while (line != null) {     
	        	String subLine=line.substring(0, line.indexOf('='));
	        	if(subLine.equalsIgnoreCase("sunrisePreset")){
	        		config.setSunrisePreset(line.substring(line.indexOf('=')+1));
	        	} else if(subLine.equalsIgnoreCase("sunsetPreset")){
	        		config.setSunsetPreset(line.substring(line.indexOf('=')+1));
	        	} else if(subLine.equalsIgnoreCase("mp3Open")){
	        		config.setMp3Open(line.substring(line.indexOf('=')+1));
	        	} else if(subLine.equalsIgnoreCase("mp3Close")){
	        		config.setMp3Close(line.substring(line.indexOf('=')+1));
	        	}
	            line = bufferreader.readLine();
	        }

	        bufferreader.close();
	        
	    } catch (FileNotFoundException ex) {
	        ex.printStackTrace();
	    } catch (IOException ex) {
	        ex.printStackTrace();
	    }
		return config;
	}

}

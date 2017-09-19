package coopCore;

import coopDataStructures.ConfigFile;
import coopIntegration.CoopConfig;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class CoopDriver {

	public static void main (String args[]) {
		CoopConfig configReader = null;
		ConfigFile config = configReader.readConfigFile();
		boolean doorState = false;
		Timer timer = new Timer();
		Calendar date = Calendar.getInstance();
		
		while(true){
			
			date.set(
			Calendar.DAY_OF_WEEK,
			Calendar.SUNDAY
			);
			date.set(Calendar.HOUR, 0);
			date.set(Calendar.MINUTE, 0);
			date.set(Calendar.SECOND, 0);
			date.set(Calendar.MILLISECOND, 0);
			// Schedule to run every Sunday in midnight
			timer.schedule(
			  new ReportGenerator(),
			      date.getTime(),
			      1000 * 60 * 60 * 24 * 7
			);
			
			
		}
		
	}
	
}

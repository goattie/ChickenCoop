package coopIntegration;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import coopDataStructures.CoopConfig;

public class TemperatureSensorImpl implements TemperatureSensor{

	 public final static String W1_DEVICES_PATH = "/sys/bus/w1/devices/";
	    public final static String W1_SLAVE = "/w1_slave";
	    private String device_fileName; // Argument to point 28-000xxxx
	    
	   	    
//	    /**
//	     * @param gpio controller 
//	     */
//	    public TemperatureSensorImpl(GpioController gpio){
//	        super(gpio);
//	    }
	    
	    public static void main(String[] args) throws InterruptedException {
	    	TemperatureSensorImpl tempSensor = new TemperatureSensorImpl(GpioFactory.getInstance());        
	        tempSensor.run(args);
	    }
	    
	    @Override
	    protected void setup(String[] args) {
	        if(args.length == 1){
	            device_fileName = args[0];            
	           // logger.debug("Ds18b20 sensor ready!");        
	        }else{
	            throw new RuntimeException(
	                    "Please provide a device file name from "+W1_DEVICES_PATH);
	        }
	    }

	    
	    protected void loop(String[] args) {
	        double temp;
	        do{
	            temp = readTempFromFile(getFullPathToDevice(device_fileName));
	          //  logger.debug("Temperature is "+temp);
	        }while(isNotInterrupted);
	    }
	    
	    public static Path getFullPathToDevice(String deviceFileName){
	        return FileSystems.getDefault().getPath(W1_DEVICES_PATH+deviceFileName+W1_SLAVE);
	    }

	    public static double readTempFromFile(Path pathDeviceFile) {
	        int iniPos, endPos;
	        String strTemp, strTempIdentifier = "t=";
	        double tvalue = 0;
	        List<String> lines;
	        try {
	            lines = Files.readAllLines(pathDeviceFile, Charset.defaultCharset());
	            for(String line : lines){
	                if(line.contains(strTempIdentifier)){
	                    iniPos = line.indexOf(strTempIdentifier)+2;
	                    endPos = line.length();
	                    strTemp = line.substring(iniPos, endPos);
	                    tvalue = Double.parseDouble(strTemp) / 1000;
	                }
	            }        
	        } catch (IOException ex) {
	           // logger.error("Error while reading file "+pathDeviceFile, ex);
	        }
	        return tvalue;
	    }

		@Override
		public double getTemperature() {
			// TODO Auto-generated method stub
			return 0;
		}

}

package coopIntegration;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;


public class DoorFunctionsImpl implements DoorFunctions{

	
	public void openDoor() {
		// create gpio controller
        final GpioController gpio5 = GpioFactory.getInstance();        
        
        //setup pin
        final GpioPinDigitalOutput pin5 = gpio5.provisionDigitalOutputPin(RaspiPin.GPIO_05, "Open", PinState.HIGH);        
		
        pin5.high();
        
	}

	
	public void closeDoor() {
		// create gpio controller
		final GpioController gpio7 = GpioFactory.getInstance();        
		
		//setup pin
		final GpioPinDigitalOutput pin7 = gpio7.provisionDigitalOutputPin(RaspiPin.GPIO_07, "Shut", PinState.HIGH);
		
		pin7.high();
	}

}

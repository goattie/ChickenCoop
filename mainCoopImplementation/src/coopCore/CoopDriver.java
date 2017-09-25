package coopCore;

//import coopDataStructures.CoopConfig;
import coopDataStructures.CoopConfig;
import coopIntegration.CoopFileReader;
import coopIntegration.DoorFunctions;
import coopIntegration.DoorFunctionsImpl;
import coopIntegration.MySqlPoolableObjectFactory;
import coopIntegration.SqlPoolConnectionControl;

import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.PoolableObjectFactory;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.apache.commons.pool.impl.GenericObjectPool.Config;
import org.apache.commons.pool.impl.GenericObjectPoolFactory;


public class CoopDriver {

	//saving code for possibly using db connection pooling
//	@SuppressWarnings("rawtypes")
//	private static ObjectPool initMySqlConnectionPool() {
//        Properties properties = new Properties();
//        properties.load(Boot.class.getClassLoader().getResourceAsStream("config.properties"));
//       
//        String host = properties.getProperty("host");
//        String port = properties.getProperty("port");
//        String schema = properties.getProperty("schema");
//        String user = properties.getProperty("user");
//        String password = properties.getProperty("password");
//
//        @SuppressWarnings("rawtypes")
//		PoolableObjectFactory mySqlPoolableObjectFactory = new MySqlPoolableObjectFactory(host,
//             Integer.parseInt(port), schema, user, password);
//        Config config = new GenericObjectPool.Config();
//          config.maxActive = 10;
//          config.testOnBorrow = true;
//          config.testWhileIdle = true;
//          config.timeBetweenEvictionRunsMillis = 10000;
//          config.minEvictableIdleTimeMillis = 60000;
//
//        @SuppressWarnings({ "rawtypes", "unchecked" })
//		GenericObjectPoolFactory genericObjectPoolFactory = new GenericObjectPoolFactory(mySqlPoolableObjectFactory, config);
//        pool = genericObjectPoolFactory.createPool();
//        return pool;
//   }
//	
//	
//	public static void main (String args[]) {
//		ObjectPool pool;
//        pool = initMySqlConnectionPool();
//        SqlPoolConnectionControl exampleClassUsesMySQLConnectionPool
//             = new SqlPoolConnectionControl(pool);
//		
//	}

	public static void main (String args[]) {
		//define sunrise and sunset
		String sunrise;
		String sunset;		
		int x = 1;
		
		while(x==1) {
			
			//figure sunrise and sunset times
			
			//get database connection
			
			
			//save config entry to config object
			CoopConfig config = new CoopConfig();
			
			//define doorFunctions;
			DoorFunctions doorFunctions = new DoorFunctionsImpl();
			
					
			//check to see if user selected to open or close door
			if(config.isCloseDoor()==true && config.isDoorIspOpen()==true) {
				doorFunctions.closeDoor();				
			} else if(config.isOpenDoor()==true && config.isDoorIspOpen()==false) {
				doorFunctions.openDoor();
			} else if("configure date comparison" && config.isCloseDoor()==false) {
				
			}
			
			
		}
	}
	
}

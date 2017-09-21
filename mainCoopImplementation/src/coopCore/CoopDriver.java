package coopCore;

//import coopDataStructures.CoopConfig;
import coopIntegration.CoopFileReader;
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

	@SuppressWarnings("rawtypes")
	private static ObjectPool initMySqlConnectionPool() {
        Properties properties = new Properties();
        properties.load(Boot.class.getClassLoader().getResourceAsStream("config.properties"));
       
        String host = properties.getProperty("host");
        String port = properties.getProperty("port");
        String schema = properties.getProperty("schema");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        @SuppressWarnings("rawtypes")
		PoolableObjectFactory mySqlPoolableObjectFactory = new MySqlPoolableObjectFactory(host,
             Integer.parseInt(port), schema, user, password);
        Config config = new GenericObjectPool.Config();
          config.maxActive = 10;
          config.testOnBorrow = true;
          config.testWhileIdle = true;
          config.timeBetweenEvictionRunsMillis = 10000;
          config.minEvictableIdleTimeMillis = 60000;

        @SuppressWarnings({ "rawtypes", "unchecked" })
		GenericObjectPoolFactory genericObjectPoolFactory = new GenericObjectPoolFactory(mySqlPoolableObjectFactory, config);
        pool = genericObjectPoolFactory.createPool();
        return pool;
   }
	
	
	public static void main (String args[]) {
		ObjectPool pool;
        pool = initMySqlConnectionPool();
        SqlPoolConnectionControl exampleClassUsesMySQLConnectionPool
             = new SqlPoolConnectionControl(pool);
		
	}
	
}

package coopIntegration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectorImpl implements DBConnector {
	

	final static String dbString="jdbc:mysql://localhost/coopdb";
	final static  String user="Tom";
	final static  String password="PimpMasterCoop";
		
	public Connection getConnection() {
		Connection newConn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			newConn=DriverManager.getConnection(dbString,user,password);
						
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newConn;
	}

}

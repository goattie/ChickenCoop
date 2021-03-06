package coopIntegration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.commons.pool.ObjectPool;

import coopDataStructures.CoopConfig;
import coopExceptions.MySqlPoolableException;

public class SqlPoolConnectionControl {

	 //private static final Log LOG = LogFactory.getLog(ExampleClassUsesMySQLConnectionPool.class);
//     private static final String CONFIG_SQL = "SELECT sunrise_preset, sunset_preset, mp3_open, mp3_close, open_door, close_door FROM COOP_CONFIG";
//     @SuppressWarnings("rawtypes")
//	private final ObjectPool connPool;
// 
//     public SqlPoolConnectionControl(ObjectPool connPool) {
//          this.connPool = connPool;
//     }
// 
//     public CoopConfig getRecords(String sql) throws SQLException, MySqlPoolableException {
//          CoopConfig readConfig = null;
//          Connection conn = null;
//          Statement st = null;
//          ResultSet res = null;
//          try {
//               conn = (Connection)connPool.borrowObject();
//               st = conn.createStatement();
//               res = st.executeQuery(sql);
//               while (res.next()) {
//                    readConfig = new CoopConfig(res.getString(1), res.getString(2), res.getString(3),
//                    		res.getString(4), res.getBoolean(5), res.getBoolean(6));                    		
//                    }
//          } catch (SQLException e) {
//               throw e;
//          }  catch (Exception e) {
//               throw new MySqlPoolableException("Failed to borrow connection from the pool", e);
//          } finally {
//               safeClose(res);
//               safeClose(st);
//               safeClose(conn);
//          }
//          return readConfig;
//     }
// 
//     private void safeClose(Connection conn) {
//          if (conn != null) {
//               try {
//                    connPool.returnObject(conn);
//               }
//               catch (Exception e) {
//                    //LOG.warn("Failed to return the connection to the pool", e);
//               }
//          }
//     }
// 
//     private void safeClose(ResultSet res) {
//          if (res != null) {
//               try {
//                    res.close();
//               } catch (SQLException e) {
//                   // LOG.warn("Failed to close databse resultset", e);
//               }
//          }
//     }
// 
//     private void safeClose(Statement st) {
//          if (st != null) {
//               try {
//                    st.close();
//               } catch (SQLException e) {
//                   // LOG.warn("Failed to close databse statment", e);
//               }
//          }
//     }
//	
	
}

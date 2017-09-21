package coopExceptions;

@SuppressWarnings("serial")
public class MySqlPoolableException extends Exception {
	
	public MySqlPoolableException(final String msg, Exception e) {
         super(msg, e);
     }
	
}


import java.sql.*;

public class TestConnection {
   //static final String DB_URL = "jdbc:oracle:thin:@cgsopd1-scan.manulife.com:1521/MIWEB1USVC";
	static final String DB_URL = "jdbc:oracle:thin:@cgsopp1-scan.manulife.com:1521/miweb1psvc";
   static final String USER = "fsf";
   static final String PASS = "cru1se88";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      Class.forName("oracle.jdbc.driver.OracleDriver");
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      if(conn!=null){
    	  System.out.println("Connection Successful");
      }
      conn.close();
   }catch(SQLException se){
      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }finally{
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
}
}
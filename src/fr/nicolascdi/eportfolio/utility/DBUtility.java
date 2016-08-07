package fr.nicolascdi.eportfolio.utility;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBUtility {
	private static Connection connection;

	static String driver ="com.mysql.jdbc.Driver";
	static String url ="jdbc:mysql://us-cdbr-iron-east-04.cleardb.net/ad_8d903b470f1e585?user=b53cb9ccdc4562&password=94623c28";
	static String user = "b53cb9ccdc4562";
	static String password = "94623c28";

	static{
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection(){
		return connection;
	}
}

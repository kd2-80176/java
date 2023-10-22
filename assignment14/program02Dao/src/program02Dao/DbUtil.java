package program02Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DbUtil {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/sdatabase";
	public static final String DB_USER = "kd2_80176_shekhar";
	public static final String DB_PASSWD = "manager";
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
		return con;
	}

	static Date parseDate(String str) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
			Date date = sdf.parse(str);
			return date;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
  
	}

}
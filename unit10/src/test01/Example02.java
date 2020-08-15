package test01;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;
import java.util.Properties;
import org.apache.commons.dbcp.BasicDataSourceFactory;



public class Example02 {
	public static DataSource ds = null;
	static {
		//新建一个配置文件
		Properties prop = new Properties();  //util
		try {
			ClassLoader classloader = new Example02().getClass().getClassLoader();
			InputStream in = classloader.getResourceAsStream("dbcpconfig.properties");
			prop.load(in);
			ds = BasicDataSourceFactory.createDataSource(prop);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws SQLException {
		Connection conn = ds.getConnection();
		DatabaseMetaData metaData = conn.getMetaData();
		System.out.println(metaData.getURL());
		System.out.println(metaData.getUserName());
		System.out.println(metaData.getDriverName());
	}
}

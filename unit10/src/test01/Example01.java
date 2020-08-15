package test01;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;


public class Example01 {
	public static DataSource ds =null;
	static {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/student");
		bds.setUsername("root");
		bds.setPassword("061100sy");
		bds.setInitialSize(5);
		bds.setMaxOpenPreparedStatements(5);
		ds = bds;
	}
	public static void main(String[] args) throws SQLException {
		Connection conn = ds.getConnection();
		DatabaseMetaData metaData = (DatabaseMetaData) conn.getMetaData();
		System.out.println(metaData.getURL());
		System.out.println(metaData.getUserName());
		System.out.println(metaData.getDriverName());
	}
}

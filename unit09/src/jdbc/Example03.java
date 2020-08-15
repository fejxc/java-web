package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example03 {
	public static void main(String[] args)throws SQLException {
		Connection conn = null;
		Statement st = null; //sql语句执行是通过Statement对象实现
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/student";
			String user = "root";
			String password = "061100sy";
			
			//创建应用程序与数据库连接的Connection对象
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select * from users";
			st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			//执行sql语句，将结果放在resultset对象里
			rs = st.executeQuery(sql);
			
			//取信息
			System.out.println("第2条name信息：");
			rs.absolute(2);
			System.out.println(rs.getString("name"));
//			System.out.println("第二条password信息：");
//			System.out.println(rs.getString("password"));
			System.out.println("第1条name信息：");
			rs.beforeFirst(); //光标移到最初位置，第一行数据前面
			rs.next(); //光标向下移动一行
			System.out.println(rs.getString("name"));
			rs.afterLast(); //光标移动到最后一行数据的下一行
			rs.previous(); //光标回退一行
			System.out.println("第4条name信息：");
			System.out.println(rs.getString("name"));
			rs.previous();
			System.out.println("第3条name信息：");
			System.out.println(rs.getString("name"));
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		finally {
			if(st!=null) {
				try {
					st.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				st = null;
				if(conn!=null)try {
					conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				conn = null;
			}
		}
	}
}

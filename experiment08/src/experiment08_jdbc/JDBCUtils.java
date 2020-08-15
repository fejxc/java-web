package experiment08_jdbc;
import java.sql.Connection;
/**
 * 封装数据库的操作，简化操作步骤
 *
 */
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCUtils {
	// 加载驱动，并建立数据库连接
	public static Connection getConnection() throws SQLException,
				ClassNotFoundException {
		// 1. 注册数据库的驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/student";
			String username = "root";
	    		String password = "061100sy";
			Connection conn = DriverManager.getConnection(url, username, 
					password);
			return conn;
		}
		// 关闭数据库连接，释放资源
		public static void release(Statement stmt, Connection conn) {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				stmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				conn = null;
			}
		}
	     public static void release(ResultSet rs, Statement stmt, 
	     		Connection conn){
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				rs = null;
			}
			release(stmt, conn);
		}
}


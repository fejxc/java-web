package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Example02 {
	public static void main(String[] args) throws SQLException{
		Connection conn = null;
		PreparedStatement preStmt = null; //sql语句执行是通过Statement对象实现
		try {
			//加载mysql驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/student";
			String user = "root";
			String password = "061100sy";
			
			//创建应用程序与数据库连接的Connection对象
			conn = DriverManager.getConnection(url, user, password);
			
			//执行sql语句
			String sql = "insert into users(name,password,email,birthday)"
					+"values(?,?,?,?)"; //"?"为占位符
			preStmt = conn.prepareStatement(sql);
			preStmt.setString(1, "yushengchi");//"1"为位置，0是id 自动增加
			preStmt.setString(2, "88888888");
			preStmt.setString(3, "ysc88@qq.com");
			preStmt.setString(4, "1998-09-08");
			
			//执行sql
			int row = preStmt.executeUpdate();
			System.out.println("处理了"+row+"行数据");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(preStmt!=null) {
				try {
					preStmt.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				preStmt = null;
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

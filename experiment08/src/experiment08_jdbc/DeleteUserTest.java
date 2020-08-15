package experiment08_jdbc;
public class DeleteUserTest{
 	public static void main(String[] args) {
 		// 删除操作
 		UsersDao usersDao = new UsersDao();
 		boolean b = usersDao.delete(3);
 		System.out.println(b);
 	}
 }

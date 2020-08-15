package annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource(name="userDao")
	private UserDao userDao;
	@Override
	public void save() {
		// TODO Auto-generated method stub
		this.userDao.save(); //调用userDao中的save方法
		System.out.println("usersevice.....save.....");
	}

}

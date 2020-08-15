package annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("userController")    //相当于在xml的方式里配置里里一个bean
public class UserController {
	//@Resource(name="userService")
	@Autowired
	private UserService userService;
	public void save() {
		this.userService.save();
		System.out.println("userController ... save ... ");
	}
	
}

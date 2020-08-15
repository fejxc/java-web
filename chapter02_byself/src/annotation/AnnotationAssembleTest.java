package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.Bean2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AnnotationAssembleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义配置文件路径
		
		String xmlPath="annotation/beans6.xml";
		
		//加载配置文件
ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		
UserController userController = (UserController) applicationContext.getBean("userController");
System.out.println(userController);
		//获取UserController实例
		//调用UserController中的save方法
userController.save();
	}

}

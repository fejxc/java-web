package Factory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Static_Factory.Bean2;
public class InstanceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//从src开始算
		String Path = "Factory/beans3.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(Path);
		
		Bean3 bean = (Bean3) applicationContext.getBean("bean3");
		System.out.println(bean);

	}

}

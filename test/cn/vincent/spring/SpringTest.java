package cn.vincent.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.vincent.vo.User;

public class SpringTest {

	@Test
	public void testHello(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		User u=(User)ac.getBean("user");
		System.out.println(u);
	}
	
}

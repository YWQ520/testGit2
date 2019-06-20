package com.factory.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.factory.service.UserService;

public class TestDemo {
	
	//测试IOC获得实例
	@Test
	public void demo1() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获得service实例
		//new UserServiceImpl()
		
		UserService bean = (UserService) applicationContext.getBean("UserServiceIOC");
		
		bean.query();
		
	}
	
}

package com.factory.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.factory.service.UserService;

public class TestDemo {
	
	//����IOC���ʵ��
	@Test
	public void demo1() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//���serviceʵ��
		//new UserServiceImpl()
		
		UserService bean = (UserService) applicationContext.getBean("UserServiceIOC");
		
		bean.query();
		
	}
	
}

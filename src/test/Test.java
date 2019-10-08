package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.bean.Speaker;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		Speaker sp=(Speaker)app.getBean("hello");
		sp.speak();
	}

}

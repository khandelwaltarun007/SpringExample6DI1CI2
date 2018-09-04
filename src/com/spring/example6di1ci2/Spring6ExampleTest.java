package com.spring.example6di1ci2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring6ExampleTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee) context.getBean("employee");
		employee.show();
	}
}

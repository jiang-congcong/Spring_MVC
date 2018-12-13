package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.Lover;
import service.StudentService;

public class Test {
	public static void main(String[] args) {
		/*Spring 出场*/
		ApplicationContext context =
		new ClassPathXmlApplicationContext("spring-config.xml");
		/*StudentService ss3 =
		(StudentService) context.getBean("studentService");
		ss3.getPerson().Show();*/
		Lover ss3 = (Lover) context.getBean("lover",Lover.class);
		System.out.println(ss3);
		}

}

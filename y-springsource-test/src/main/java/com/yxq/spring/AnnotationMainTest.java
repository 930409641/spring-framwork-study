package com.yxq.spring;

import com.yxq.spring.bean.Cat;
import com.yxq.spring.bean.Person;
import com.yxq.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMainTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
//		Person bean = context.getBean(Person.class);
//		System.out.println(bean);

//		String[] beanDefinitionNames = context.getBeanDefinitionNames();
//		for (String name :
//				beanDefinitionNames) {
//			System.out.println(name);
//		}





		Person bean2 = context.getBean(Person.class);
		Person bean3 = context.getBean(Person.class);
		System.out.println(bean2.getCat() == bean3.getCat());

	}
}

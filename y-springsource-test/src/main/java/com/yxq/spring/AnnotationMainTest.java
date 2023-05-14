package com.yxq.spring;

import com.yxq.spring.bean.Cat;
import com.yxq.spring.bean.Person;
import com.yxq.spring.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring的底层通过后置增强机制，完成很多功能
 * 1.这个功能Spring在启动的时候注入了什么组件
 * 2.这个功能牵扯到的组件在什么位置被什么后置增强器增强成了什么样子？
 */
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





//		Person bean2 = context.getBean(Person.class);
//		Person bean3 = context.getBean(Person.class);
//		System.out.println(bean2.getCat() == bean3.getCat());

	}
}

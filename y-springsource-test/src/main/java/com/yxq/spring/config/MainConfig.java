package com.yxq.spring.config;

import com.yxq.spring.bean.Cat;
import com.yxq.spring.bean.Person;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotationMetadata;

//@Import(value = {MainConfig.MyImportRegister.class})
@ComponentScan("com.yxq")
@Configuration
public class MainConfig {
	public MainConfig() {
		System.out.println("MainConfig...创建了");
	}

	//	@Bean
//	public Person person() {
//		Person person = new Person();
//		person.setName("张三");
//		person.setAge(18);
//		return person;
//	}

	/**
	 * BeanDefinitionRegistrar : bean定义信息注册中心，图纸中心
	 * 		它里面都是BeanDefinition
	 */
//	static class MyImportRegister implements ImportBeanDefinitionRegistrar {
//
//		@Override
//		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
//											BeanDefinitionRegistry registry) {
//
//			//BeanDefinition
//			RootBeanDefinition catBeanDefinition = new RootBeanDefinition();
//			catBeanDefinition.setBeanClass(Cat.class);
//			//可以声明定义信息，包括我需要自动装配什么
//
//			//spring 这个实例的类型，名字
//			registry.registerBeanDefinition("tomCat",catBeanDefinition);
//		}
//	}
}

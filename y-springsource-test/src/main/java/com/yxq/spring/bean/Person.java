package com.yxq.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

/**
 * Aware接口：帮我们装配Spring底层的一些组件
 * 1.Bean的功能增强全部都是由BeanPostProcessor+InitializingBean（合起来完成的）
 */
@Data
@AllArgsConstructor
@ToString
@Component
public class Person implements ApplicationContextAware, MessageSourceAware {


	ApplicationContext context; //可以要到ioc容器
	MessageSource messageSource;

	private String name;
	//@Autowired
	private Cat cat;
	private Integer age;

	public Person() {
		System.out.println("构造器创建");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	//@Lookup //去容器中找，@Bean的这种方式注册的Person不生效
	public Cat getCat() {
		return cat;
	}


	@Autowired
	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", cat=" + cat +
				", age=" + age +
				'}';
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource =messageSource;
	}
}

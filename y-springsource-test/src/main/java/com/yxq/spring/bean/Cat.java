package com.yxq.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//被组合的组件是多实例的时候，不能用@AutoWried
//容器应该给Cat再创建一个对象，注入到Person中
@Component
public class Cat {
	private String name;

	public Cat() {
		System.out.println("cat被创建了...");
	}

	public String getName() {
		return name;
	}


	@Value("${JAVA_HOME}")
	public void setName(String name) {
		System.out.println("cat...setName正在被调用...");
		this.name = name;
	}
}

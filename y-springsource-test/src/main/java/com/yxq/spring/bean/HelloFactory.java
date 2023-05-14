package com.yxq.spring.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 工厂bean
 * 普通bean
 * 区别：
 * 	1.Person = 普通bean，注册的组件对象就是Person对象，类型是Person
 *	2.工厂Bean = 实现了FactoryBean接口的组件，注册的不是HelloFactory
 *			而是HelloFactory这个工厂调用的getObject()方法返回的对象，类型是getObjectType
 *		MyBatis和Spring的整合SqlSessionFactoryBean
 */
public class HelloFactory implements FactoryBean {

	@Override
	public Object getObject() throws Exception {

		return new Hello();
	}

	@Override
	public Class<?> getObjectType() {
		return Hello.class;
	}
}

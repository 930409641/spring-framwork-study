package com.yxq.spring.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 整个后置处理围绕着整个Bean的创建和初始化过程对Bean的功能进行改造
 */
@Component
public class MyBeanDefinitionRegisterPostProcessor implements BeanDefinitionRegistryPostProcessor {
	public MyBeanDefinitionRegisterPostProcessor() {
		System.out.println("MyBeanDefinitionRegisterPostProcessor");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanDefinitionRegisterPostProcessor...postProcessBeanFactory");
		//第二个执行
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("MyBeanDefinitionRegisterPostProcessor...postProcessBeanDefinitionRegistry");
		//增强bean定义信息的注册中心，比如自己注册组件
	}
}

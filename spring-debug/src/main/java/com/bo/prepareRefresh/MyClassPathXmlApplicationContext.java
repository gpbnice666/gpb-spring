package com.bo.prepareRefresh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: gpb
 * @Date: 2023/6/13 16:04
 * @Description:
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {


	MyClassPathXmlApplicationContext (String path) {
		super(path);
	}

	@Override
	protected void initPropertySources () {
		System.out.println("子类扩展实现！！！");
		getEnvironment().setRequiredProperties("username");
	}
}

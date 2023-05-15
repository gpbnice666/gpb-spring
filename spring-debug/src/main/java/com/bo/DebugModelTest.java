package com.bo;

import com.bo.debugModelTest.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试源码是否能正常运行
 * @Author: gpb
 * @Date: 2023/5/12 11:16
 * @Description:
 */
public class DebugModelTest {
	public static void main (String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("debugModelTest.xml");
		User bean = ac.getBean(User.class);
		System.out.println(bean);
	}
}

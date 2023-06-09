package com.bo.resolvePlaceholders;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: gpb
 * @Date: 2023/6/9 16:17
 * @Description:
 */
public class ResolvePlaceholdersTest {

	public static void main (String[] args) {
		// 测试 spring加载配置文件，使用展位符号
		// 1.环境遍历可以使用系统环境遍历
		// 2.也可以在  edit Configurations -> 找到启动类 添加-> 属性 Environment variables key-value 结构类型
		// 使用 2 方法进行测试学习
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-${profiles}.xml");
		System.out.println(context.getBean(User.class));
	}
}

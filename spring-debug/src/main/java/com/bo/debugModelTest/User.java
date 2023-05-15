package com.bo.debugModelTest;

/**
 * @Author: gpb
 * @Date: 2023/5/12 11:20
 * @Description:
 */
public class User {
	private Long id;
	private String name;

	@Override
	public String toString () {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}

	public User () {
	}

	public User (Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId () {
		return id;
	}

	public void setId (Long id) {
		this.id = id;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}
}

package com.github.cjqcn.uaa.core.user;


/**
 * @description: 用户名密码
 * @author: chenjinquan
 * @create: 2018-08-27 00:16
 **/
public class UsernamePassword {

	protected String username;
	protected String password;

	protected UsernamePassword(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public static UsernamePassword create(String username, String password) {
		return new UsernamePassword(username, password);
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}

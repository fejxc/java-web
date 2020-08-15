package saaemble;

import java.util.List;

public class User {
	private String username;
	private Integer password;
	private List<String> list;

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(Integer password) {
		this.password = password;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	
	/*
	 * 
	 * 1.使用构造注入
	 * 一定要提供代所有参数的有参构造方法
	 * 
	 * 
	 * 
	 */
	
	/*
	 * 使用设值注入
	 * 一定要提供默认的空参的构造方法
	 * 为所有属性提供setter方法
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, Integer password, List<String> list) {
		super();
		this.username = username;
		this.password = password;
		this.list = list;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", list=" + list + "]";
	}
	
	
}

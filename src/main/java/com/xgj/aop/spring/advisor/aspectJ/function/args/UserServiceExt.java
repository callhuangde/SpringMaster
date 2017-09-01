package com.xgj.aop.spring.advisor.aspectJ.function.args;

public class UserServiceExt extends UserService {
	public void addUser(User user) {
		System.out.println("子类 addUser " + user);
	}

	public void modifyUser(User user) {
		System.out.println("子类 modifyUser " + user);
	}

	public void delUser(User user) {
		System.out.println("子类 delUser " + user);
	}
}

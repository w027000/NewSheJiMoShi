package com.jianhua.simple.factory;

public class Bird implements Animal {

	@Override
	public void eat() {
		System.out.println("����");
	}

	public void fly(){
		System.out.println("����");
	}
}

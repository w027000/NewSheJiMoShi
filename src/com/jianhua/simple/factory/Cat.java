package com.jianhua.simple.factory;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("猫会吃");
	}

	public void catchMouse(){
		System.out.println("猫会抓老鼠");
	}
}

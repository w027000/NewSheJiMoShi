package com.jianhua.factory;

public class Tigher implements Animal {

	@Override
	public void eat() {
		System.out.println("老虎会吃");
	}
	
	public void run(){
		System.out.println("老虎会跑");
	}

}

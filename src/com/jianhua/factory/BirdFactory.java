package com.jianhua.factory;

public class BirdFactory implements Factory{

	@Override
	public Animal createAnimal() {
		return new Bird();
	}

}

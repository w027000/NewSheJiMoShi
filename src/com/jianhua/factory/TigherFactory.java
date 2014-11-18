package com.jianhua.factory;

public class TigherFactory implements Factory{

	@Override
	public Animal createAnimal() {
		return new Tigher();
	}

}

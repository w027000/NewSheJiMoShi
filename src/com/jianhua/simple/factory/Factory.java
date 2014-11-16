package com.jianhua.simple.factory;

public class Factory {
	
	public static Animal createAnimal(String animalName){
		//第一种方式根据动物名字
		
		/*if("Bird".equals(animalName)){
			return new Bird();
		}else if("Cat".equals(animalName)){
			return new Cat();
		}else if("Tigher".equals(animalName)){
			return new Tigher();
		}
		return null;*/
		//第二种用的反射
		try {
			Class c = Class.forName(animalName);
			Animal animal = (Animal) c.newInstance();
			return animal;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

}

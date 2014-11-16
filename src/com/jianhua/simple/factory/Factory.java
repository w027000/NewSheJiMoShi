package com.jianhua.simple.factory;

public class Factory {
	
	public static Animal createAnimal(String animalName){
		//��һ�ַ�ʽ���ݶ�������
		
		/*if("Bird".equals(animalName)){
			return new Bird();
		}else if("Cat".equals(animalName)){
			return new Cat();
		}else if("Tigher".equals(animalName)){
			return new Tigher();
		}
		return null;*/
		//�ڶ����õķ���
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

package com.jianhua.factory;

public class Client {

	
	/***
	 * 工厂模式
	 * 客户端 
	 * @param args
	 * @author jianhua
	 */
	public static void main(String[] args) {
		Factory catfactory = new CatFactory();
		Cat  cat = (Cat) catfactory.createAnimal();
		cat.eat();
		
		
		Factory birdfactory = new BirdFactory();
		Bird  bird = (Bird) birdfactory.createAnimal();
		bird.eat();
		
		Factory tigherFactory = new TigherFactory();
		Tigher tigher = (Tigher) tigherFactory.createAnimal();
		tigher.eat();
	}
	
	
	/*
	 *-------------------工厂模式的优缺点 
	 * 优点：从而明确了各个类的职责
	 * 缺点：代码量多
	 */

}

package com.jianhua.simple.factory;

public class Client {

	
	/***
	 * 1、简单工厂模式
	 *   客户端 
	 * @param args
	 * @author jianhua
	 * 2014年11月16日18:46:29
	 */
	public static void main(String[] args) {
		Animal animal = Factory.createAnimal("Cat");
		animal.eat();
		animal = Factory.createAnimal("Bird");
		animal.eat();
		animal = Factory.createAnimal("Tigher");
		animal.eat();
		
		//反射机制
		/*Animal animal = Factory.createAnimal("com.jianhua.simple.factory.Cat");
		animal.eat();
		animal = Factory.createAnimal("com.jianhua.simple.factory.Bird");
		animal.eat();
		animal = Factory.createAnimal("com.jianhua.simple.factory.Tigher");
		animal.eat();*/
	}
	
	
	/*
	 *-------------------简单工厂模式的优缺点 
	 * 优点：在简单工厂模式中，客户端不再负责对象的创建，而是把这个责任丢给了具体的工厂类，客户端只负责对象的调用，从而明确了各个类的职责
	 * 
	 * 缺点：由于简单工厂模式使用静态方法来创建对象，这就导致静态方法无法被继承。
	 * 		 另一方面，这个工厂类负责所有的对象的创建，这会导致虽然具体产品的不断增多，可能客户端对于某些产品的创建会有不同的需求，这样的话
	 * 				    就要不停的修改工厂类，增加相应的逻辑判断不利于后期的维护
	 * 
	 */

}

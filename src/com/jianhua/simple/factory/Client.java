package com.jianhua.simple.factory;

public class Client {

	
	/***
	 * 1���򵥹���ģʽ
	 *   �ͻ��� 
	 * @param args
	 * @author jianhua
	 * 2014��11��16��18:46:29
	 */
	public static void main(String[] args) {
		Animal animal = Factory.createAnimal("Cat");
		animal.eat();
		animal = Factory.createAnimal("Bird");
		animal.eat();
		animal = Factory.createAnimal("Tigher");
		animal.eat();
		
		//�������
		/*Animal animal = Factory.createAnimal("com.jianhua.simple.factory.Cat");
		animal.eat();
		animal = Factory.createAnimal("com.jianhua.simple.factory.Bird");
		animal.eat();
		animal = Factory.createAnimal("com.jianhua.simple.factory.Tigher");
		animal.eat();*/
	}
	
	
	/*
	 *-------------------�򵥹���ģʽ����ȱ�� 
	 * �ŵ㣺�ڼ򵥹���ģʽ�У��ͻ��˲��ٸ������Ĵ��������ǰ�������ζ����˾���Ĺ����࣬�ͻ���ֻ�������ĵ��ã��Ӷ���ȷ�˸������ְ��
	 * 
	 * ȱ�㣺���ڼ򵥹���ģʽʹ�þ�̬����������������͵��¾�̬�����޷����̳С�
	 * 		 ��һ���棬��������ฺ�����еĶ���Ĵ�������ᵼ����Ȼ�����Ʒ�Ĳ������࣬���ܿͻ��˶���ĳЩ��Ʒ�Ĵ������в�ͬ�����������Ļ�
	 * 				    ��Ҫ��ͣ���޸Ĺ����࣬������Ӧ���߼��жϲ����ں��ڵ�ά��
	 * 
	 */

}

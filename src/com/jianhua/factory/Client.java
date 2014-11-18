package com.jianhua.factory;

public class Client {

	
	/***
	 * ����ģʽ
	 * �ͻ��� 
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
	 *-------------------����ģʽ����ȱ�� 
	 * �ŵ㣺�Ӷ���ȷ�˸������ְ��
	 * ȱ�㣺��������
	 */

}

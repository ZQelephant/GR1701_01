package com.gaojie.qhit01;

/**
 * ���ߣ���ͮͮ
 * 
 * ����ʱ�䣺2017��11��23�� ����7:32:42
 */
public class Test {
	public static void main(String[] args) {

		Dog dog = new Dog("С��", "����", "��ɫ", "11");

		Mice mice = new Mice("����", "����", "��ֻ", "12g");

		System.out.println(dog.toString());
		dog.cry();
		dog.eat();

		mice.cry();
		mice.eat();
		System.out.println(mice.toString());
	}
}

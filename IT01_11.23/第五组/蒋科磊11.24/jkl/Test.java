package com.jkl;

public class Test {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setName("��");
		dog.setBreed("��������Ȯ");
		dog.setColor("��ɫ");
		dog.setAge(19);
		System.out.println(dog.toString());
		dog.eat();
		dog.shout();
		
		
		Mouse mouse=new Mouse();
		mouse.setName("�ܿ�");
		mouse.setBreed("������");
		mouse.setLegs(4);
		mouse.setWeight(2.5);
		System.out.println(mouse.toString());
		mouse.eat();
		mouse.shout();
	}
}

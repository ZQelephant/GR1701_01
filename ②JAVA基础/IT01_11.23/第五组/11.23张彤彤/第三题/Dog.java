package com.gaojie.qhit01;

/**
 * ���ߣ���ͮͮ
 * 
 * ����ʱ�䣺2017��11��23�� ����7:16:21
 */
public class Dog implements IZoology {

	private String name;
	private String breed;
	private String colour;
	private String age;

	public Dog(String name, String breed, String colour, String age) {
		super();
		this.name = name;
		this.breed = breed;
		this.colour = colour;
		this.age = age;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("���ǹ��ڳԷ�");

	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("���ǹ��ڽ�");

	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", colour=" + colour
				+ ", age=" + age + "]";
	}

}

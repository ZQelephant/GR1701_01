package com.qhit.Animal;


public class Dog implements Animal {

	String name;
	String breed;
	String color;
	private int age;

	public Dog() {
		System.out.println("����һ��������޲ι��췽��");
	}

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String getEat() {
		// TODO Auto-generated method stub
		return "����";
	}

	@Override
	public String getCry() {
		// TODO Auto-generated method stub
		return "��";
	}

	public int getAge() {
		return 26;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

package com.duhuiyou;

public class Dog implements Animal {
	//ʵ�ֶ�������ӿڡ�
	//Ҫ�󹷾��е����԰�����������Ʒ�֡���ɫ�����䣨����˽�У� 
	//���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ�����Ĺ��췽����
	/*private String name;
	private String variety;
	private String colour;
	private String age;
	/**
	 * @param name
	 * @param variety
	 * @param colour
	 * @param age
	 */
	/*public Dog(String name, String variety, String colour, String age) {
		this.name = name;
		this.variety = variety;
		this.colour = colour;
		this.age = age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", variety=" + variety + ", colour="
				+ colour + ", age=" + age + "]";
	}*/
	@Override
	public Animal eat() {
		System.out.println("����");
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Animal cry() {
		System.out.println("����");
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

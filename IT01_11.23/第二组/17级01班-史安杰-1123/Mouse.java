package com.saj;

public class Mouse implements Animal{
	
	String name;
	String breed;
	int legs;
	private double weight;
	
	public Mouse() {
		
	}

	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	@Override
	public void eat() {
		
		System.out.println(name+"�ڳԹ���");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cry() {
		
		System.out.println(name+"�ڴ�����Ϣ");
		// TODO Auto-generated method stub
		
	}
	
	
	

}

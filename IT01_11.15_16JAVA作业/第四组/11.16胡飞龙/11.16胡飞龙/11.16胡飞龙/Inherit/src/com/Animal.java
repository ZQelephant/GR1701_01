package com;


public class Animal {
	private String breed;
	int age;
	String color;
	float weight;
	int leg;
	
	
	//Animal(){
	//	System.out.println("�����޲ι��췽���������ڱ�����");}
		
		
		
		
		
		
		
	//}
	public Animal(String breed, int age, String color, float weight, int leg) {
		super();
		this.breed = breed;
		this.age = age;
		this.color = color;
		this.weight = weight;
		this.leg = leg;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	void eat(String food){
		System.out.println("ϲ���ԣ�"+food);
	}
	void play(){
		System.out.println("��");
	}
void sleep(){
	System.out.println("˯��");
}
}

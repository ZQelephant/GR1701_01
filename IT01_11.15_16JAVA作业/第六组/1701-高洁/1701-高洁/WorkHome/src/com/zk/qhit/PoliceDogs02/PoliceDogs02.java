package com.zk.qhit.PoliceDogs02;

public class PoliceDogs02 {
	//2  ����һ�������࣬ʵ����һ����Ȯ����
	//���þ�ȮƷ�֡�ë����ɫ�����������䡢�۾���ɫ���ȵ����������ʱ�٣�
	
	String name; //������
	String breed; //Ʒ�֣�
	String color;//��ɫ��
	String eyecolor;
	int age;//���䣬
	double weight;//���ء�
	int leg;
	String speed;
	
	
	
	public void bow_wow(){
		System.out.println("��");
	}
	public void eat(){
		System.out.println("��Ȯÿ�����.");}
	public void sleep(){
		System.out.println("˯��");
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;			
	}
	
	public String getBreed(){
		return breed;
	}
	public void setBreed(String breed){
		this.breed = breed;			
	}
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		if (color.equals("��ɫ")){
			System.out.println("���Ĺ��Ǹ��и��ԵĹ�");
		}else{
		this.color = color;
		}			
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age =age;			
	}
	
	public double getWeight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight = weight;			
	}

}

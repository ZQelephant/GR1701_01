package com.Job03;

public class Dog implements IAnimal{
	
	// b.��������ʵ�ֶ�������ӿڡ�Ҫ�󹷾��е����԰�����
	//������Ʒ�֡���ɫ�����䣨����˽�У� ��
	// ���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ�����Ĺ��췽����
	
	String name;
	//Ʒ�֣�
	String variety;
	String color;
	private int age;
	
	Dog(){
		System.out.println("����");
		
		
	}
	
	
	
	
	
	
	public Dog(String name) {
		super();
		this.name = name;
	}






	@Override
	public String getEat() {
		System.out.println("�������ͷ");
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getWow() {
		System.out.println("����~");
		// TODO Auto-generated method stub
		return null;
	}
	
	


}

package com.Job03;

public class Mouse implements IAnimal{
	
	
	// c.�������� ʵ�ֶ�������ӿڡ�Ҫ��������е����԰�����
	//������Ʒ�֡������ȡ����أ�����˽�У� ��
	//���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ������Ʒ�ֵĹ��췽����
	
	String name;
	String breed;
	int leg;
	private double weight;
	
	Mouse(){
		System.out.println("һֻ������~");
	}
	
	
	
	

	public Mouse(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}





	@Override
	public String getEat() {
		System.out.println("�Ұ��Դ���");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWow() {
		System.out.println("֨֨֨~");
		// TODO Auto-generated method stub
		return null;
	}


}

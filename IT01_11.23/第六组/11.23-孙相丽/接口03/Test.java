package com.sxl;

public class Test {

	public static void main(String[] args) {
		//���������������ʵ����
		Dog   d=  new Dog();
		Mouse m=  new Mouse();
		//������������������Ը�ֵ�����ýкͳԵķ���
	
		d.color="��ɫ";
		d.name="jack";
		d.variety="̩��";
		System.out.println("�������䣺"+d.getAge());
		System.out.println("�������ֽУ�"+d.name
				+"����:"+d.color+"��"
				+"����Ʒ���ǣ�"+d.variety);
		d.eat();
		d.voice();
		m.legs=4;
		m.name="С��";
		m.variety="����";
		System.out.println("������ֽУ�"+m.name
				+"����:"+m.legs+"��"
				+"����Ʒ���ǣ�"+m.variety);
		System.out.println("����������ǣ�"+m.getWeight());
		m.eat();
		m.voice();
		
	}
	
	
	
}

package com.duhuiyou;


public class Taest {

	// �ֱ𴴽����������ʵ��������
	// ����������Ը�ֵ��
	// ���ҵ��ö���ĳԡ��еķ���

	static void testcry(Animal m) {
		m.cry();
	}

	public static void main(String[] args) {
		Animal c = new Mice();
		Animal m = new Dog();
		testcry(c);
		testcry(m);
	}
}

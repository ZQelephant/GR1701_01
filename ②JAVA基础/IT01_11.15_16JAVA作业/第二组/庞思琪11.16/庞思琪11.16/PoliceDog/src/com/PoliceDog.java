package com;

// ����һ�������࣬ʵ����һ����Ȯ�������þ�ȮƷ�֡�ë����ɫ�����������䡢�۾���ɫ���ȵ����������ʱ�٣�
//�������ĳԵķ�����work����
public class PoliceDog {
	String breed;
	String colour;
	float weight;
	int age;
	String eyecolour;
	int legnumber;
	float speed;

	void eat() {
		System.out.println("ϲ������");
	}

	void work() {
		System.out.println("����Σ��ʱ���");
	}

	void info() {
		System.out.println("Ʒ��Ϊ��" + breed + "ë����ɫ��" + colour + "����" + weight
				+ "����" + age + "�۾���ɫ" + eyecolour + "�ȵ�����" + legnumber + "���ʱ��"
				+ speed);

	}
}

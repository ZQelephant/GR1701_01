package com;

//����һ�������࣬ʵ����һ����Ȯ�������þ�ȮƷ�֡�ë����ɫ�����������䡢�۾���ɫ���ȵ����������ʱ�٣�
//�������ĳԵķ�����work����
public class Test {
	public static void main(String[] args) {
		PoliceDog policedog = new PoliceDog();
		policedog.breed = "��������";
		policedog.colour = "��ɫ";
		policedog.weight = 23.5f;
		policedog.age = 3;
		policedog.eyecolour = "red";
		policedog.legnumber = 2;
		policedog.speed = 3.25f;

		policedog.eat();
		policedog.work();
		policedog.info();
	}

}

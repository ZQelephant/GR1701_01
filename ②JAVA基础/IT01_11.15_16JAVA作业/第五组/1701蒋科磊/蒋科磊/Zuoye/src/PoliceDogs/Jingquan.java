package PoliceDogs;

import Animal.Dog;

public class Jingquan {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.leg=4;
		dog.eyecolor="��ɫ";
		dog.age=3;
		System.out.println("��"+dog.age+"���� ��");
		System.out.println("�����ȵ������ǣ�"+dog.leg);
		System.out.println("�����۾��ǣ�"+dog.eyecolor);
		
		
	}

	public String breed;
	public String color;
	public int age;
	public String eyeColor;
	public int leg;
	public int weight;
	public String speed;
}

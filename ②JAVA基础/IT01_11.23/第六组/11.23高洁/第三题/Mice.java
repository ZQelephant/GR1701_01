package com.gaojie.qhit01;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��23�� ����7:29:21
 */
public class Mice implements IZoology {

	private String name;
	private String breed;
	private String leg;
	private String weight;

	public Mice(String name, String breed, String leg, String weight) {
		super();
		this.name = name;
		this.breed = breed;
		this.leg = leg;
		this.weight = weight;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("���������ڳԷ�");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("���������ڽ�");
	}

	@Override
	public String toString() {
		return "Mice [name=" + name + ", breed=" + breed + ", leg=" + leg
				+ ", weight=" + weight + "]";
	}

}

package zhangtongtong;

public class Dog {

	// ���԰�����Ʒ�֡���ɫ�����䡢������Ҫ������˽��
	private String breed;
	private String color;
	private int age;
	private double wight;
	
	//get��set����

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWight() {
		return wight;
	}

	public void setWight(double wight) {
		this.wight = wight;
	}

	// �����������С��ԡ�˯��
	void shout() {
		System.out.println("��");
	}

	void eat(String meat) {
		System.out.println("��" + meat);
	}

	void sleep() {
		System.out.println("˯��");

		System.out.println("Ʒ��:" + breed + "\n��ɫ:" + color + "\n���䣺" + age
				+ "\n����:" + wight);
	}

}

package wangshenliang;

/**
 * @author ���� ������E-mail:793708547@QQ.com
 * @date ����ʱ�䣺2017��11��16�� ����7:13:55
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Dog {
	private String breed;
	private String color;
	private int age;
	private int weight;

	public void message() {
		System.out.println("Ʒ����:" + breed + "��Ƥë����ɫ�ǣ�" + color + "������" + age
				+ "����" + ",�����ǣ�" + weight + "����");
	}

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

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight <= 100) {
			this.weight = weight;
		}
	}

	public void bark() {
		System.out.println("��");
	}

	public void eat() {
		System.out.println("��");
	}

	public void sleep() {
		System.out.println("˯��");

	}

}

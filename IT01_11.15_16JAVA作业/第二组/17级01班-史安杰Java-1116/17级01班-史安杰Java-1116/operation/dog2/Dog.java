package dog;

public class Dog extends Zoology {

	private String breed;
	private String color;
	private int age;
	private int weight;

	public void message() {
		System.out.println("Ʒ����:" + breed + "����ɫ�ǣ�" + color + "������" + age + "��"
				+ ",�����ǣ�" + weight + "��");
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
		System.out.println("�����İ���������Ż��");
	}

	public void eat() {
		System.out.println("��ϲ���Թ�ͷ");
	}

	public void sleep() {
		System.out.println("�кõ�˯�ߣ����кõĹ���");
	}
}

package jtc;

public class TestDog {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("����");
		dog.setBreed("��������");
		dog.setColor("�ư����");
		System.out.println(dog.toString());
		dog.setAge(4);
		dog.shout();
		dog.eat();
	}
}

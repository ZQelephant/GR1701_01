package animal;
/*Author��������
 *E-mail��15539919713@163.com
 */
public class Test {
	public static void main(String[] args) {
		//ʵ�������󣺹�
		Dog dog = new Dog();
		dog.setName("��������");
		dog.setType("��Ȯ");
		dog.setColor("��ɫ");
		dog.setAge(9);
		System.out.println(dog.toString());
		dog.eat();
		dog.shout();
		
		//ʵ������������
		Mouse mouse = new Mouse();
		mouse.setName("����ɯ����");
		mouse.setType("����");
		mouse.setLegs(4);
		mouse.setWeight(1.5);
		System.out.println(mouse.toString());
		mouse.eat();
		mouse.shout();
		
	}
}
//���������࣬�ֱ𴴽����������ʵ�������󣬸���������Ը�ֵ�����ҵ��ö���ĳԡ��еķ���
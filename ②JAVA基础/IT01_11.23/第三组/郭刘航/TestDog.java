package glh;
/** 
 * @author  ������
 * @���� E-mail��1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����7:59:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
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

package whh;

/**
 * @author ���� E-mail:2421922506@QQ.com
 * @date ����ʱ�䣺2017��11��23�� ����8:52:49
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {
	public static void testZoology(Zoology c) {
		c.getEat();
		c.getcall();
		
	}

	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.Dogs("��ë");
		testZoology(dog);

		Mouse mouse = new Mouse();
		mouse.Mouses("jack","sss");
		testZoology(mouse);	
			
			
		
		
		
	}

}

package glh;
/** 
 * @author  ������
 * @���� E-mail��1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����8:27:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestMouse {

	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.setLeg(4);
		mouse.setBreed("С����");
		mouse.setName("Jack");
		mouse.setWeight(20);
		System.out.println(mouse.toString());
		mouse.eat();
		mouse.shout();
	}
}

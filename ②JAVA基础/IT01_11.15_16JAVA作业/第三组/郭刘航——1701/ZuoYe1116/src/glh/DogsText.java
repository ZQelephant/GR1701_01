package glh;
/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class DogsText {
	public static void main(String[] args) {
		
		Dogs dog = new Dogs();
		dog.eyescolor = "��ɫ";
		dog.legs = 4;
		dog.setBreed("��������");
		dog.setColor("�ư����");
		dog.setAge(4);
	    dog.setWeight(70);
	    System.out.println();
	    dog.message();
	    System.out.println("��");
	    dog.bark();
	    System.out.println("��");
	    dog.eat();
	    System.out.println("˯");
	    dog.sleep();
	}

}

package JTC;
/** 
 * @author  ����:jtc
 * @date    ����ʱ�䣺2017��11��16�� ����5:46:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Text {
public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setBreed("��������");
		dog.setColor("yellow");
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
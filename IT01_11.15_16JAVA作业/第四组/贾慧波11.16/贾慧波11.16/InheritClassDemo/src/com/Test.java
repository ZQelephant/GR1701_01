package com;
/** 
 * @author  ���� E-mail:271406@163.com
 * @date    ����ʱ�䣺2017��11��16�� ����3:14:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test {public static void main(String[] args) {
	
	Cat cat=new Cat("����",2,"��",23.5f,4);
	cat.age=3;
	System.out.println("����");
	cat.eat("fish");
	cat.play();
	
	System.out.println("��");
	cat.catchmouse();
	cat.setBreed("��������");
	System.out.println(cat.getBreed());
}

}

package com;
/** 
 * @author  ���� E-mail:271406@163.com
 * @date    ����ʱ�䣺2017��11��16�� ����3:13:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Cat extends Animal{

	public Cat(String breed, int age, String color, float weight, int leg) {
		super(breed, age, color, weight, leg);
		// TODO Auto-generated constructor stub
	}



	void play(){super.play();
		System.out.println("�Ĵ���");
	}



void catchmouse(){System.out.println("��쵽������");}
void kind(){}
	
}

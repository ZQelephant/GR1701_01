package com;


public class Test {public static void main(String[] args) {
	
	Cat cat=new Cat("��������",2,"��ɫ",23.5f,4);
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

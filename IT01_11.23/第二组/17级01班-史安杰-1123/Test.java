package com.saj;

public class Test {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.breed="��������";
		dog.color="��ɫ";
		dog.name="����";
		
		Mouse mouse=new Mouse();
		mouse.breed="����";
	    mouse.name="Jerry";	
	    mouse.legs=2;
	    
	    dog.eat();
	    dog.cry();
	    
	    mouse.cry();
	    mouse.eat();
	}

}

package guo;
/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class DogText {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog("�ư����",70,"��ɫ",4);
		/*
		dog.color = "�ư����";
		System.out.println(dog.color);
		dog.setEyescolor("��ɫ");
		System.out.println(dog.getEyescolor());
		dog.legs = 4;
		dog.weight = 70;
		dog.hobby ="�������ñ�ֽ";
		*/
		dog.message();
		dog.eat("bone");
		dog.run();
		dog.sleep();
		dog.play();
	}

}

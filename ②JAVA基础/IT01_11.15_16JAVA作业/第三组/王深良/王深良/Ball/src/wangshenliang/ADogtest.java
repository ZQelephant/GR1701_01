package wangshenliang;
/** 
 * @author  ���� ������E-mail:793708547@QQ.com
 * @date    ����ʱ�䣺2017��11��16�� ����7:19:10 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class ADogtest {
	public static void main(String[] args) {
		ADog dog = new ADog();
		dog.breed = "��ĦҮ";
		dog.color = "�ư����";
		dog.weight = 70;
		dog.age = 3;
		dog.eyescolor = "��ɫ";
		dog.legs = 4;
		dog.speed = 20;
		
		dog.message();
		System.out.println();
		dog.eat();
		System.out.println();
		dog.work();
	}

}



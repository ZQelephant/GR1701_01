package wangshenliang;
/** 
 * @author  ���� ������E-mail:793708547@QQ.com
 * @date    ����ʱ�䣺2017��11��16�� ����7:18:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class ADog {
	String breed;
    String color;
	int weight;
	int age;
	String eyescolor;
	int legs;
	int speed;
	
	void message(){
		System.out.println("Ʒ����"+breed+
				           "���������ɫ��"+color+
				           "��������"+weight+
				           "�����Ѿ�"+age+
				           "���ˣ��۾�����ɫ��"+eyescolor+
				           "��"+legs+"���ȣ�����ٶ���"+speed+"km/h");
	}
	
	public void eat(){
		System.out.println("���ܺõĴ���");
	}
	public void work(){
		System.out.println("��������");
	}


}

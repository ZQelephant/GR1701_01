package jtc;
/** 
 * @author  ����:jtc
 * @date    ����ʱ�䣺2017��11��16�� ����5:52:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PDogs {

	//���þ�ȮƷ�֡�ë����ɫ�����������䡢�۾���ɫ���ȵ����������ʱ�٣�
	String breed;
    String color;
	int weight;
	int age;
	String eyescolor;
	int legs;
	int speed;
	
	void message(){
		System.out.println("����һ����Ȯ���ҵ�Ʒ����"+breed+
				           "���������ɫ��"+color+
				           "��������"+weight+
				           "�������Ѿ�"+age+
				           "���ˣ����۾�����ɫ��"+eyescolor+
				           "������"+legs+"���ȣ�����ٶ���"+speed+"km/h");
	}
	//���ĳԵķ�����work����
	public void eat(){
		System.out.println("�ҳԵĺ���Ӫ�������ܺõĴ�����");
	}
	public void work(){
		System.out.println("�һ�������ˣ�����������Ҫ����ʱ�ṩ������������");
}
}
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
public class PDog {
	//��ȮƷ�֡�ë����ɫ�����������䡢�۾���ɫ���ȵ����������ʱ�٣�
		String breed;
		double weight;
		int age;
		String eyescolor;
		int legs;
		int speed;
		
		public void message(){
			System.out.println("����һ����Ȯ��Ʒ����"+breed+
					           "��"+weight+"�������Ѿ�"+age+
					           "���ˣ����۾�����ɫ��"+eyescolor+
					           "����"+legs+"���ȣ�����ٶ���"+speed+"km/h");
		}
		
		//�������ĳԵķ�����work����
		public void eat(){
			System.out.println("����������ʳ��������");
		}
		public void work(){
			System.out.println("�һ�����������Ҫʱͦ���������ʹ��Ե�������������������������");
		}


}

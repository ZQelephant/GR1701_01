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
public class Dog extends Animals{
	
	
	public Dog(String color, double weight, String eyescolor, int legs) {
		super(color, weight, eyescolor, legs);
		// TODO Auto-generated constructor stub
	}
	

	String hobby;
	
	void play(){
		System.out.println("��ʱ�һ����������̣��󲿷�ʱ����������������������");
	}
	void run(){
		super.run();
		System.out.println("�������У�ֻ�б��ܣ�û�����ߡ�");
	}

}

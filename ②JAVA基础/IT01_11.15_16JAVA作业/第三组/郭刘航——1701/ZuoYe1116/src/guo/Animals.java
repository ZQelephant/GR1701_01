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
public class Animals {

	String color;
	double weight;
	private String eyescolor;
	int legs;
	
	public Animals(String color, double weight, String eyescolor, int legs) {
		super();
		this.color = color;
		this.weight = weight;
		this.eyescolor = eyescolor;
		this.legs = legs;
	}
	
	public String getEyescolor() {
		return eyescolor;
	}
	public void setEyescolor(String eyescolor) {
		this.eyescolor = eyescolor;
	}
	
	public void message(){
		System.out.println("�ҵ�ëɫ��"+color+
				           "������"+weight+
				           "�����۾���ɫ��"+eyescolor+
				           "����"+legs+"���ȡ�");
	}
	
	void eat(String food){
		System.out.println("����ϲ����"+food);
	}
	void run(){
		System.out.println("�ҽ�����ɣ�����");
	}
	void sleep(){
		System.out.println("���������ܵ��£�����������������");
	}
}

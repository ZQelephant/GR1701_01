package glh;
/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Dogs extends Animal{
	//����һ���ࣺ�������԰����� Ʒ�֣�ë����ɫ�� ���䣬����
	private String breed;
	private String color;
	private int age;
	private int weight;
	
	public void message(){
		System.out.println("������Ʒ����:"+breed+"��Ƥë����ɫ�ǣ�"+color+"������"+age+"����"+",�����ǣ�"+weight+"����");
	}
	//Ʒ��
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	//��ɫ
	public String getColor() {
		return color;
	}
	public void setColor(String color) {	
		this.color = color;
	}
	//����
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;			
		}
	//����
	public double getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight<=100){
			this.weight = weight;			
		}
	}

	//�����������С��ԡ�˯��
	public void bark(){
		System.out.println("�����İ���˺����˹������ƣ��һ�������........");
	}
	public void eat(){
		System.out.println("����������ʳ������");
	}
	public void sleep(){
		System.out.println("��ȡ��������.......");

}

}

package liuyancong;
/*���ߣ�������
       ���䣺15539919713@163.com
 */
public class Animal {
	String name;
	private String color;
	float weight;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

	
	public Animal(String name, String color, float weight) {
		System.out.println("�вεĹ��췽��������");
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	void eat(String food){
		System.out.println("ϲ����"+food+"!");
	}
	void run(){
		System.out.println("���ܣ���");
	}
	void sleep(){
		System.out.println("ϲ��˯������");
	}
	
	void shuxing(){
		System.out.println("���֣�\t"+name+"\n��ɫ��\t"+color+"\n���أ�\t"+weight+"kg");
	}
}

package animal;
//���� 
public class Animal {
	private String color;
	double weight;
	int age;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	void eat(String food){
		System.out.println("��Ҫ��"+food);
	}
	void sleep(){
		System.out.println("��˯��");
	}
	
	void color(){
		System.out.println("��ɫ");
	}
	public Animal(String color, double weight, int age) {
		this.color = color;
		this.weight = weight;
		this.age = age;
	}
	
	
	
	
	

}

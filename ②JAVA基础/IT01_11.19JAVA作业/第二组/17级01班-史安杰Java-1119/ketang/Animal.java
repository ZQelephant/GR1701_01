
public  class  Animal {
	String color;
	int weight;
	int age;
	
	public Animal(String color,int weight ) {
		this.color = color;
		this.weight = weight;
		
	}
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
	   
	

}

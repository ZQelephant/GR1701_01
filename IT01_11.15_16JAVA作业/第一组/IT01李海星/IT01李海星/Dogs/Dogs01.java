

public class Dogs01 {
	
		//1  ����һ���ࣺ�������԰����� Ʒ�֣�ë����ɫ��
		//���䣬����  �����������С��ԡ�˯��
	    //Ҫ������˽�У����ṩget��set���� 
		private String name; //������
		private String breed; //Ʒ�֣�
		private String color;//��ɫ��
		private int age;//���䣬
		private double weight;//���ء�
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBreed() {
			return breed;
		}
		public void setBreed(String breed) {
			this.breed = breed;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		void bow_wow(){
			System.out.println("��~��~");
		}
		void eat(){
			System.out.println("��ϲ���Թ�ͷ��");
		}
		void sleep(){
			System.out.println("˯��~");
		}
		Dogs01(){
			System.out.println();
		}
		
		//"����"+name+",����һֻ"
		//+breed+"��"+",����"+color+",��"
		//+"���ˣ�"+"��"+weight+"�"
		
		
		
		
		
	

}

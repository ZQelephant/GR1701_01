package com.zk.qhit.Exercises09;


public class Animals {
	//����
		String name;
		//Ʒ��
		String breed;
		//��ɫ
		String color;
		//����
		private int age;
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		void eat(String food){
			System.out.println("��ϲ����"+food);  
		}
		void sleep(){
			System.out.println("��~��~");
		}
		void jump(){
			System.out.println("�ҿ������������ϣ�");
		}
		Animals(){
			System.out.println("�����޲ι���~");
		}
		
		
}

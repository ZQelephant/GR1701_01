package com.zk.qhit.Exercises09;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��16�� ����7:41:41
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
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

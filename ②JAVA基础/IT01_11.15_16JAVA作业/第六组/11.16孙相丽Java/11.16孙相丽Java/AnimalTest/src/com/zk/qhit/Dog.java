package com.zk.qhit;
/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class Dog extends Animal {
	/**1  ����һ���ࣺ����
	 * ���԰����� Ʒ�֣�ë����ɫ�� ���䣬���� 
	 *  �����������С��ԡ�˯��
	 */
	//��̬����  
		private  String variety;
		private  String color;
		private  int age;
		private  float weight;   
		
	    //��̬����
		void shout(){
			System.out.println("����");
		}
		void eat(){
	        System.out.println("����ͷ���ų�");		
		}
	    void sleep(){System.out.println("����˯�ü�����");
			
		}
	    //get set����
	    public  String getvariety(){
	    	return variety;
	    }
	    public void  setvariety(String variety ){
	    	this.variety = variety;
	    }
	    //
	    public  String getcolor(){
	    	return color;
	    }
	    public void  setcolor(String color ){
	    	this.color = color;
	    }
	    //
	    public  int getage(){
	    	return age;
	    }
	    public void  setage(int age ){
	    	this.age = age;
	    }
	    //
	    public  float getweight(){
	    	return weight;
	    }
	    public void  setweight(float weight ){
	    	this.weight = weight;
	    }

}

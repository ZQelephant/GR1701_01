package com.zk.qhit;
/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class Cat extends Animal {
        //ͨ��extendsʵ�ּ̳�
        //���̳е���и��ࣨ���ࣩ
        //�̳б��������ࣨ�����ࣩ
	    String interest;
	    
	public Cat(String name, String color, double weight, int legs,
				String variety, String interest) {
			super(name, color, weight, legs, variety);
			this.interest = interest;
		}
	
	    void  sleep(){
		super.sleep();
    	System.out.println("�Ҿ���˯����һ������ĵ�����");
    }
	
	void snore(){
		super.color=color;
		System.out.println("�Ҵ�ĺ��������");
	}
	void arrestSb(){
		System.out.println("�����ң��Ҿ�ץ�㣡����"); 
	    
	}	    
}

package com.zk.qhit;
/**
 *time:11.16
 *week:Thursday
 *weather:sun
 *site:machine room
 *author:sun
 */
public class Animal {
	//����
	String name;
    String color;
	double weight;
	int legs;
	private String variety;  
	
	/**Animal(){
		System.out.println("�����޲εĹ��췽���������ڱ�����....");
	}
	*/
	

	public Animal(String name, String color, double weight, int legs,
			String variety) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.legs = legs;
		this.variety = variety;
	}

	private String getVariety() {
		return variety;
	}



	private void setVariety(String variety) {
		this.variety = variety;
	}

	//����
	//������Ϊ��������ʽ��������Ҳ�Ǳ������ֲ�������
	void eat(String food){
		System.out.println("����ϲ��������ʳ��"+food);
	}
	
   /** private void  sleep(){
    	System.out.println("˯����һ������ƽ��");
    }
    */
     void  sleep(){
    	System.out.println("˯����һ������ƽ��");
    }
    void run(){
    	System.out.println("���ܵĿɿ���");
    }
    
}

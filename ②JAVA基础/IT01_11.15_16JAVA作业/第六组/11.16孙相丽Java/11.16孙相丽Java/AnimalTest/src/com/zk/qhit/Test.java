package com.zk.qhit;
/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class Test {
	public static void main(String[] args) {
		
	
	/**����һ�������࣬ʵ����һ����Ȯ����
	 * ���þ�ȮƷ�֡�ë����ɫ�����������䡢�۾���ɫ���ȵ�������
	 * ���ʱ�٣��������ĳԵķ�����work����
	 */
	PoliceDog dog = new PoliceDog();
	
	dog.setvariety("����Ȯ");
	System.out.println("��Ȯ��Ʒ�֣�"+dog.getvariety());
	
	dog.setcolor("��ɫ");
	System.out.println("��Ȯ��ë����ɫ��"+dog.getcolor());
	
	dog.setweight(25);
	System.out.println("��Ȯ��������"+dog.getweight());
	
	dog.setage(6);
	System.out.println("��Ȯ�����䣺"+dog.getage());
	
	dog.eyecolor="��ɫ";
	System.out.println("��Ȯ���۾�����ɫ��"+dog.eyecolor);
	
	dog.legs=4;	
	System.out.println("��Ȯ���ȵ�������"+dog.legs);
	
	dog.fastestSpeed="40km/h";
	System.out.println("��Ȯ���ȵ�������"+dog.fastestSpeed);
	
	dog.eat();
	dog.work();
	
}
}
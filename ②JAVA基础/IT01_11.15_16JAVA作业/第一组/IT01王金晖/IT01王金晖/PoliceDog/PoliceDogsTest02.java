package com.zk.qhit


public class PoliceDogsTest02 {
	public static void main(String[] args) {
		PoliceDogs02 policdogs02 = new PoliceDogs02();
		policdogs02.setName("����");
		policdogs02.setBreed("����");
		policdogs02.setColor("��ɫ");
		policdogs02.setAge(4);
		policdogs02.setWeight(30);
		policdogs02.eyecolor="��ɫ";
		policdogs02.leg=4;
		policdogs02.speed="30km/h";
		
		System.out.println("��Ȯ�����֣�"+policdogs02.getName());
		System.out.println("��Ȯ����ɫ��"+ policdogs02.getColor());
		System.out.println("��Ȯ��Ʒ�֣�"+ policdogs02.getBreed() );
		System.out.println("��Ȯ����"+ policdogs02.getAge() + "��");
		System.out.println("��Ȯ�������ǣ�"+policdogs02.getWeight());
		System.out.println("��Ȯ���۾��ǣ�"+policdogs02.eyecolor);
		System.out.println("��Ȯ��"+policdogs02.leg+"��");
		System.out.println("��Ȯ��ƽ��ʱ���ǣ�"+policdogs02.speed);
		
		
		
		
		
	}

}

package com;

//2������������Person��
//��������󷽷�getContent()����ֵ���ַ�����
//���ⶨ��say��������getContent�������������������Sudent��Workder�̳�Person��
//����ʵ�ֳ�����ķ���getContent��ʵ�������󲢷ֱ����say�������� ��


public abstract class Person1 {
	private String getContent;
	public Person1(String getContent) {
		super();
		this.getContent = getContent;
	}
	public abstract  String getContent();
	abstract void say();
	

}

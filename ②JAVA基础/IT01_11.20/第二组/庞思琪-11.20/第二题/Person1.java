package com;
/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��20�� ����8:07:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
//
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

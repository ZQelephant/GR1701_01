package com.zk.qhit.T2;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����8:44:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public abstract class Person {
	//2������������Person��
	//��������󷽷�getContent()����ֵ���ַ�����
	//���ⶨ��say��������getContent���������������
	//����Sudent��Workder�̳�Person�ࣻ
	//��ʵ�ֳ�����ķ���getContent��
	//ʵ�������󲢷ֱ����say�������� ��
	//public abstract String getContent();
	String Content;
	
	public abstract String getContent();
	
	void say(){
		System.out.println(getContent());
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package com.gaojie.qhit01;

import java.util.ArrayList;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��29�� ����3:50:46
 */
public interface IArrayListEmployee {

	//����
	boolean addEmployee(ArrayList<Employee>arrayList,Employee e);
	//ɾ��
	void removeEmployee(ArrayList<Employee>arrayList,Employee e);
	//�޸�
	boolean setEmployee(ArrayList<Employee>arrayList,Employee e);
	//��ѯ
	boolean findEmployee(ArrayList<Employee>arrayList,Employee e);
	//����
	boolean infoArrayListEmployee(ArrayList<Employee>arrayList);
	
	
}

package com.saj;

import java.util.ArrayList;

public interface ArrayListTestL {
	
	//����
	boolean addArrayEmployee(ArrayList<Employee> arrayList,Employee e);
	//�޸�
	void setArrayEmployee(ArrayList<Employee> arrayList,Employee e);
    //ɾ��
	void removeArrayEmployee(ArrayList<Employee> arrayList,Employee e);
    //����
	Employee findArrayEmployee(ArrayList<Employee> arrayList,String name);
	//����
	void infoArrayListEmployee(ArrayList<Employee> arrayList);
	
}

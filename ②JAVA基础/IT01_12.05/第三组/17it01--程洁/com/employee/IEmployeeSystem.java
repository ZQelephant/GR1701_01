package com.employee;

import java.util.ArrayList;
import java.util.Scanner;

public interface IEmployeeSystem {

	//����
	void help();
	//��
	void add(ArrayList<Employee> arrayList,Scanner sc);
	//ɾ
	void del(ArrayList<Employee> arrayList,Scanner sc);
	//��
	void set(ArrayList<Employee> arrayList,Scanner sc);
	//��
	void find(ArrayList<Employee> arrayList,Scanner sc);
	//����
	void info(ArrayList<Employee> arrayList);
	
}

package com.gaojie.qhit01;

import java.util.ArrayList;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��29�� ����3:51:25
 */
public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> alist = new ArrayList<Employee>();

		alist.add(new Employee("TP001", "����", "5500", "2000.01.01", "�̿Ͳ�"));
		alist.add(new Employee("TP002", "������", "7600", "2001.01.01", "���ֲ�"));
		alist.add(new Employee("TP003", "��ľ��", "5533", "1998.05.03", "սʿ��"));
		alist.add(new Employee("TP004", "�߽���", "9999", "1999.03.26", "��ʦ��"));

		alist.size();
		for (int i = 0; i < alist.size(); i++) {
			Employee s = alist.get(i);
			System.out.println(s);
		}
		System.out.println();
		for (Employee s : alist) {
			System.out.println(s);
		}
	}
}

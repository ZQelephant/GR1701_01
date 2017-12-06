package com.saj;

import java.util.ArrayList;
import java.util.Scanner;

public class Iraa implements Interfaces {

	void help() {
		System.out.println("------��Ա����ϵͳ-----");
		System.out.println("���ӣ�������add");
		System.out.println("ɾ����������re");
		System.out.println("�޸ģ�������set");
		System.out.println("���ң�������find");
		System.out.println("������������info");
		System.out.println("�˳�ϵͳ��������exit");

	}

	@Override
	public void addEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();

		String[] a = s.split(",");
		Employee e = new Employee();
		e.setName(a[0]);
		e.setId(a[1]);
		e.setSalary(Double.parseDouble(a[3]));
		e.setDate(a[4]);
		e.setDepartment(a[5]);
		arrayList.add(e);
		this.infoArraylistEmployee(arrayList);

	}

	@Override
	public void removeEmployee(ArrayList<Employee> arrayList, String name) {
		Employee temp;

		temp = this.findEmployee(arrayList, name);
		if (temp == null) {
			System.out.println("��Ҫɾ���Ķ��󲻴���");
		} else {
			arrayList.remove(temp);
		}
		this.infoArraylistEmployee(arrayList);
	}

	@Override
	public void setEmployee(ArrayList<Employee> arrayList, Scanner sc) {

		Employee e;
		String name = "";
		e = this.findEmployee(arrayList, name);
		if (null == e) {
			System.out.println("���޸ĵĶ��󲻴��ڣ�����������");
		} else {
			int i = arrayList.indexOf(e);
			arrayList.set(i, e);
		}
		this.infoArraylistEmployee(arrayList);
	}

	@Override
	public Employee findEmployee(ArrayList<Employee> arrayList, String name) {
		// TODO Auto-generated method stub
		Employee e = null;
		for (int i = 0; i < arrayList.size(); i++) {
			e = arrayList.get(i);
			String eNme = e.getName();
			if (eNme.equals(0)) {
				System.out.println("�����ҵĶ��󲻴��ڣ�����������");

			} else {
				System.out.println(e.toString());
			}
			this.infoArraylistEmployee(arrayList);
		}
		return null;

	}

	@Override
	public void infoArraylistEmployee(ArrayList<Employee> arrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			Employee emp = arrayList.get(i);
			String s = emp.toString();
			System.out.println(s);

		}

	}

}

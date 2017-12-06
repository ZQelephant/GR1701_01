package com.employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSystem implements IEmployeeSystem {

	@Override
	public void help() {
		System.out.println("-----��Ա����ϵͳ-----"
						+"\n<1>��ӹ�Ա��Ϣ������Add"
						+"\n<2>����һλ��Ա��Ϣ������Find"
						+"\n<3>�鿴ȫ����Ա��Ϣ������Info"
						+"\n<4>�޸Ĺ�Ա��Ϣ������Set"
						+"\n<5>ɾ����Ա��Ϣ������Del"
						+"\n<6>�ٴβ鿴������Ϣ������Help"
						+"\n<7>�˳�ϵͳ������Exit");
	}

	@Override
	public void add(ArrayList<Employee> arrayList, Scanner sc) {
		System.out.println("������Ҫ��ӵĹ�Ա��Ϣ"
						+"\n��ʽ�����,����,нˮ,��ְ����,����"
						+"\nע���м���   ����, ����");
		boolean l = true;
		while (l) {
			String[] s = sc.next().split(",");
			if (s.length!=5) {
				System.out.println("�޷���ӣ����ʵ��Ϣ����ʽ�������룡");
			}else {
				arrayList.add(new Employee(s[0], s[1], Double.parseDouble(s[2]), s[3], s[4]));
				System.out.println("��ӳɹ���");
				l = false;
			}
		}
	}

	@Override
	public void find(ArrayList<Employee> arrayList, Scanner sc) {
		System.out.println("������������");
		String name = sc.next();
		boolean s = false;
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getName().equals(name)) {
				System.out.println(arrayList.get(i).toString());
				break;
			}else {
				s = true;
			}
		}
		if (s) {
			System.out.println("���޴��ˣ�");
		}
	}
	
	@Override
	public void info(ArrayList<Employee> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}
	}
	
	@Override
	public void set(ArrayList<Employee> arrayList, Scanner sc) {
		System.out.println("������������");
		String name = sc.next();
		boolean s = false;
		int i;
		for (i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getName().equals(name)) {
				break;
			}else {
				s = true;
			}
		}
		if (s) {
			System.out.println("���޴��ˣ�");
		}else {
			System.out.println("������Ҫ�޸�Ϊ�Ĺ�Ա��Ϣ"
					+"\n��ʽ�����,����,нˮ,��ְ����,����"
					+"\nע���м���   ����, ����");
			boolean b = true;
			while (b) {
				String[] a = sc.next().split(",");
				if (a.length!=5) {
					System.out.println("�޸�ʧ�ܣ����ʵ��Ϣ����ʽ�������룡");
				}else {
					arrayList.set(i, new Employee(a[0], a[1], Double.parseDouble(a[2]), a[3], a[4]));
					System.out.println("�޸ĳɹ���");
					b = false;
				}
			}
		}
	}
	
	@Override
	public void del(ArrayList<Employee> arrayList, Scanner sc) {
		System.out.println("������������");
		String name = sc.next();
		boolean s = false;
		int i;
		for (i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getName().equals(name)) {
				arrayList.remove(i);
				System.out.println("ɾ���ɹ���");
				break;
			}else {
				s = true;
			}
		}
		if (s) {
			System.out.println("���޴��ˣ�");
		}
	}

}

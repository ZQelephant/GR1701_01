package com.saj;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> arrayList = new ArrayList<Employee>();

		Employee e = new Employee("0201", "������", 7500, "20170526", "���鲿");

		arrayList.add(e);
		arrayList.add(new Employee("0202", "�����", 7500, "20170526", "���鲿"));
		arrayList.add(new Employee("0203", "��ӯӯ", 7500, "20170526", "���鲿"));
		arrayList.add(new Employee("0204", "������", 7500, "20170526", "���鲿"));
		arrayList.add(new Employee("0205", "��������", 7500, "20170526", "���鲿"));
		System.out.println();
		System.out.println(arrayList.size());

		Employee e1 = arrayList.get(0);
		String s = e1.toString();
		//System.out.println(s);
		
		arrayList.remove(e1);

		for (int i = 0; i < arrayList.size(); i++) {
			Employee e2 = arrayList.get(i);
			System.out.println(e2.toString());

		}

	}

}

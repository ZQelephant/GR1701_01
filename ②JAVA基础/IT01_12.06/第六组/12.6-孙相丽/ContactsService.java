package com.Addressbook;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContactsService implements IContacts {

	void help() {
		System.out.println("---ͨѶ¼---");
		System.out.println("¼��һ����ͨѶ¼����Ϣ������Add");
		System.out.println("��ʾͨѶ¼��Ϣ������info");
		System.out.println("ͨ����������һ���˵�ͨѶ¼��Ϣfindbyname");
		System.out.println("ͨ���Ա����һ���˵�ͨѶ¼��Ϣfindbysex");
		System.out.println("ͨ���绰����һ���˵�ͨѶ¼��Ϣfindbytelnumber");
		System.out.println("�˳�ϵͳ������Quit");
		System.out.println("����������Ҫ��ָ��");

	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length!= 3) {
			System.out.println("���������Ϣ���������޷�¼��");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		// 1.����
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
		// 2.��ǿforѭ��
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}
		// 3.������,�����������ϵ�
		Iterator<Contacts> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Contacts contacts = (Contacts) iterator.next();
			System.out.println(contacts.toString());
		}
	}

	@Override
	public ArrayList<Contacts> findbysex(ArrayList<Contacts> arrayList,
			String sex) {
		for (Contacts contacts : arrayList) {
			if (contacts.getSex().equals(sex)) {
				System.out.println(contacts.toString());

			}
		}

		return null;
	}

	@Override
	public Contacts findbyname(ArrayList<Contacts> arrayList, String name) {
		for (Contacts contacts : arrayList) {
			if (contacts.getName().equals(name)) {
				System.out.println(contacts.toString());
			}
		}

		return null;

	}

	@Override
	public Contacts findbytelnumber(ArrayList<Contacts> arrayList,
			String telnumber) {
		for (Contacts contacts : arrayList) {
			if (contacts.getTelNumber().equals(telnumber)) {
				System.out.println(contacts.toString());
			}
		}
		return null;
	}

}

package com.gzz;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��27�� ����4:24:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class ContactsService implements IContacts {

	void helpinfo() {
		System.out.println("----ͨѶ¼����ϵͳ----");
		System.out.println("--1--¼��ͨѶ¼");
		System.out.println("--2--��ʾͨѶ¼��Ϣ");
		System.out.println("--3--��������");
		System.out.println("--4--�Ա�����");
		System.out.println("--5--�绰����");
		System.out.println("--6--�˳�ͨѶ¼");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {

		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("���������Ϣ��ʽ���������������룬��ʽ:��xx����/Ů��158****5478������");
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		// 1.
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
		/*
		 * for (Contacts contacts : arrayList) {
		 * System.out.println(contacts.toString()); }
		 */

	}

	@Override
	public ArrayList<Contacts> findBysex(ArrayList<Contacts> arrayList,
			String sex) {
		ArrayList<Contacts> arrayList2 = new ArrayList<Contacts>();
		for (Contacts contacts : arrayList2) {
			String string = contacts.getSex();
			if (string.equals(sex)) {
				arrayList2.add(contacts);
			} else {
				System.out.println("����������");
			}
		}

		return arrayList2;

	}

	@Override
	public Contacts findByname(ArrayList<Contacts> arrayList, String name) {
		Contacts contact_1 = new Contacts();
		boolean isHas = false;
		for (Contacts contacts : arrayList) {
			String string = contacts.getName();
			if (string.equals(name)) {
				contact_1.setName(contacts.getName());
				contact_1.setSex(contacts.getName());
				contact_1.setTelNum(contacts.getTelNum());
				System.out.println(contacts.toString());
				isHas = true;
			}
		}
		if (!isHas) {
			System.out.println("���޴���");
		}
		return contact_1;

	}

	@Override
	public Contacts findBytelNum(ArrayList<Contacts> arrayList, String telNum) {
		Contacts contacts1 = new Contacts();
		boolean isHas = false;
		for (Contacts contact : arrayList) {

			String telNum2 = contact.getTelNum();
			if (telNum2.equals(telNum)) {
				System.out.println(contact);
				contacts1.equals(contact.getName());
				contacts1.equals(contact.getSex());
				contacts1.equals(contact.getTelNum());
			}
			if (!isHas) {
				System.out.println("����������");
			}

		}

		return contacts1;
	}

}

package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContactService implements Icontact {

	@Override
	public void addContact(ArrayList<Contact> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("����");
		} else {
			Contact contact = new Contact(a[0], a[1], a[2]);
			arrayList.add(contact);
			System.out.println(contact.toString());
		}
	}

	@Override
	public void infoContact(ArrayList<Contact> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contact contact = arrayList.get(i);
			System.out.println(contact.toString());
		}
		//
		/*for (Contact contact : arrayList) {
			System.out.println(contact.toString());
		}
		arrayList.iterator();
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Contact contact = (Contact) iterator.next();
			System.out.println(contact.toString());
		}
		Iterator<Contact> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Contact contact = (Contact) iterator.next();
			System.out.println(contact.toString());
		}
		*/
	}

	@Override
	public ArrayList<Contact> findBySex(ArrayList<Contact> arrayList, String sex) {
		ArrayList<Contact> arrayList2=new ArrayList<Contact>();
		boolean a = true;
		for (Contact contact : arrayList2) {
			String string = contact.getSex();
			if (string.equals(sex)) {
				arrayList2.add(contact);
				a= false;
			}
		}
		 if(a) {
				System.out.println("������");
			}
		return arrayList2;
	}

	@Override
	public Contact findByName(ArrayList<Contact> arrayList, String name) {
		Contact contact1=new Contact();

		for (Contact contact : arrayList) {
			String string = contact.getName();
			if (string.equals(name)) {
				//System.out.println(contact);
				return contact;
			}
			}
		return null;
	}

	@Override
	public Contact findByNum(ArrayList<Contact> arrayList, String telNum) {
		Contact contact1=new Contact();
		
		for (Contact contact : arrayList) {
			String string = contact.getTelNum();
			if (string.equals(telNum)) {
				return contact;
			} {
				System.out.println("������");
			}
		}
		return null;
	}

	@Override
	public void infoHelp() {
		System.out.println("----����-----");
		System.out.println("¼��ͨ��¼��Ϣ��1");
		System.out.println("��ʾͨ��¼��Ϣ��2");
		System.out.println("����������3");
		System.out.println("�Ա�������4");
		System.out.println("�绰������5");
		System.out.println("�˳���6");
		
	}

}

package com.jkl;

import java.util.ArrayList;
import java.util.Scanner;


public class ContactsService implements IContacts {

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s = sc.next();
		String []a= s.split(",");
		if (a.length!=3) {
			System.out.println("����������ݲ�����");
		} else {
			Contacts contacts =new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());

		}
		sc.next();

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
		
	}

	@Override
	public ArrayList<Contacts> findBysex(ArrayList<Contacts> arrayList,
			String sex) {
	for (Contacts contacts : arrayList) {
		String sex2=contacts.getSex();
		if (contacts.getName().equals(null)) {
			System.out.println(contacts.toString());
			arrayList.add(contacts);
			
		}else {
			System.out.println("û�д��Ա����ϵ��");
		}
	}
	return null;
	}
	@Override
	public Contacts findByname(ArrayList<Contacts> arrayList, String name) {
		for (Contacts contacts : arrayList) {
			if (contacts.getName().equals(name)) {
				System.out.println(contacts.toString());
			}
		}
		
		return null;
	}

	@Override
	public Contacts findByname(ArrayList<Contacts> arrayList, String name) {
		for (Contacts contacts : arrayList) {
			if (contacts.getName().equals(name)) {
				System.out.println(contacts.toString());
			}
		}
		
		return null;
	}

	@Override
	public void infohelp() {
		// TODO Auto-generated method stub

	}

	@Override
	public Contacts findBynum(ArrayList<Contacts> arrayList, String telnum) {
		// TODO Auto-generated method stub
		return null;
	}

}

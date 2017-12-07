package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsService implements IContacts {

 

	@Override
	public void help() {
		System.out.println("---ͨ��¼�洢��ѯϵͳ");
		System.out.println("[1] ¼����Ϣ������  add");
		System.out.println("[2] ��ʾ��Ϣ������  info");
		System.out.println("[3] �Ա����������  sex");
		System.out.println("[4] ��������������  name");
		System.out.println("[5] �绰����������  num");
		System.out.println("[6] �˳�ϵͳ����      quit");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String[] s = sc.next().split(",");

		if (s.length != 3) {
			System.out.println("���������Ϣ����������ȷ,�޷�¼��");
		} else {
			Contacts contacts = new Contacts(s[0], s[1], s[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		
		
		
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}

	}

	@Override
	public ArrayList<Contacts> findBysex(ArrayList<Contacts> arrayList,
			String sex) {
		//�½�һ��������
		ArrayList<Contacts> arrayList2 = new ArrayList<Contacts>();
		
		boolean is = false;
		for (Contacts contacts : arrayList) {
			//��contacts���һ���Ա�
			String sex2 = contacts.getSex();
			if (sex2.equals(sex)) {
				is = true;						
				//ͨ��.add����ʽ���ҵ�����Ϣ�浽�µļ�������
				arrayList.add(contacts);
				System.out.println(contacts.toString());
			}
		}if (!is) {
			System.out.println("��������Ա𲻴���");
		}
		return arrayList2;
	}

	@Override
	public Contacts findByname(ArrayList<Contacts> arrayList, String name) {
		Contacts contacts2 = new Contacts();
		boolean  is = false;
		for (Contacts contacts : arrayList) {
			String name2 = contacts.getName();
			if (name2.equals(name)) {
				System.out.println(contacts.toString());
				is = true;
			}
		}if (!is) {
			System.out.println("�����ҵ�����������  ");
		}
		return contacts2;
	}

	@Override
	public Contacts findByNum(ArrayList<Contacts> arrayList, String telnum) {
		Contacts contacts2 = new Contacts();
		boolean is = false;
		for (Contacts contacts : arrayList) {
			 String telnum2 = contacts.getTelnum();
			 if (telnum2.equals(telnum)) {
				System.out.println(contacts.toString());
				contacts2=contacts;
				is = true;
			}
			 
		}if (!is) {
			System.out.println("�����ҵĵ绰������ ");
		}
		return contacts2;
	}

}

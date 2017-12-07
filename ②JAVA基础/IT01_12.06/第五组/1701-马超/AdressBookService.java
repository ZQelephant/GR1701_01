package  machao;

package com.adress;


import java.util.ArrayList;
import java.util.Scanner;


public class AdressBookService implements IAdressBook {

	@Override
	public void helpInfo() {
		System.out.println("-----ͨѶ¼����ϵͳ-----")
		System.out.println("[1]���һλ��ϵ������������")
		System.out.println("[2]�鿴������ϵ����Ϣ����������")
		System.out.println("[3]����������������������")
		System.out.println("[4]�����Ա���������������")
		System.out.println("[5]���ݵ绰������������������")
		System.out.println("[6]�ٴβ鿴��������������")
		System.out.println("[7]�˳�ͨѶ¼����ϵͳ����������");
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		System.out.println("��������ϵ����Ϣ"
						+"\n��ʽ:����,�Ա�,�绰����     �м��Զ���,����");
		boolean b1 = true;
		while (b1) {
			String[] s = sc.next().split(",");
			if (s.length != 3) {
				System.out.println("�������Ϣ���ʽ����ȷ�����ʵ���������룡");
			} else {
				arrayList.add(new Contacts(s[0], s[1], s[2]));
				System.out.println("¼��ɹ���");
				b1 = false;
			}
		}
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		/*1.
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}
		*/
		//2.
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}
		/*3.
		Iterator<Contacts> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Contacts contacts = (Contacts) iterator.next();
			System.out.println(contacts.toString());
		}
		*/
	}

	@Override
	public Contacts findByname(ArrayList<Contacts> arrayList, String name) {
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getName().equals(name)) {
				return arrayList.get(i);
			}
		}
		return null;
	}

	@Override
	public ArrayList<Contacts> findBysex(ArrayList<Contacts> arrayList,
			String sex) {
		ArrayList<Contacts> arrayList2 = new ArrayList<Contacts>();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getSex().equals(sex)) {
				arrayList2.add(arrayList.get(i));
			}
		}
		if (arrayList2.size()!=0) {
			return arrayList2;
		}
		System.out.println("δ���ҵ����Ա���ˣ�");
		return null;
	}

	@Override
	public Contacts findBynum(ArrayList<Contacts> arrayList, String telnum) {
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getTelnum().equals(telnum)) {
				return arrayList.get(i);
			}
		}
		return null;
	}

}

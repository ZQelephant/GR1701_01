package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService service = new ContactsService();
		Scanner sc = new Scanner(System.in);

		service.help();
		boolean isquit = true;
		while (isquit) {
			System.out.println("������ָ��, �س���ִ�� ");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				service.addContacts(arrayList, sc);
				break;
			case 2:
				service.infoContacts(arrayList);
				break;
			case 3:
				String sex = sc.next();
				service.findBysex(arrayList, sex);
				break;
			case 4:
				String name = sc.next();
				service.findByname(arrayList, name);
				break;
			case 5:
				String telnum = sc.next();
				service.findByNum(arrayList, telnum);
				break;
			case 6:
				isquit = false;
				break;

			default:
				System.out.println("�������ָ���ȷ ,����������ָ��");
				break;
			}
		}
		System.out.println("��ӭ�´�ʹ��");
	}
}
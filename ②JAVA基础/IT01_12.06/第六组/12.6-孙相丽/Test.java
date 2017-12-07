package com.Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService contactsService = new ContactsService();
		contactsService.help();
		Scanner sc = new Scanner(System.in);
		String key;
		boolean isQuit = true;
		while (isQuit) {
			key = sc.nextLine();
			switch (key) {

			case "Add":
				System.out.println("��������Ҫ���˵����֣��Ա𣬵绰����");
				contactsService.addContacts(arrayList, sc);
				break;
			case "info":
				System.out.println("����ͨѶ¼��Ϣ���£�");
				contactsService.infoContacts(arrayList);
				break;
			case "findbyname":
				System.out.println("");
				String name = sc.next();
				contactsService.findbyname(arrayList, name);

				break;
			case "findbysex":
				String sex = sc.next();
				contactsService.findbysex(arrayList, sex);
				break;
			case "findbytelnumber":
				String telnumber = sc.next();
				contactsService.findbytelnumber(arrayList, telnumber);
				break;
			case "Quit":
				isQuit = false;
				break;
			default:
				break;
			}

		}
		System.out.println("��Ҋ");
	}
}

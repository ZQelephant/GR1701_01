package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService contactsService = new ContactsService();
		Scanner sc = new Scanner(System.in);
		contactsService.help();
		String key;
		boolean isQuit = true;
		while (isQuit) {
			key = sc.next();
			switch (key) {
			case "add":
				System.out.println("��������Ҫ��ӵ���Ϣ��");
				contactsService.addContacts(arrayList, sc);
				break;
			case "info":
				contactsService.infoContacts(arrayList);
				break;
			case "name":
				System.out.println("��������Ҫ���ҵ�������");
				String name = sc.next();
				contactsService.findByName(arrayList, name);
				break;
			case "sex":
				System.out.println("��������Ҫ���ҵ��Ա�");
				String sex = sc.next();
				contactsService.findBySex(arrayList, sex);
				break;
			case "tell":
				System.out.println("��������Ҫ���ҵĵ绰���룡");
				String tell = sc.next();
				contactsService.findBySex(arrayList, tell);
				break;
			case "exit":
				isQuit = false;
				break;
			    default:
				break;
			}

		}
		System.out.println("лл�����˳�����!");
	}

}

package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

/
public interface IContacts {

	//���
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	//����
	void infoContacts(ArrayList<Contacts> arrayList);
	//��ѯ
	ArrayList<Contacts> findBySex(ArrayList<Contacts> arrayList,String sex);
	Contacts findByName(ArrayList<Contacts> arrayList,String name);
	Contacts findByTelnum(ArrayList<Contacts> arrayList,String telnum);
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ContactService implements Icontacts {

	
	public void helpInfo(){
		 System.out.println("---ͨѶ¼ϵͳ---");
		 System.out.println("[1]¼��ͨѶ¼�밴1");
		 System.out.println("[2]��ʾ����ͨѶ¼�밴2");
		 System.out.println("[3]���������밴3");
		 System.out.println("[4]�Ա������밴4");
		 System.out.println("[5]�绰�����밴5");
		 System.out.println("[6]�˳��밴6");

	}

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
			System.out.println("û�д����Ա����ϵ��");
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
	public Contacts findBynum(ArrayList<Contacts> arrayList, String telnum) {
		// TODO Auto-generated method stub
		for (Contacts contacts : arrayList) {
			if (contacts.getSex().equals(telnum)) {
				System.out.println(contacts.toString());
			}
		}
		return null;
	}

}

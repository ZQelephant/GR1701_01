
public class ContactsService implements IContacts {

	@Override
	public void helpInfo() {
		 System.out.println("---ͨѶ¼ϵͳ---");
		 System.out.println("[1]¼��ͨѶ¼�밴1");
		 System.out.println("[2]��ʾ����ͨѶ¼�밴2");
		 System.out.println("[3]���������밴3");
		 System.out.println("[4]�Ա������밴4");
		 System.out.println("[5]�绰�����밴5");
		 System.out.println("[6]�˳��밴6");
		
		
	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s = sc.next();
		String []a = s.split(",");
		if (a.length!=3) {
			System.out.println("������Ķ�������");
			
		} else {
			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}
		
	}

	@Override
	public void ergContacts(ArrayList<Contacts> arrayList) {
		
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}
		Iterator<Contacts> iterator = arrayList.iterator();
		for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
			Contacts contacts = (Contacts) iterator2.next();
			
		}System.out.println(arrayList.toString());
	}

	@Override
	public Contacts nameContacts(ArrayList<Contacts> arrayList, String name) {
		
		for (Contacts contacts : arrayList) {
			if (contacts.getName().equals(name)) {
				System.out.println(contacts.toString());
			}
		}
		return null;
	}
	

	@Override
	public ArrayList<Contacts> sexContacts(ArrayList<Contacts> arrayList, String gender) {
		
		for (Contacts contacts : arrayList) {
			if (contacts.getGender().equals(gender)) {
				System.out.println(contacts.toString());
			}
		}
		return null;
	}

	@Override
	public Contacts telNumContacts(ArrayList<Contacts> arrayList, String telNum) {
		
		for (Contacts contacts : arrayList) {
			if (contacts.getTelNum().equals(telNum)) {
				System.out.println(contacts.toString());
			}
		}
		return null;
	}
	

}

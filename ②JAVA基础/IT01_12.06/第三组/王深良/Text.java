
public class Text {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList< Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService contactsService = new ContactsService();
		contactsService.helpInfo();
		boolean isquit = true;
		String s;
		while (isquit) {
			s = sc.next();
			switch (s) {
			case "1":
				contactsService.addContacts(arrayList, sc);	
				break;
			case "2":
				contactsService.ergContacts(arrayList);
				
				break;
			case "3":
			String name =sc.next();
				contactsService.nameContacts(arrayList,name);
		
				break;
			case "4":;
			String gender =sc.next();
			contactsService.sexContacts(arrayList, gender);
				break;
			case "5":;
			String telNum =sc.next();
			contactsService.telNumContacts(arrayList, telNum);
				break;
			case "6":
				isquit = false;
				break;
			

			default:
				break;
			}
		}System.out.println("�ݰ�");
	}

}

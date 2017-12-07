package machao;


package com.adress;


public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		AdressBookService abs = new AdressBookService();
		abs.helpInfo();
		boolean isExit = true;
		while (isExit) {
			System.out.println("������ָ����س���!");
			int k = sc.nextInt();
			switch (k) {
			
			case 1:
				abs.addContacts(arrayList, sc);
				break;
				
			case 2:
				abs.infoContacts(arrayList);
				break;
				
			case 3:
				System.out.println("����������");
				String name =sc.next();
				if (abs.findByname(arrayList, name)==null) {
					System.out.println("���޴��ˣ�");
				} else {
					System.out.println(abs.findByname(arrayList, name).toString());
				}
				break;
				
			case 4:
				System.out.println("�������Ա�");
				String sex =sc.next();
				for (int i = 0; i <abs.findBysex(arrayList, sex).size(); i++) {
					System.out.println(abs.findBysex(arrayList, sex).get(i).toString());
				}
				break;
				
			case 5:
				System.out.println("������绰����");
				String telnum =sc.next();
				if (abs.findBynum(arrayList, telnum)==null) {
					System.out.println("���޴��ˣ�");
				} else {
					System.out.println(abs.findBynum(arrayList, telnum).toString());
				}
				break;
				
			case 6:
				abs.helpInfo();
				break;
				
			case 7:
				isExit = false;
				break;
				

			default:
				System.out.println("��������ȷ��ָ�");
				break;
			}
		}
		System.out.println("��лʹ��,�ټ���");
	}
}

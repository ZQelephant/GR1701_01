package whh;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:2421922506@QQ.com
 * @date    ����ʱ�䣺2017��12��6�� ����8:32:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IContacts {
	void helpInfo();
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	void ergContacts(ArrayList<Contacts> arrayList);
	Contacts nameContacts(ArrayList<Contacts> arrayList, String name);
	ArrayList<Contacts> sexContacts(ArrayList<Contacts> arrayList, String gender);
	Contacts telNumContacts(ArrayList<Contacts> arrayList, String telNum);

}

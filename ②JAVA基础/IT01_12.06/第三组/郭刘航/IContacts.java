package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
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

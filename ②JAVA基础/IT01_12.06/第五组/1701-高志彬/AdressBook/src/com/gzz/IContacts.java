package com.gzz;


import java.util.ArrayList;
import java.util.Scanner;



/**
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IContacts {
	//¼��
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	//
	void infoContacts(ArrayList<Contacts> arrayList);
	//����
	ArrayList<Contacts> findBysex(ArrayList<Contacts> arrayList,String sex);
	
	Contacts findByname(ArrayList<Contacts> arrayList,String name);

	Contacts findBytelNum(ArrayList<Contacts> arrayList,String telNum);
	
	

}

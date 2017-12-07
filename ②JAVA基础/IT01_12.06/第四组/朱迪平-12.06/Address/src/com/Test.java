package com;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:271406@163.com
 * @date    ����ʱ�䣺2017��12��6�� ����8:15:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Test {

	

	public static void main(String[] args ) {
		ArrayList<Contact> arrayList=new ArrayList<Contact>();
		ContactService contactService=new ContactService();
		contactService.infoHelp();
		Scanner sc=new Scanner(System.in);
		boolean isQuit=true;
		while (isQuit) {
			int key=sc.nextInt();
			switch (key) {
			case 1:
				contactService.addContact(arrayList, sc);
				
				break;
			case 2:
				contactService.infoContact(arrayList);
				break;
			case 3:
				 String name = sc.next();
				 if (contactService.findByName(arrayList,name)==null) {
					 System.out.println("������");
				} else {
					System.out.println(contactService.findByName(arrayList,name).toString());
				}
				
				break;
			case 4:
				 String sex = sc.next();
				contactService.findBySex(arrayList, sex);
				break;
			case 5:
				 String num = sc.next();
				System.out.println(contactService.findByNum(arrayList, num));
				break;
			case 6:
				isQuit=false;
				break;

			default:
				break;
			}
		}
System.out.println("�ټ�");
	}

}

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
public class Test {

	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService Service  =  new ContactsService();
		Scanner sc = new Scanner(System.in); 
		Service.helpinfo();
		boolean isQuit = true;
		int s =0;
		while (isQuit) {
			s = sc.nextInt();
			switch (s) {
			case 1:
				System.out.println("��������Ҫ¼�����Ϣ");
				Service.addContacts(arrayList, sc);
				break;
			case 2:
				Service.infoContacts(arrayList);
				break;
			case 3:
				System.out.println("��������Ҫ��ѯ����Ϣ");
				String name = sc.next();
				Service.findByname(arrayList, name);
				break;
			case 4:
				System.out.println("��������Ҫ��ѯ����Ϣ");
				String Sex = sc.next();
				Service.findBysex(arrayList, Sex);
				
				break;
			case 5:
				System.out.println("��������Ҫ��ѯ����Ϣ");
				String telNum = sc.next();
				Service.findBytelNum(arrayList, telNum);
				break;
			case 6:
				isQuit = false;
				
				break;
			default:
				break;
			}
			
		}
		System.out.println("�˳�ϵͳ");

	}

}

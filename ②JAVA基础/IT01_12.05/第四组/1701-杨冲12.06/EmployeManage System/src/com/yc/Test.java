package com.yc;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		//����
		ArrayList<Employee> arraylist = new ArrayList<Employee>();
		
		Scanner sc = new Scanner(System.in);
		
		ArrayListEmployee  t = new ArrayListEmployee();
		
		boolean isEquat = true;
		String s;
		t.helpEmployee();
       
		
		while (isEquat) {
			s = sc.next();
			
			
			
			switch (s) {
			case "find":
				System.out.println("��������Ҫ���ҵĹ�Ա������");
				String eName = sc.next();
				System.out.print("��Ҫ���ҵĹ�Ա��ϢΪ��");
				String s1 = t.findEmployee(arraylist, eName).toString();
				System.out.println(s1);
				break;
			case "add":
				System.out.println("��������Ҫ��ӵĹ�Ա��Ϣ");
				
				 t.addEmployee(arraylist, sc);
				break;
			case "remove":
				System.out.println("��������Ҫɾ���Ĺ�Ա����");
				String m = sc.next();
				t.removeEmployee(arraylist, m);
				break;
			case "set":
				System.out.println("��������Ҫ�޸ĵĹ�Ա����:");
				System.out.println("�޸ĸ�ʽ���£�ÿ����Ϣ��,�Ÿ�����(name, id,name, price, date, department )");
				t.setEmployee(arraylist, sc);
				
				break;


			case "Exit":
				isEquat = false;
			
				break;

			



			default:
				break;
			}
			
		}
		System.out.println("�ټ�����л���ʹ�ã�");
	}
}
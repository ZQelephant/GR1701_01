package com.zdp;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:271406@163.com
 * @date    ����ʱ�䣺2017��11��28�� ����11:14:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class ArrayListEmployee implements IArrayInterface {
	

	//����
	@Override
	public void helpEmployee() {
		System.out.println("-----��Ա����ϵͳ------");
		System.out.println("���ҹ�Ա��Ϣ�����룺find");
		System.out.println("��ӹ�Ա��Ϣ�����룺add");
		System.out.println("Ҫɾ����Ա��Ϣ�����룺remove");
		System.out.println("�����޸Ĺ�Ա��Ϣ�����룺set");
		System.out.println("�˳�������:Exit");
		}

	//���
	@Override
	public void addEmployee(ArrayList<Employee> arraylist,  Scanner sc ) {
		String s = sc.next();
		String arrs[] = s.split(",");
		Employee e =new Employee(arrs[0], arrs[1], Double.parseDouble(arrs[2]) , arrs[3], arrs[4]);
		arraylist.add(e);
		this.infoArraylistEmployee(arraylist);
		
		
	}

	//ɾ��
	@Override
	public void removeEmployee(ArrayList<Employee> arraylist,String name) {
		
		Employee m ;
	  m = this.findEmployee(arraylist, name);
		
		if (m==null) {
			System.out.println("����Ҫɾ������Ϣδ�ҵ���");
		} else {
			arraylist.remove(m);

		}
		
		this.infoArraylistEmployee(arraylist);
		
	}
 
	//�����޸�
	@Override
	public void setEmployee(ArrayList<Employee> arraylist, Scanner sc) {
		Employee temp ;
		String s = sc.next();
		String[] arrs = s.split(",");
		temp =this.findEmployee(arraylist,arrs[0]);
		
		if (temp ==null ) {
			System.out.println("��Ǹ������Ҫ�޸ĵ���Ϣδ�ҵ���");
			
		} else {
			temp.setId(arrs[1]);
			temp.setPrice(Double.parseDouble(arrs[3]));
			temp.setDepartment(arrs[5]);

		}
		this.infoArraylistEmployee(arraylist);
	}

	//����
	@Override
	public Employee findEmployee(ArrayList<Employee> arraylist,String name) {
		Employee a = null;
		
		for (int i = 0; i <arraylist.size(); i++) {
			//boolean isEqual = false; 
			a = arraylist.get(i);
			String aName =a.getName();
			//isEqual =aName.equals(name);
			if (aName.equals(name)) {
				return a;
			}
			
		}
		this.infoArraylistEmployee(arraylist);
		return a;
		
		
	}
	
	
	public void infoArraylistEmployee(ArrayList<Employee> arraylist){
		for (int i = 0; i <arraylist.size(); i++) {
			System.out.println(arraylist.get(i).toString());
		}
		
	}

	

}

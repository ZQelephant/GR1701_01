/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��4�� ����8:22:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package com.zk;

import java.util.ArrayList;
import java.util.Scanner;

public class Gaokaochengji implements Gaokao {
	void help1(){
		System.out.println("----���˵�----");
		System.out.println("[1]¼��ɼ�1");
		System.out.println("[2]��ӡ�ɼ�2");
		System.out.println("[3]�߷ֳɼ�3");
		System.out.println("[4]�˳�4");
	}
	void help2(){
		System.out.println("----�Ӳ˵�----");
		System.out.println("[1]�ܷ����1");
		System.out.println("[2]�������2");
		System.out.println("[3]��ѧ���3");
		System.out.println("[4]Ӣ�����4");
		System.out.println("[5]�˳���5");
	}

	@Override
	public void addkaoshi(ArrayList<Kaoshi> arrayList, Scanner sc) {
		String s=sc.next();
		String[] a=s.split(",");
		Kaoshi ks = new Kaoshi();
		ks.setName(a[0]);
		ks.setId(a[1]);
		ks.setYu(Double.parseDouble(a[2]));
		ks.setShu(Double.parseDouble(a[3]));
		ks.setWai(Double.parseDouble(a[4]));
		arrayList.add(ks);
		inforkaoshi(arrayList);

	}

	@Override
	public void inforkaoshi(ArrayList<Kaoshi> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Kaoshi ks = arrayList.get(i);
			String st=ks.toString();
			System.out.println(st);
		}

	}

	@Override
	public void maxkaoshi(ArrayList<Kaoshi> arrayList,String subject) {
		double max=0;
		Kaoshi kaoshi = null;
		if (subject.equals("�ܷ�")) {
		for (int i = 0; i < arrayList.size(); i++) {
			max=arrayList.get(0).getZong();
			if (arrayList.get(i).getZong()>max) {
				max=arrayList.get(i).getZong();
				
			}
		}
		System.out.println(max);
		}
		if(subject.equals("����")){
			for (int i = 0; i < arrayList.size(); i++) {
				max=arrayList.get(0).getYu();
				if (arrayList.get(i).getYu()>max) {
					max=arrayList.get(0).getYu();
				}
			}
			System.out.println(max);
		}
		if(subject.equals("��ѧ")){
			for (int i = 0; i < arrayList.size(); i++) {
				max=arrayList.get(0).getShu();
				if (arrayList.get(i).getShu()>max) {
					max=arrayList.get(0).getShu();
				}
			}
			System.out.println(max);
		}
		if(subject.equals("����")){
			for (int i = 0; i < arrayList.size(); i++) {
				max=arrayList.get(0).getWai();
				if (arrayList.get(i).getWai()>max) {
					max=arrayList.get(0).getWai();
				}
			}
			System.out.println(max);
		}
		
	}

}

package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;


public class CommodityService implements ICommodity {
	
	public void helpInfo() {
		System.out.println("----------��Ʒ������ϵͳ-----------");
		System.out.println("[1].������Ʒ,¼����Ʒ��Ϣ,������Add");
		
		System.out.println("[2].����,������Ʒ��ź�����,������Stock");
		
		System.out.println("[3].����,������Ʒ��ź�����,������Sell");
		
		System.out.println("[4].��ʾ������Ʒ��Ϣ(������Ʒ��š����ơ��۸�����),������Info");
		
		System.out.println("[5].�˳�ϵͳ��������Exit");
	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		
		String string = sc.next();
		String[] a = string.split(",");
		if (a.length!=4) {
			System.out.println("���������Ϣ����");
		} else {
			Commodity commodity = new Commodity(a[0], a[1], 
					Double.parseDouble(a[2]), Long.parseLong(a[3]));
			arrayList.add(commodity);
			System.out.println(commodity.toString());
		}
	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean isSucc=false;
		if (a.length!=2) {
			System.out.println("�������Ϣ���������޷�����");
		}else{
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					long newNumber=commodity.getNumber()+Long.parseLong(a[1]);
					System.out.println(newNumber);	
					System.out.println(commodity.toString());
					isSucc=true;
				}							
			}									
		}
		if (!isSucc) {
			System.out.println("����ʧ��");
		}
	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean isSucc=false;
		if (a.length!=2) {
			System.out.println("�������Ϣ���������޷�����");
		}else{
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					if (commodity.getNumber()>Long.parseLong(a[1])) {
						long newNumber=commodity.getNumber()-Long.parseLong(a[1]);
						System.out.println(newNumber);	
						System.out.println(commodity.toString());
						isSucc=true;
					}					
				}							
			}									
		}
		if (!isSucc) {
			System.out.println("����ʧ��");
		}
	}

	@Override
	public void infoCommodity(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity);
		}
	}

}

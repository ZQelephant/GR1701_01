package com.qhit.yc;

import java.util.ArrayList;
import java.util.Scanner;

public class Commodityservice implements ICommodity {

	@Override
	public void helpInfo() {
		System.out.println("---��Ʒ����ϵͳ---");
		System.out.println("��Ӱ�1");
		System.out.println("������2");
		System.out.println("���۰�3");
		System.out.println("��水4");
		System.out.println("�˳���5");

	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length!=4) {
			System.out.println("�������ֵ��������������");
		} else {
			Commodity commodity=new Commodity(a[0], a[1], Double.parseDouble(a[2]), Long.parseLong(a[3]));
          arrList.add(commodity);
          System.out.println(commodity.toString());
		}

	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean issucc=false;
		if (a.length!=2) {
			System.out.println("�������ֵ��������������");
		} else {
			for (Commodity commodity : arrList) {
				if (commodity.getId().equals(a[0])) {
		   long newNumber=commodity.getNumber()+Long.parseLong(a[1]);
		   commodity.setNumber(newNumber);
		   System.out.println(commodity.toString());
				issucc=true;	
				}
			}

		}if(!issucc){
			System.out.println("����");
		}

	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean issucc=false;
		if (a.length!=2) {
			System.out.println("�������ֵ��������������");
		} else {
			for (Commodity commodity : arrList) {
				if (commodity.getId().equals(a[0])) {
					if (commodity.getNumber()>Long.parseLong(a[1])) {
						long newNumber=commodity.getNumber()-Long.parseLong(a[1]);
						   commodity.setNumber(newNumber);
						   System.out.println(commodity.toString());
								issucc=true;
					}
		   	
				}
			}
			if(!issucc){
				System.out.println("����");
			}
		}


	}

	@Override
	public void InfoCommodity(ArrayList<Commodity> arrList) {
		for (Commodity commodity : arrList) {
			System.out.println(commodity.toString());
		}

	}

}

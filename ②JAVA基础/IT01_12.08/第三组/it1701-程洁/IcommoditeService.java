package com;

import java.util.ArrayList;
import java.util.Scanner;

public class IcommoditeService implements Icommodite{

	@Override
	public void helpInfo() {
		System.out.println("---����---");
		System.out.println("��Ӱ�1");
		System.out.println("������2");
		System.out.println("���۰�3");
		System.out.println("��水4");
		System.out.println("�˳���5");
		
		
		
		
	}

	@Override
	public void addCommodite(ArrayList<Commodite> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length!=4) {
			System.out.println("����");
		} else {
			Commodite commodite=new Commodite(a[0], a[1], Double.parseDouble(a[2]), Long.parseLong(a[3]));
			arrayList.add(commodite);
			System.out.println(commodite.toString());
		}
		
	}

	@Override
	public void stockCommodite(ArrayList<Commodite> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean isSuccess=false;
		if (a.length!=2) {
			System.out.println("����");
		} else {
			for (Commodite commodite : arrayList) {
			if (commodite.getId().equals(a[0])) {
				long newNum=commodite.getNumber()+Long.parseLong(a[1]);
				commodite.setNumber(newNum);
				System.out.println(commodite.toString());
				isSuccess=true;
			}
		}
			if (!isSuccess) {
				System.out.println("ʧ��");
			}
		}
		
	}

	@Override
	public void sellCommodite(ArrayList<Commodite> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean isSuccess=false;
		if (a.length!=2) {
			System.out.println("����");
		} else {
			for (Commodite commodite : arrayList) {
			if (commodite.getId().equals(a[0])) {
				if (commodite.getNumber()>=Long.parseLong(a[1])) {
					
				long newNum=commodite.getNumber()-Long.parseLong(a[1]);
				commodite.setNumber(newNum);
				System.out.println(commodite.toString());
				isSuccess=true;
				}
				
			}
		}
			if (!isSuccess) {
				System.out.println("ʧ��");
			}
		}
	}

	@Override
	public void InfoCommodite(ArrayList<Commodite> arrayList) {
		for (Commodite commodite : arrayList) {
			System.out.println(commodite);
		}
		
	}

}

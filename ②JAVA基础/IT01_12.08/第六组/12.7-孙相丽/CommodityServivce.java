package com.Commodity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CommodityServivce implements ICommodity {

	@Override
	public void helpinfo() {
		System.out.println("---��Ʒ����ϵͳ---");
		System.out.println("������Ʒ������Add");
		System.out.println("����������Sock");
		System.out.println("����������Sell");
		System.out.println("�˳�ϵͳ������Quit");
		System.out.println("��ѯ��Ʒ������info");
	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String s = sc.next();
		String[]  a = s.split(",");
		if (a.length!=4) {
			System.out.println("���������Ϣ���������޷�¼��");
		}else{
			Commodity commodity = new Commodity(a[0],a[1],a[2],a[3]);
			arrayList.add(commodity);
			System.out.println(commodity.toString());
		}
	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		System.out.println("��������Ҫ��������Ʒ���");
		String s = sc.next();
		boolean isid  = false;
		for (int i = 0; i < arrayList.size(); i++) {
			String e = arrayList.get(i).getNumber();
			if (s.equals(e)) {
				System.out.println("��������Ҫ����������");
				int k = sc.nextInt();
				System.out.println(arrayList.get(i).toString());
				isid = true;
			}
			}
		if (!isid) {
			System.out.println("����ʧ��");
		}
		
	}

		 
		 
	
	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		 String[] a= sc.next().split(",");

		 if (a.length !=2) {
			System.out.println("");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity .getId().equals(a[0])) {
					String newnumber = commodity.getNumber();
					commodity.getNumber();
					System.out.println(commodity.toString());
					
				}
			}
}
	}

	@Override
	public void infoCommodity(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
		}
	}

}

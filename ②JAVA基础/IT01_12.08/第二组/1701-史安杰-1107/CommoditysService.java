package com.saj;

import java.util.ArrayList;
import java.util.Scanner;

public class CommoditysService implements ICommoditys {

	@Override
	public void helpinfo() {
		// TODO Auto-generated method stub
		System.out.println("-----������ϵͳ-----");
		System.out.println("������Ʒ��������1");
		System.out.println("������������2");
		System.out.println("���ۣ�������3");
		System.out.println("�鿴��棬������4");
		System.out.println("�˳����ܣ�������5");

	}

	@Override
	public void addCommoditys(ArrayList<Commoditys> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String string = sc.next();
		String[] a = string.split(",");
		if (a.length != 4) {
			System.out.println("������ĸ�ʽ����ȷ������������");
		} else {
			Commoditys Commoditys = new Commoditys(a[0], a[1],
					Double.parseDouble(a[2]), Long.parseLong(a[3]));
			arrayList.add(Commoditys);
			System.out.println(Commoditys.toString());

		}

	}

	@Override
	public void stockcCommoditys(ArrayList<Commoditys> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String[] a = sc.next().split(",");
		boolean iss = false;
		if (a.length != 2) {
			System.out.print("������ĸ�ʽ����ȷ��û���ҵ�");
		} else {
			for (Commoditys commoditys : arrayList) {
				if (commoditys.getId().equals(a[0])) {
					long newcommoditys = commoditys.getNumber()
							+ Long.parseLong(a[1]);
					commoditys.setNumber(newcommoditys);
					System.out.println(commoditys.toString());
					iss = true;

				}
			}

		}
		if (!iss) {
			System.out.println("���ܽ���");
		}

	}

	@Override
	public void sellCommoditys(ArrayList<Commoditys> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String[] a = sc.next().split(",");
		boolean iss = false;
		if (a.length != 2) {
			System.out.println("������ĸ�ʽ����ȷ��û���ҵ�");
		} else {
			for (Commoditys commoditys : arrayList) {
				if (commoditys.getId().equals(a[0])) {
					if (commoditys.getNumber() > Long.parseLong(a[1])) {
						long newcommoditys = commoditys.getNumber()
								- Long.parseLong(a[1]);
						commoditys.setNumber(newcommoditys);
						System.out.println(commoditys.toString());
						iss = true;
					}

				}
			}

		}
		if (!iss) {
			System.out.println("���۲��ɹ�");
		}

	}

	@Override
	public void findcommoditys(ArrayList<Commoditys> arrayList) {
		// TODO Auto-generated method stub
		for (Commoditys commoditys : arrayList) {

			System.out.println(commoditys.toString());
		}

	}

}

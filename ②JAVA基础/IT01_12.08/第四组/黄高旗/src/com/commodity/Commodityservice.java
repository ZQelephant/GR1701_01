package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.function.IntConsumer;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

/**
 * @author ����: xuyunmeng
 * @date ����ʱ�䣺2017��12��7�� ����2:42:23
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Commodityservice implements ICommodity {

	@Override
	public void helpinfo() {

		System.out.println("----------��Ʒ������ϵͳ-----------");
		System.out.println("[1].������Ʒ,¼����Ʒ��Ϣ,������Add");
		System.out.println("[2].����,������Ʒ��ź�����,������Stock");
		System.out.println("[3].����,������Ʒ��ź�����,������Sell");
		System.out.println("[4].��ʾ������Ʒ��Ϣ(������Ʒ��š����ơ��۸�����),������Info");
		System.out.println("[5].�˳�ϵͳ��������Exit");
	}

	

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 4) {
			System.out.println();
		} else {
			Commodity commodity = new Commodity(a[0], a[2],
					Double.parseDouble(a[3]), Long.parseLong(a[4]));
				arrayList.add(commodity);
			System.out.println(commodity.toString());
		}

	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		// String[] a = s.split(",");

		for (Commodity commodity : arrayList) {

			if (commodity.getId().equals(a[0])) {
				long nubmer = commodity.getNubmer();
				long newnumber = commodity.getNubmer() + Long.parseLong(a[1]);
				System.out.println(newnumber);	
				System.out.println(commodity.toString());		

			}
		}
		

	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {

		String[] a = sc.next().split(",");
		for (Commodity commodity : arrayList) {

			if (commodity.getId().equals(a[0])) {
				long nubmer = commodity.getNubmer();
				long newnumber = commodity.getNubmer() - Long.parseLong(a[1]);
				System.out.println(newnumber);		
				System.out.println(commodity.toString());
			}
		}

	}
	

	@Override
	public void infoCommodity(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(arrayList.toString());
		}

	}

}

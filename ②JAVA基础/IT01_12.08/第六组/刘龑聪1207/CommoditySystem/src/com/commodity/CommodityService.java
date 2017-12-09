package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

/*Author��������
 E-mail��15539919713@163.com
 */
public class CommodityService implements ICommoditySystem {

	@Override
	public void helpInfo() {
		System.out.println("-----��Ʒ���������ϵͳ-----" + "\n    <1>������Ʒ������1"
				+ "\n    <2>������¼������2" + "\n    <3>���ۼ�¼������3" + "\n    <4>�鿴���������4"
				+ "\n    <5>�鿴����������5" + "\n    <6>�˳�ϵͳ������6");
	}

	@Override
	public void add(ArrayList<Commodity> arrayList, Scanner sc) {
		System.out.println("������Ҫ�½�����Ʒ��Ϣ!" + "\n��ʽ:���,����,�۸�,����   �м��Զ���   , ����!");
		boolean b = true;
		while (b) {
			String[] s = sc.next().split(",");
			if (s.length != 4) {
				System.out.println("�½�ʧ��,���ʵ��Ϣ����ʽ�Ƿ���ȷ,����������!");
			} else {
				arrayList.add(new Commodity(s[0], s[1], Double
						.parseDouble(s[2]), Long.parseLong(s[3])));
				System.out.println("�½��ɹ�!");
				b = false;
			}
		}
	}

	@Override
	public void stock(ArrayList<Commodity> arrayList, Scanner sc) {
		System.out.println("�����������Ϣ!" + "\n��ʽ:���,��������   �м��Զ���   , ����!");
		String[] s = sc.next().split(",");
		boolean b = true;
		if (s.length != 2) {
			System.out.println("����ʧ��,���ʵ��Ϣ����ʽ�Ƿ���ȷ!");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(s[0])) {
					commodity.setNum(commodity.getNum() + Long.parseLong(s[1]));
					System.out.println("�����ɹ�!");
					b = false;
				}
			}
			if (b) {
				System.out.println("δ�ҵ��ñ�ŵ���Ʒ,����ʧ��!");
			}
		}
	}

	@Override
	public void sell(ArrayList<Commodity> arrayList, Scanner sc) {
		System.out.println("�������ۻ���Ϣ!" + "\n��ʽ:���,�ۻ�����   �м��Զ���   , ����!");
		String[] s = sc.next().split(",");
		boolean b = true;
		if (s.length != 2) {
			System.out.println("����ʧ��,���ʵ��Ϣ����ʽ�Ƿ���ȷ!");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(s[0])) {
					if (commodity.getNum() >= Long.parseLong(s[1])) {
						commodity.setNum(commodity.getNum()
								- Long.parseLong(s[1]));
						System.out.println("�����ɹ�!");
						b = false;
					}
				}
			}
			if (b) {
				System.out.println("����ʧ��!");
			}
		}
	}

	@Override
	public void info(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
		}
	}

}

package com.saj;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Commoditys> arrayList = new ArrayList<Commoditys>();
		CommoditysService a = new CommoditysService();
		Scanner sc = new Scanner(System.in);
		a.helpinfo();
		boolean isa = true;
		int key;
		while (isa) {
			System.out.println("��������һ����������س���");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("��ʽ����ţ���Ʒ���ƣ��۸񣬿��");
				a.addCommoditys(arrayList, sc);
				break;

			case 2:
				System.out.println("��ʽ����ţ���������");
				a.stockcCommoditys(arrayList, sc);
				break;

			case 3:
				System.out.println("��ʽ����ţ���������");
				a.sellCommoditys(arrayList, sc);
				break;

			case 4:
				a.findcommoditys(arrayList);
				break;
			case 5:
				isa = false;
				break;
			default:
				System.out.println("ָ���������������");
				break;
			}
		}
		System.out.println("�ټ���ӭ�´�ʹ��");
	}

}

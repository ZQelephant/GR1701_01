package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Commodity> arrayList = new ArrayList<Commodity>();
		CommodityService commodityService = new CommodityService();
		int key;
		boolean isquit = true;
		commodityService.help();
		while (isquit) {
			System.out.println("������ָ��,�س���ִ��");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("��ʽ�����,��Ʒ����,�۸�,���");
				
				commodityService.addCommodity(arrayList, sc);
				break;
			case 2:
				System.out.println("��ʽ�����,��������");
				commodityService.stockCommodity(arrayList, sc);
				break;
			case 3:
				System.out.println("��ʽ�����,��������");
				commodityService.sellCommodity(arrayList, sc);
				break;
			case 4:
				commodityService.infoCommodity(arrayList);
				break;
			case 5:
				isquit = false;
				break;

			default:
				System.out.println("ָ�����, ��������");
				break;
			}
		}
		System.out.println("��ӭ�´�ʹ��");
	}
	
}

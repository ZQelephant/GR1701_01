package com.qhit.yc;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Commodityservice commodityservice=new Commodityservice();
		ArrayList<Commodity>arrayList=new ArrayList<Commodity>();
		Scanner sc=new Scanner(System.in);
		
		commodityservice.helpInfo();
		
		boolean isQuit=true;
		while (isQuit) {
			int a=sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("��������Ʒ��Ϣ����,����");
				Commodityservice.addCommodity
				
				break;

			default:
				break;
			}
		}
		
	}
}

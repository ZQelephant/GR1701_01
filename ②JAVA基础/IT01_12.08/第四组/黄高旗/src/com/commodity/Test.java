package com.commodity;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ����: xuyunmeng
 * @date    ����ʱ�䣺2017��12��7�� ����8:48:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
	ArrayList<Commodity> arrayList =new ArrayList<Commodity>();
		Commodityservice commodityservice = new Commodityservice();
		Scanner sc = new Scanner(System.in);	
		commodityservice.helpinfo();	
		boolean isQuit = true;
		String s ;
		while (isQuit) {
			s = sc.next();
			switch (s) {
			case "Add":
				System.out.println("¼����Ʒ��Ϣ������Ʒ��š����ơ��۸񡢳�ʼ����");
				commodityservice.addCommodity(arrayList, sc);
				break;
			case "Stock":
				commodityservice.stockCommodity(arrayList, sc);
				break;
			case "Sell":
				commodityservice.sellCommodity(arrayList, sc);
				break;
			case "Info":
				commodityservice.infoCommodity(arrayList);				
				break;
			case "Exit":
				isQuit = false;
				break;														
			default:
				break;
			}
			
		}
		System.out.println("�˳�ϵͳ");

		
	}
}

package machao;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Commodity>arrayList =new ArrayList<Commodity>();
		CommodityService s =new CommodityService();
		
		s.helpInfo();
		boolean isQuit = true;
		while (isQuit) {
			System.out.println("������ָ����س���!");
			String a =sc.next();
			
			int key=0;
			switch (key) {
			case 1:
				System.out.println("��ʽ����ţ���Ʒ���ƣ��۸񣬿��");
				s.addCommodity(arrayList, sc);
				break;

			case 2:
				System.out.println("��ʽ����ţ���������");
			    s.stockCommodity(arrayList, sc);
				break;

			case 3:
				System.out.println("��ʽ����ţ���������");
				s.sellCommodity(arrayList, sc);
				break;

			case 4:
				System.out.println("��ʽ����ţ���������");
				s.infoCommodity(arrayList);
				break;
			case 5:
				isQuit= false;
				break;
			default:
				System.out.println("�����������,����������!");
				break;
			}
		}
		System.out.println("�˳�ϵͳ,��ӭ�´�ʹ��");
	}	
}

package hufeilong;

import java.util.ArrayList;
import java.util.Scanner;


public class Text {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Commodity> arrayList = new ArrayList<Commodity>();
		CommodityService commodityService = new CommodityService();
		commodityService.helpInfo();
		int s = 0;
		boolean isquit = true;
		while (isquit) {
			 s = sc.nextInt();
			 switch (s) {
			case 1:
				System.out.println("��������Ҫ���ӵ���Ʒ�ı��,����,�۸�,����,����','����");
				commodityService.addCommodity(arrayList, sc);
				
				break;
			case 2:
				System.out.println("��������Ҫ��������Ʒ");
				commodityService.findCommodity(arrayList, sc);
				break;
			case 3:
				System.out.println("��������Ҫ���۵���Ʒ");
				commodityService.sellCommodity(arrayList, sc);
				break;
			case 4:
				commodityService.lookCommodity(arrayList);
				break;
			case 5:
				isquit = false;
				break;

			default:
				break;
			}
		}System.out.println("�ݰ�");
	}

}

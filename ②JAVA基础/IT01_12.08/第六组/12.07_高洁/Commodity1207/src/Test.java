import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		CommodityService commodityService = new CommodityService();

		ArrayList<Commodity> arrayList = new ArrayList<Commodity>();

		Scanner sc = new Scanner(System.in);

		commodityService.info();

		boolean b = true;
		while (b) {
			int a1 = sc.nextInt();
			switch (a1) {
			case 1:
				System.out.println("��������Ʒ��Ϣ  ��,�Ÿ���");
				commodityService.addCommodity(arrayList, sc);
				break;
			case 2:
				System.out.println("��������Ʒ��ź�����  ��,�Ÿ���");
				commodityService.stockCommodity(arrayList, sc);
				break;
			case 3:
				System.out.println("��������Ʒ��ź�����  ��,�Ÿ���");
				commodityService.marketCommodity(arrayList, sc);
				break;
			case 4:
				commodityService.infoCommodity(arrayList);
				break;
			case 5:
				b = false;
				break;

			default:
				System.out.println("��������");
				break;
			}
		}
		System.out.println("�ټ�");
	}

}

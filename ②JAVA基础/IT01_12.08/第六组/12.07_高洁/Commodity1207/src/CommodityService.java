import java.util.ArrayList;
import java.util.Scanner;

public class CommodityService implements ICommodity {

	@Override
	public void info() {
		System.out.println("����������Ʒϵͳ��������");
		System.out.println("¼����Ʒ��Ϣ�����룺1");
		System.out.println("���������룺2");
		System.out.println("���������룺3");
		System.out.println("�ο���������룺4");
		System.out.println("�˳������룺5");

	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String string = sc.next();

		String[] a = string.split(",");
		if (a.length != 4) {
			System.out.println("�������");
		} else {
			Commodity commodity = new Commodity(a[0], a[1],
					Double.parseDouble(a[2]), Integer.parseInt(a[3]));
			arrayList.add(commodity);
			System.out.println(commodity.toString());
		}

	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] strings = sc.next().split(",");
		boolean b = true;
		if (strings.length != 2) {
			System.out.println("��������");
		} else {
			for (Commodity commodity : arrayList) {

				if (commodity.getId().equals(strings[0])) {
					System.out.println("1");
					int quantity = commodity.getQuantity()
							+ Integer.parseInt(strings[1]);
					commodity.setQuantity(quantity);
					System.out.println(commodity.toString());
					b = false;
				}
			}
			if (b == true) {
				System.out.println("����ʧ��");
			}
		}

	}

	@Override
	public void marketCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] strings = sc.next().split(",");
		boolean b = true;
		if (strings.length != 2) {
			System.out.println("��������");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(strings[0])) {

					if (commodity.getQuantity() >= Integer.parseInt(strings[1])) {
						int quantity = commodity.getQuantity()
								- Integer.parseInt(strings[1]);
						commodity.setQuantity(quantity);
						System.out.println(commodity.toString());
						b = false;
					}

				}
			}
			if (b == true) {
				System.out.println("����ʧ��");
			}
		}
	}

	@Override
	public void infoCommodity(ArrayList<Commodity> arrayList) {
		for (Commodity commodity : arrayList) {
			System.out.println(commodity.toString());
		}

	}

}

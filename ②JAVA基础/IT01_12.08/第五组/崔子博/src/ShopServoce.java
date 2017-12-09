import java.util.ArrayList;
import java.util.Scanner;

public class ShopServoce implements Ishop {

	@Override
	public void helpinfo() {
		// TODO Auto-generated method stub
		System.out.println("-----������ϵͳ-----");
		System.out.println("������Ʒ��������1");
		System.out.println("������������2");
		System.out.println("���ۣ�������3");
		System.out.println("�鿴��棬������4");
		System.out.println("�˳����ܣ�������5");


	}

	@Override
	public void addShop(ArrayList<Shop> arrayList, Scanner sc) {
		// TODO Auto-generated method stub

		String s = sc.nextLine();
		String[] a = s.split(s);
		if (a.length !=3) {
			System.out.println("���������Ϣ����ȷ������������");
		} else {
			Shop shop = new Shop(a[0], a[1], Double.parseDouble(a[2]),
					Long.parseLong(a[3]));
			arrayList.add(shop);
			System.out.println(shop.toString());

		}

	}

	@Override
	public void stockshop(ArrayList<Shop> arrayList, Scanner sc) {
		// TODO Auto-generated method stub

		String[] a = sc.nextLine().split(",");
		boolean is = false;
		if (a.length != 2) {
			System.out.println("���������Ϣ����ȷ������������");
		} else {
			for (Shop shop : arrayList) {
				if (shop.getId().equals(a[0])) {
					long number = shop.getNumber();
					long newnumber = number + Long.parseLong(a[1]);
					shop.setNumber(newnumber);
					System.out.println(shop.toString());
					is = true;
				}
			}
		}
		if (!is) {
			System.out.println("����ʧ��");
		}
	}

	@Override
	public void sellshop(ArrayList<Shop> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String[] a = sc.nextLine().split(",");
		boolean is = false;
		if (a.length != 2) {
			System.out.println("�ۻ�ʧ�ܣ�����������");
		} else {
			for (Shop shop : arrayList) {
				if (shop.getId().equals(a[0])) {
					if (shop.getNumber() > Long.parseLong(a[1])) {
						long newnumber = shop.getNumber()
								- Long.parseLong(a[1]);
						shop.setNumber(newnumber);

						System.out.println(shop.toString());
						is = true;
					}
				}
			}

		}
		if (!is) {
			System.out.println("����ʧ��");
		}

	}

	@Override
	public void infoshop(ArrayList<Shop> arrayList) {
		// TODO Auto-generated method stub

		for (Shop shop : arrayList) {
			System.out.println(shop.toString());
		}

	}

}

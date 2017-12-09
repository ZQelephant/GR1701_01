package machao;

import java.util.ArrayList;
import java.util.Scanner;

public class CommodityService implements ICommodity {

	@Override
	public void helpInfo() {
		System.out.println("-----��ӭʹ�ý�����ϵͳ-----");
		System.out.println("[1]������Ʒ������1");
		System.out.println("[2]������¼������2");
		System.out.println("[3]���ۼ�¼������3");
		System.out.println("[4]�鿴���������4");
		System.out.println("[5]�˳�ϵͳ������5");
		
	}

	@Override
	public void addCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String string = sc.next();
		String[] s = string.split(",");
		if (s.length != 5) {
			System.out.println("���������Ϣ����,�޷�¼��");
		} else {
			Commodity commodity = new Commodity(s[0], s[1],
					Double.parseDouble(s[2]), Long.parseLong(s[3]));

		}

	}

	@Override
	public void stockCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean isSucc = false;
		if (a.length != 2) {
			System.out.println("���������Ϣ����,�޷�����!");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					long newNumber = commodity.getNumber()
							+ Long.parseLong(a[1]);
					commodity.setNumber(newNumber);
					System.out.println(commodity.toString());
					isSucc = true;
				}
			}
			if (!isSucc) {
				System.out.println("����ʧ��!");

			}
		}
	}

	@Override
	public void sellCommodity(ArrayList<Commodity> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		boolean isSucc = false;
		if (a.length != 2) {
			System.out.println("���������Ϣ����,�޷�����!");
		} else {
			for (Commodity commodity : arrayList) {
				if (commodity.getId().equals(a[0])) {
					if (commodity.getNumber() > Long.parseLong(a[1])) {
						long newNumber = commodity.getNumber()
								- Long.parseLong(a[1]);
						commodity.setNumber(newNumber);
						System.out.println(commodity.toString());
						isSucc = true;
					}
				}
				if (!isSucc) {
					System.out.println("����ʧ��!");
				}
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

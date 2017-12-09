package shangpin;

import java.util.ArrayList;
import java.util.Scanner;

public class ShangPinScore implements IShangPin {

	//private static final Object shangpin = null;

	@Override
	public void helpInfo() {
		// TODO Auto-generated method stub

		System.out.println("����");
		System.out.println("��1������");
		System.out.println("��2������");
		System.out.println("��3������");
		System.out.println("��4����ѯ");
		System.out.println("��5���˳�ϵͳ");
		

	}

	@Override
	public void addShangPin(ArrayList<ShangPin> arrayList, Scanner sc) {
		// TODO Auto-generated method stubs
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 4) {
			System.out.println("������Ĳ���ȷ���޷���¼");

		} else {
			ShangPin shangPin = new ShangPin(a[0], a[1], Long.parseLong(a[2]),
					Long.parseLong(a[3]));
			arrayList.add(shangPin);
			System.out.println(shangPin.toString());

		}

	}

	@Override
	public void stockShangPin(ArrayList<ShangPin> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String[] a = sc.next().split(",");
		boolean isSuscc = false;
		if (a.length != 2) {
			System.out.println("������Ĳ���ȷ���޷���¼");

		} else {
			for (ShangPin shangpin : arrayList) {
				if (shangpin.getId().equals(a[0])) {
					long shuliang = shangpin.getShuliang();
					long newShuLiang = shuliang + Long.parseLong(a[1]);
					shangpin.setShuliang(newShuLiang);
					System.out.println(shangpin.toString());
					isSuscc = true;

				}

			}

		}
		if (!isSuscc) {
			System.out.println("����ʧ��");

		}

	}

	@Override
	public void sellShangPin(ArrayList<ShangPin> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String[] a = sc.next().split(",");
		boolean isSuscc = false;
		if (a.length != 2) {
			System.out.println("������Ĳ���ȷ���޷���¼");

		} else {
			for (ShangPin shangpin : arrayList) {
				if (shangpin.getShuliang() > Long.parseLong(a[1])) {
					long newShuLiang = shangpin.getShuliang()
							- Long.parseLong(a[1]);
					shangpin.setShuliang(newShuLiang);
					System.out.println(shangpin.toString());
					isSuscc = true;


				}
			}
		}
		if ( ! isSuscc) {
			System.out.println("����ʧ��");
			
			
		}

	}

	@Override
	public void infoShangPin(ArrayList<ShangPin> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		for (ShangPin shangPin : arrayList) {
			System.out.println(shangPin.toString());
		}

	}

	public static void main(String[] args) {
		System.out.println("�������Ʒ��Ϣ����ʽΪ��001��xx��0000��xxxx��");
	}

}

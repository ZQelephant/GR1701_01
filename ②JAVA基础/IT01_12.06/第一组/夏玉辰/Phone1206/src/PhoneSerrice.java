import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;


public class PhoneSerrice implements IPhone {

	@Override
	public void info() {
		System.out.println("��������ͨѶ¼ϵͳ��������");
		System.out.println("�½���ϵ�������룺1");
		System.out.println("�鿴������ϵ�������룺2");
		System.out.println("ͨ���Ա������ϵ�������룺3");
		System.out.println("ͨ������������ϵ�������룺4");
		System.out.println("ͨ�����������ϵ�������룺5");
		System.out.println("�˳������룺6");

	}

	@Override
	public void addPhone(ArrayList<Phone> arrayList, Scanner sc) {
		System.out.println("������      ��,�Ÿ���");
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length == 3) {
			Phone phone = new Phone(a[0], a[1], a[2]);
			arrayList.add(phone);
			System.out.println(phone.toString());
			System.out.println("��ӳɹ�");

		} else {
			System.out.println("��������");
		}

	}

	@Override
	public void infoPhone(ArrayList<Phone> arrayList) {

		for (Phone phone : arrayList) {

			System.out.println(phone.toString());

		}

	}

	@Override
	public ArrayList<Phone> findsex(ArrayList<Phone> arrayList) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Phone> arrayList2 = new ArrayList<Phone>();
		System.out.println("�������Ա�");
		boolean b = true;
		String sex = sc.next();
		for (Phone phone : arrayList) {
			String sex2 = phone.getSex();
			if (sex.equals(sex2)) {
				arrayList2.add(phone);
				System.out.println(phone.toString());

				b = false;

			}
		}

		if (b == true) {

			System.out.println("û�ҵ�");

		} else {
			System.out.println("Ϊ���ҵ�");
		}

		return arrayList2;
	}

	@Override
	public Phone findname(ArrayList<Phone> arrayList) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Phone> arrayList2 = new ArrayList<Phone>();
		System.out.println("������������");
		String name = sc.next();
		boolean b = true;
		for (Phone phone : arrayList) {
			String name2 = phone.getName();
			if (name.equals(name2)) {
				arrayList2.add(phone);
				System.out.println(arrayList2.toString());
				System.out.println("Ϊ���ҵ�");
				b = false;
				break;
			}

		}
		if (b) {

			System.out.println("û�ҵ�");

		}

		return null;

	}

	@Override
	public Phone findphoneNumber(ArrayList<Phone> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������绰����");
		String p = sc.next();
		boolean b = true;
		for (int i = 0; i < arrayList.size(); i++) {
			String phoneNumber = arrayList.get(i).getPhoneNumber();
			if (p.equals(phoneNumber)) {
				System.out.println(arrayList.get(i).toString());
				System.out.println("Ϊ���ҵ�");
				b = false;
				break;
			}

		}
		if (b) {

			System.out.println("û�ҵ�");

		}

		return null;
	}

}

package com.bean;

import java.util.ArrayList;

import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting;

public class SF implements Iscor {
	public void caidan() {
		System.out.println("���˵�����");
		System.out.println("[1]����ɼ�");
		System.out.println("[2]��ѯ");
		System.out.println("[3]��ѯ");
		System.out.println("[4]");
		System.out.println("[5]�˳��밴5");

	}

	public void zcaidan() {
		System.out.println("�Ӳ˵�����");
		System.out.println("[1]��ѯ�ܷ���߷��밴1");
		System.out.println("[2]��ѯ��ѧ��߷��밴2");
		System.out.println("[3]��ѯ������߷��밴3");
		System.out.println("[4]��ѯӢ����߷��밴4");
		System.out.println("[5]�˳��밴5");
	}

	@Override
	public void addF(ArrayList<F> ArrayList, F sc) {
		// ����
		String s = sc.next();
		String[] a = s.split(",");
		F f = new F();
		f.setName(a[0]);
		f.setNumber(a[1]);
		f.setMathematical(Double.parseDouble(a[2]));
		f.setLanguage(Double.parseDouble(a[3]));
		f.setEnglishperformance(Double.parseDouble(a[4]));
		ArrayList.add(f);
	}

	@Override
	public void infoF(ArrayList<F> ArrayList) {
		// ����
		for (int i = 0; i < ArrayList.size(); i++) {
			F f = ArrayList.get(i);
			String string = f.toString();
			System.out.println(string);
		}

	}

	public double getF(ArrayList<F> ArrayList, Setting equals) {

		// ����

		for (int i = 0; i < ArrayList.size(); i++) {
			double max1 = ArrayList.get(i).getTotalpoints();
			if (ArrayList.get(i).getTotalpoints() > max1) {
				max1 = ArrayList.get(i).getTotalpoints();

			}
			System.out.println(max1);
		}
		return 0;
	}

	@Override
	public double getF(ArrayList<F> ArrayList, String subject) {
		// TODO Auto-generated method stub
		return 0;
	}

}

package com.examination;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreService implements IScore {

	void help() {
     System.out.println("�߿��ɼ�����ϵͳ");
     System.out.println("[1] ¼��ɼ�����  1");
     System.out.println("[2] ��ʾ�ɼ�����  2");
     System.out.println("[3] ��ѯ�ɼ�����  3");
     System.out.println("[4] �˳�ϵͳ����  4");
	}

	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		String[] a = sc.next().split(",");
		int t = a.length;
		if (t != 5) {
			System.out.println("������Ŀ�����Ϣ���������ߴ��� , �޷�����¼�����");
		} else {
			Student s = new Student();
			s.setName(a[0]);
			s.setId(a[1]);
			s.setMathscore(Double.parseDouble(a[2]));
			s.setChinesescore(Double.parseDouble(a[3]));
			s.setEnglishscore(Double.parseDouble(a[4]));
			arrayList.add(s);
		}

	}
	
	void helpSub(){
		System.out.println("�ɼ���ѯ");
		System.out.println("[1] ��߷�����           1");
		System.out.println("[2] ��ѧ��߷�����    2");
		System.out.println("[3] ������߷�����    3");
		System.out.println("[4] Ӣ����߷�����    4");
		System.out.println("[5] �������˵�����    5");
	}
	@Override
	public void infoStudent(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}
		/*
		 * for (int i = 0; i < arrayList.size(); i++) { Student s =
		 * arrayList.get(i); String string = s.toString();
		 * System.out.println(string); }
		 */
	}

	@Override
	public double max(ArrayList<Student> arrayList, String subject) {
		double max=0;
		return max(arrayList, subject, max);
	}

	private double max(ArrayList<Student> arrayList, String subject, double max) {
		if (null == subject) {
			return max;
		} else {

		}
		if (subject.equals("�ܳɼ�")) {
			max = arrayList.get(0).getTotalscore();
			for (int i = 1; i < arrayList.size(); i++) {
				double a = arrayList.get(i).getTotalscore();
				if (a > max) {
					max = a;
				}
			}

		}
		if (subject.equals("��ѧ")) {
			max = arrayList.get(0).getMathscore();
			for (int i = 1; i < arrayList.size(); i++) {
				double a = arrayList.get(i).getMathscore();
				if (a > max) {
					max = a;
				}
			}
		}
		if (subject.equals("����")) {
			max = arrayList.get(0).getChinesescore();
			for (int i = 1; i < arrayList.size(); i++) {
				double a = arrayList.get(i).getChinesescore();
				if (a > max) {
					max = a;
				}
			}
		}
		if (subject.equals("Ӣ��")) {
			max = arrayList.get(0).getEnglishscore();
			for (int i = 1; i < arrayList.size(); i++) {
				double a = arrayList.get(i).getEnglishscore();
				if (a > max) {
					max = a;
				}
			}
		}
		return max;
	}
}

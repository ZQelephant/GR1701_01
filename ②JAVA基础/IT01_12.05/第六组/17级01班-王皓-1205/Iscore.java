package com.wh;

import java.util.ArrayList;
import java.util.Scanner;

public class Iscore implements Interfaces {
	
	void helpsubinfo(){
		System.out.println("------��߷�����ϵͳ------");
		System.out.println("�ܳɼ���߷֣�������1");
		System.out.println("��ѧ�ɼ���߷֣�������2");
		System.out.println("Ӣ��ɼ���߷֣�������3");
		System.out.println("���ĳɼ���߷֣�������4");
		System.out.println("�������˵���������5");
	}
	void helpinfo(){
		System.out.println("-----�߿�����ϵͳ-----");
		System.out.println("¼��ɼ���������1");
		System.out.println("��ѯ�ɼ���������2");
		System.out.println("��ѯ��߷֣�������3");
		System.out.println("�˳�ϵͳ��������4");
	}

	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String s = sc.next();
		String[] a = s.split(",");
		int legth = a.length;
		if (legth != 5) {
			System.out.println("���������Ϣ����ȷ���ǲ�����������������");
		} else {
			Student student = new Student();
			student.setName(a[0]);
			student.setId(a[1]);
			student.setMathscore(Double.parseDouble(a[2]));
			student.setEnglishscore(Double.parseDouble(a[3]));
			student.setLanguagescore(Double.parseDouble(a[4]));

			arrayList.add(student);
			System.out.println(student.toString());

		}
	}

	@Override
	public void infoStudent(ArrayList<Student> arrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			String string = student.toString();
			System.out.println(string);

		}

	}

	@Override
	public double getMax(ArrayList<Student> arrayList, String subject) {
		// TODO Auto-generated method stub
		double max = 0;
		if (subject.equals("�ܳɼ�")) {
			max = arrayList.get(0).getAlwaysscore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getAlwaysscore() > max) {
					max = arrayList.get(i).getAlwaysscore();
				}
			}
		}

		if (subject.equals("����")) {
			max = arrayList.get(0).getLanguagescore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getLanguagescore() > max) {
					max = arrayList.get(i).getLanguagescore();
				}
			}
		}

		if (subject.equals("��ѧ")) {
			max = arrayList.get(0).getMathscore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathscore() > max) {
					max = arrayList.get(i).getMathscore();
				}
			}
		}

		if (subject.equals("Ӣ��")) {
			max = arrayList.get(0).getEnglishscore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglishscore() > max) {
					max = arrayList.get(i).getEnglishscore();
				}
			}
		}
		System.out.println(max);
		return max;
	}

}

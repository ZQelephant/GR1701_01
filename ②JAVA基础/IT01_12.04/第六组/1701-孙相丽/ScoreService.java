package com.exam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreService implements IScore {
	void helpSubInfo(){
		System.out.println("��߷ֲ�ѯϵͳ");
		System.out.println("[1]�ܳɼ���߷�������1");
		System.out.println("[2]���ĳɼ���߷�2");
		System.out.println("[3]��ѧ�ɼ���߷�3");
		System.out.println("[4]Ӣ��ɼ���߷�4");
		System.out.println("[5]������������5");
	}
	void helpInfo(){
		System.out.println("�߿�����ϵͳ");
		System.out.println("[1]¼��ɼ�������1");
		System.out.println("[2]��ѯ�ɼ�������2");
		System.out.println("[3]��ѯ��߷�������3");
		System.out.println("[4]�˳�ϵͳ������4");
	}

	
	
	
	
	@Override
	public void addStudent(ArrayList<Student> arraylist, Scanner sc) {
		// ����һ��������Ϣ
		// 1.�Ӽ��̽���һ���ַ���
		String s = sc.next();
		// 2. ����ַ����õ�Student�ĳ�Ա������Ϣ
		String[] a = s.split(",");
		int length = a.length;
		if (length != 5) {
			System.out.println("������Ŀ�����Ϣ���������޷�����");
		} else {
			// 3. ʵ�������߹���һ������
			Student student = new Student();
			// 4.������Ĺ���Ŀ���������Ϣ
			student.setName(a[0]);
			student.setId(a[1]);
			student.setChineseScore(Double.parseDouble(a[2]));
			student.setMathScore(Double.parseDouble(a[3]));
			student.setEnglishScore(Double.parseDouble(a[4]));
			// 5. ���ӿ�����Ϣ
			arraylist.add(student);
			//6�����¼�����Ϣ
			System.out.println(student.toString());
            
		}
	}

	// ��ʽ����
	@Override
	public void infoStudent(ArrayList<Student> arraylist) {

		// ����
		//ˢ�¼�¼
		for (int i = 0; i < arraylist.size(); i++) {
			// ͨ���±���һ��ѧ��
			Student student = arraylist.get(i);
			String string = student.toString();
			System.out.println(string);
		}

	}

	@Override
	public double getMax(ArrayList<Student> arraylist, String subject) {
		double max = 0;
		if (subject.equals("�ܳɼ�")) {
			max = arraylist.get(0).getTotleScore();
			for (int i = 0; i < arraylist.size(); i++) {
				if (arraylist.get(i).getTotleScore() > max) {
					max = arraylist.get(i).getTotleScore();
				}

			}
		}
		if (subject.equals("��ѧ")) {
			max = arraylist.get(0).getMathScore();
			for (int i = 0; i < arraylist.size(); i++) {
				if (arraylist.get(i).getMathScore() > max) {
					max = arraylist.get(i).getMathScore();
				}

			}
		}
		if (subject.equals("����")) {
			max = arraylist.get(0).getChineseScore();
			for (int i = 0; i < arraylist.size(); i++) {
				if (arraylist.get(i).getChineseScore() > max) {
					max = arraylist.get(i).getChineseScore();
				}

			}
		}
		if (subject.equals("Ӣ��")) {
			max = arraylist.get(0).getEnglishScore();
			for (int i = 0; i < arraylist.size(); i++) {
				if (arraylist.get(i).getEnglishScore() > max) {
					max = arraylist.get(i).getEnglishScore();
				}

			}
		}
		System.out.println(max);
		return max;
	}

}

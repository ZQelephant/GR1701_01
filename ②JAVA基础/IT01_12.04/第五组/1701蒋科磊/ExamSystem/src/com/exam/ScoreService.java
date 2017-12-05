package com.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreService implements IScore {
	void helpsubInfo(){
		System.out.println("��߷ֲ�ѯϵͳ");
		System.out.println("[1]�ܳɼ���߷�������1");
		System.out.println("[2]���ĳɼ���߷�������2");
		System.out.println("[3]��ѧ�ɼ���߷�������3");
		System.out.println("[4]Ӣ��ɼ���߷�������4");
		System.out.println("[5]�������˵��밴5");
	}
	void helpInfo(){
		System.out.println("�߿�����ϵͳ");
		System.out.println("[1]¼��ɼ�������1");
		System.out.println("[2]��ѯ�ɼ�������2");
		System.out.println("[3]��ѯ��߷�������3");
		System.out.println("[4]�˳�ϵͳ�밴4");
		
	}

	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		String s=sc.next();
		String[]a=s.split(",");
		int length=a.length;
		if (length!=5) {
			System.out.println("���������Ϣ���������������������");
		} else {

		Student student =new Student();
		student.setName(a[0]);
		student.setId(a[1]);
		student.setMathScore(Double.parseDouble(a[2]));
		student.setCheseScore(Double.parseDouble(a[3]));
		student.setEnglishScore(Double.parseDouble(a[4]));

		arrayList.add(student);
		}
	}

	@Override
	public void infoStudent(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			String string = student.toString();
		}

	}

	@Override
	public double getMax(ArrayList<Student> arrayList,String subject) {
		double max=0;
		if(subject.equals("�ܳɼ�")){
			max=arrayList.get(0).getSumScore();
			for (int i = 1; i < arrayList.size(); i++) {
				if(arrayList.get(i).getSumScore()>max){
					max=arrayList.get(i).getSumScore();
				}
			}
		}
		if(subject.equals("����")){
			max=arrayList.get(0).getCheseScore();
			for (int i = 1; i < arrayList.size(); i++) {
				if(arrayList.get(i).getCheseScore()>max){
					max=arrayList.get(i).getCheseScore();
				}
			}
		}
		
		return max;
	}

	public void helpSubInfo() {
		// TODO Auto-generated method stub
		
	}

}

package com;

import java.util.ArrayList;
import java.util.Scanner;

import javax.security.auth.Subject;

public class ScoreService implements Score {
	void subHelp(){
	System.out.println(",,�Ӳ˵�����,,");	
	System.out.println("�ܷ�1");
	System.out.println("��ѧ2");
	System.out.println("����3");
	System.out.println("Ӣ��4");
	System.out.println("�����˵�5");
	}
	void help(){
		System.out.println("����");
		System.out.println("¼��ɼ���1");
		System.out.println("��ʾ��2");
		System.out.println("��߷ְ�3");
		System.out.println("�˳���4");
	}

	@Override
	public void addStudent(ArrayList<Student> arraylist, Scanner sc) {
		String s=sc.next();
		String[]a=s.split(",");
		
	Student student=new Student();
	int length=a.length;
	if (a.length!=5) {
		System.out.println("����Ҫ��,����");
	}else{
	student.setName(a[0]);
    student.setId(a[1]);
    student.setChinase(Double.parseDouble(a[2]));
    student.setMath(Double.parseDouble(a[3]));
    student.setEnglish(Double.parseDouble(a[4]));
    arraylist.add(student);}
	}

	@Override
	public void info(ArrayList<Student> arraylist) {
		for (int i = 0; i <arraylist.size(); i++) {
			Student student = arraylist.get(i);
	             String string = student.toString();
	             System.out.println(string);
		}

	}

	@Override
	public double getMax(ArrayList<Student> arraylist, String subject) {
	double max=0;
	if (subject.equals("�ܷ�")) {
		
	
	max=arraylist.get(0).getTotal();
	for (int i = 0; i <arraylist.size(); i++) {
		
		if (arraylist.get(i).getTotal()>max) {
			max=arraylist.get(i).getTotal();
			
		}
	}
	}if (subject.equals("��ѧ")) {
		
	
	max=arraylist.get(0).getMath();
	for (int i = 0; i <arraylist.size(); i++) {
		
		if (arraylist.get(i).getMath()>max) {
			max=arraylist.get(i).getMath();
			
		}
	}
	}if (subject.equals("����")) {
		
	
	max=arraylist.get(0).getChinase();
	for (int i = 0; i <arraylist.size(); i++) {
		
		if (arraylist.get(i).getChinase()>max) {
			max=arraylist.get(i).getChinase();
			
		}
	}
	}if (subject.equals("Ӣ��")) {
		
	
	max=arraylist.get(0).getEnglish();
	for (int i = 0; i <arraylist.size(); i++) {
		
		if (arraylist.get(i).getEnglish()>max) {
			max=arraylist.get(i).getEnglish();
			
		}
	}
	}System.out.println(max);
	
	return max;
	}

}

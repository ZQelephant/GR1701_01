package zhangqing;

import java.util.ArrayList;
import java.util.Scanner;

public class Array implements Iarry {
	void Help(){
		System.out.println("-----HELP-----");
		System.out.println("��1������߷�������1");
		System.out.println("��2������ѧ��߷�������2");
		System.out.println("��3����������߷�������3");
		System.out.println("��4����Ӣ����߷�������4");
		System.out.println("��5���˳��Ӳ˵�������5");
	}
	void help(){
		System.out.println("-----HELP-----");
		System.out.println("(1)��ѯ������Ϣ������1");
		System.out.println("(2)��ӡ������Ϣ������2");
		System.out.println("(3)�����Ӳ˵�������3");
		System.out.println("(4)�˳�������4");
	}

	@Override
	public void addStudend(ArrayList<Student> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		int length = a.length;
		if (a.length != 5) {
			System.out.println("���������Ϣ��������������������Ϣ");
		} else {
			Student student = new Student();
			student.setName(a[0]);
			student.setId(a[1]);
			student.setMath(Double.parseDouble(a[2]));
			student.setChinese(Double.parseDouble(a[3]));
			student.setEnglish(Double.parseDouble(a[4]));

			arrayList.add(student);
			System.out.println(student.toString());
		}
	}

	@Override
	public void allStudent(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			String string = student.toString();
			System.out.println(string);
		}

	}

	@Override
	public double getmax(ArrayList<Student> arrayList, String subject) {
		double max = 0;
		if (subject.equals("�ܳɼ�")) {
			max=arrayList.get(0).getSum();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getSum() > max) {
					max = arrayList.get(i).getSum();
				}
			}

		}if (subject.equals("��ѧ")){
			max=arrayList.get(0).getMath();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMath() > max) {
					max = arrayList.get(i).getMath();
				}
			}
		
	}
		if (subject.equals("����")){
			max=arrayList.get(0).getChinese();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChinese() > max) {
					max = arrayList.get(i).getChinese();
				}
			}
		
	}
		if (subject.equals("Ӣ��")){
			max=arrayList.get(0).getEnglish();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglish() > max) {
					max = arrayList.get(i).getEnglish();
				}
			}
		
	}
		System.out.println(max);
		return max;

}}

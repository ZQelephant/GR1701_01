package machao;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreService implements Iscore {

	public void helpinfo(){
			System.out.println("-----��ӭʹ�ø߿���������ģ��ϵͳ-----");
			System.out.println("[1]¼�뿼����Ϣ������1");
			System.out.println("[2]��ʾ������Ϣ������2");
			System.out.println("[3]������߷ֲ�ѯϵͳ������3");
			System.out.println("[4]�˳�ϵͳ������4");
		}
		public void helpsubinfo(){
			System.out.println("-----��ӭʹ����߷ַ�����ѯϵͳ-----");
			System.out.println("[1]��ӡ�ܷ���߷�");
			System.out.println("[2]��ӡ������߷�");
			System.out.println("[3]��ӡ��ѧ��߷�");
			System.out.println("[4]��ӡӢ����߷�");
			System.out.println("[5]��������һ��������5");
		}
		public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
			String s = sc.next();

			String[] a = s.split(",");
			if (a.length != 5) {
				System.out.println("��������������������룡");
			} else {
				Student student = new Student();
				student.setName(a[0]);
				student.setId(a[1]);
				student.setChineseScore(Double.parseDouble(a[2]));
				student.setMathScore(Double.parseDouble(a[3]));
				student.setEnglishScore(Double.parseDouble(a[4]));
				arrayList.add(student);

			}

		}
		
	

	@Override
	public void infostudent(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			String string = student.toString();
			System.out.println(string);
		}

	}

		
	

	@Override
	public double getMax(ArrayList<Student> arrayList, String Subject) {
		double Max = 0;
		if (Subject.equals("�ܳɼ�")) {
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTotleScore() > Max) {
					Max = arrayList.get(i).getTotleScore();
				}
			}
			if (Subject.equals("���ĳɼ�")) {
			}
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChineseScore() > Max) {
					Max = arrayList.get(i).getChineseScore();
				}
			}
			if (Subject.equals("��ѧ�ɼ�")) {
			}
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathScore() > Max) {
					Max = arrayList.get(i).getMathScore();
				}
			}
			if (Subject.equals("���ĳɼ�")) {
			}
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglishScore() > Max) {
					Max = arrayList.get(i).getEnglishScore();
				}
			}
		}

		return Max;
		
	}

}

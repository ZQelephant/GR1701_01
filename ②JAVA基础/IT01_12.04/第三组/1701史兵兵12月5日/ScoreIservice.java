package xcs;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreIservice implements ISore {
	void helpsubinfo(){
		System.out.println("��߷ֲ�ѯϵͳ");
		System.out.println("[1]�ܳɼ���߷�������1");
		System.out.println("[2]���ĳɼ���߷�2");
		System.out.println("[3]��ѧ�ɼ���߷�3");
		System.out.println("[4]Ӣ��ɼ���߷�4");
		System.out.println("[5]����ֵ������5");
		
		
	}
	void helpInfo(){
		System.out.println("�߿�����ϵͳ");
		System.out.println("[1]¼��ɼ�������1");
		System.out.println("[2]��ѯ�ɼ�������2");
		System.out.println("[3]��ѯ��߷�������3");
		System.out.println("[4]�˳�ϵͳ������4");
		
	}
	
	
	
	
	
	
	
	
	
	//ʵ����

	public void Student(ArrayList<xcs.Student> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		//���ӿ�����Ϣ
		String s=sc.next();
		//����ַ���
		String [] a=s.split(",");
		//ʵ�������߹���һ������
		int length=a.length;
		if (length !=5){
			System.out.println("���������Ϣ����������ȷ���޷�����");
		}else{Student student =new Student ();
		//�����湹��Ŀ���������Ϣ
		student.setName(a[0]);
		student.setId(a[1]);
		student.setShuxue(Double.parseDouble(a[2]));
		student.setYuwen(Double.parseDouble(a[3]));
		student.setYingyu(Double.parseDouble(a[4]));
		//���ӿ���Ϣ
		arrayList.add(student);

	}
		}


	@Override
	public void info(java.util.ArrayList<Student> arrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			String string = student.toString();
			System.out.println(string);
			
		}
		
	}

	@Override
	//�Ƚ��ܳɼ������ֵ
	public double Max(java.util.ArrayList<xcs.Student> arrayList,String subject) {
		// TODO Auto-generated method stub
		double max=0;
		if (subject.equals("�ܳɼ�")) {
			max=arrayList.get(0).getSum();
			for (int i = 0; i < arrayList.size(); i++) {
				max=arrayList.get(i).getSum();
			}
			
		}
		if (subject.equals("��ѧ")) {
			max=arrayList.get(0).getShuxue();
			for (int i = 0; i < arrayList.size(); i++) {
				max=arrayList.get(i).getShuxue();
			}
			
		}
		
		
		return max;

		
	}


	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		
	}


	public void infoStudent(ArrayList<Student> arrayList) {
		// TODO Auto-generated method stub
		
	}


	public void helpSubInfo() {
		// TODO Auto-generated method stub
		
	}


	public void getMax(ArrayList<Student> arrayList, String string) {
		// TODO Auto-generated method stub
		
	}

	
}

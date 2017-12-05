package ExamSystem;

import java.util.ArrayList;
import java.util.Scanner;

import javax.security.auth.Subject;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ScoreService implements IScore {
	void helpSubInfo(){
		System.out.println("��߷ֲ�ѯϵͳ");
		System.out.println("[1]�ܳɼ���߷�������1");
		System.out.println("[2]������߷�������2");
		System.out.println("[3]��ѧ��߷�������3");
		System.out.println("[4]Ӣ����߷�������4");
		System.out.println("[5]�������˵�������5");
	}

	void helpInfo(){
		System.out.println("�߷�����ϵͳ");
		System.out.println("[1]¼��ɼ�������1");
		System.out.println("[2]��ѯ�ɼ�������2");
		System.out.println("[3]��ѯ��߷�������3");
		System.out.println("[4]�˳�ϵͳ������4");
	}
	@Override
	public void addScore(ArrayList<Student> arrayList, Scanner sc) {
		//1.ͨ�����̽�����Ϣ
		String s = sc.next();
		//2.�����Ϣ
		String []a = s.split(",");
		int lenth = a.length;
		if (lenth!=5) {
			System.out.println("You have been wrong.Please try again!!");
		} else {
			//3.ʵ��������
			Student student = new Student();
			//4.������Ϣ
			student.setName(a[0]);
			student.setID(a[1]);
			student.setcGrade(Double.parseDouble(a[2]));
			student.setmGrade(Double.parseDouble(a[3]));
			student.seteGrade(Double.parseDouble(a[4]));
			//5.������Ϣ
			arrayList.add(student);
		}


	}

	@Override
	public void infoScore(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Student x = arrayList.get(i);
			String y = x.toString();
			System.out.println(y);
		}

	}

	@Override
	public double getMax(ArrayList<Student> arrayList,String subject) {
		double max = 0;
		if (subject.equals("�ܳɼ�")) {
			max = arrayList.get(0).getTolGrade();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getTolGrade()>max) {
					max = arrayList.get(i).getTolGrade();	
		       }
			}
		}
		
		if (subject.equals("����")) {
			max = arrayList.get(0).getcGrade();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getcGrade()>max) {
					max = arrayList.get(i).getcGrade();	
		       }
			}
		}
		
		if (subject.equals("��ѧ")) {
			max = arrayList.get(0).getmGrade();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getmGrade()>max) {
					max = arrayList.get(i).getmGrade();	
		       }
			}
		}
		
		if (subject.equals("Ӣ��")) {
			max = arrayList.get(0).geteGrade();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).geteGrade()>max) {
					max = arrayList.get(i).geteGrade();	
		       }
			}
		}
		System.out.println(max);
		return max;
	}

}

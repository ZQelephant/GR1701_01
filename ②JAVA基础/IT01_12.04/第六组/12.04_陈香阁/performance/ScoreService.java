package performance;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreService implements Isecore {
	void helpInfo(){
		System.out.println("�߿�����ϵͳ");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a =s.split(",");
		int length = a.length;
		if (length!=5) {
			System.out.println("���������Ϣ���������޷�����");
		} else {
			Student student = new Student();
			student.setName(a[0]);
			student.setId(a[1]);
			student.setMathScore(Double.parseDouble(a[2]));
			student.setChineseScore(Double.parseDouble(a[3]));
			student.setEnglishScore(Double.parseDouble(a[4]));
			arrayList.add(student);
		}
	}


	@Override
	public void Student(ArrayList<Student> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			performance.Student string = arrayList.get(i);
			 String string2 = string.toString();
			System.out.println(string);
		}

	}

	@Override
	public double getMax(ArrayList<Student> arrayList,String subject) {
		if (subject.equals("�ܷ�")) {
			double Max = arrayList.get(0).getTotleScore();
			
		}			
		return 0;
	}
	
}

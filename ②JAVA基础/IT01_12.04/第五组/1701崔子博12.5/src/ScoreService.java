import java.util.ArrayList;
import java.util.Scanner;

public class ScoreService implements Iscore {
	
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

		// ͨ�����̽���һ���ַ���
		String s = sc.next();
		// ����ַ������ֱ�ĵ�����student�ĳ�Ա������Ϣ
		String[] a = s.split(",");
		int length = a.length;
		if (length != 5) {
			System.out.println("���������Ϣ������������������");
		} else {
			Student student = new Student();

			student.setName(a[0]);
			student.setId(a[1]);
			student.setEnglishScore(Double.parseDouble(a[2]));
			student.setChineseScore(Double.parseDouble(a[3]));
			student.setMathScore(Double.parseDouble(a[4]));

			arrayList.add(student);
			System.out.println(student.toString());

		}
	}

	@Override
	public void infoStudent(ArrayList<Student> arrayList) {

		for (int i = 0; i < arrayList.size(); i++) {
			Student student = arrayList.get(i);
			String string = student.toString();
			System.out.println(string);
		}

	}

	@Override
	public double getMax(ArrayList<Student> arrayList, String subject) {

		double max = 0;
		if (subject.equals("�ܳɼ�")) {
			max = arrayList.get(0).getSumscore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getSumscore() > max) {
					max = arrayList.get(i).getSumscore();

				}
			}
		}
		if (subject.equals("���ĳɼ�")) {
			max = arrayList.get(0).getChineseScore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChineseScore() > max) {
					max = arrayList.get(i).getChineseScore();

				}
			}
		}
		if (subject.equals("��ѧ�ɼ�")) {
			max = arrayList.get(0).getMathScore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMathScore() > max) {
					max = arrayList.get(i).getMathScore();

				}
			}
		}
		if (subject.equals("Ӣ��ɼ�")) {
			max = arrayList.get(0).getEnglishScore();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglishScore() > max) {
					max = arrayList.get(i).getEnglishScore();

				}
			}
		}
		System.out.println(max);
		return max;
		
	}

	
}

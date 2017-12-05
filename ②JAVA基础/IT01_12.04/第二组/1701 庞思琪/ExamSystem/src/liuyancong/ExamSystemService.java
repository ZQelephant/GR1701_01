package liuyancong;

import java.util.ArrayList;
import java.util.Scanner;

/*Author��������
 E-mail��15539919713@163.com
 */
public class ExamSystemService implements IExamSystem {

	@Override
	public void help1() {
		System.out
				.println("-----�߿�����ģ��ϵͳ-----" + "\n(1).¼�뿼����Ϣ������1"
						+ "\n(2).�鿴������Ϣ������2" + "\n(3).��ѯ��߷�������3"
						+ "\n(4).�˳�ģ��ϵͳ������4\n");
	}

	@Override
	public void help2() {
		System.out.println("-----��߷ֲ�ѯϵͳ-----" + "\n(1).��ѯ�ܷ���߷�������1"
				+ "\n(2).��ѯ��ѧ��߷�������2" + "\n(3).��ѯ������߷�������3"
				+ "\n(4).��ѯӢ����߷�������4" + "\n(5).�˳�ģ��ϵͳ������5\n");
	}

	@Override
	public void addStudent(ArrayList<Student> arrayList, Scanner sc) {
		System.out.println("�����뿼����Ϣ��" + "\n��ʽ������,���,��ѧ,����,Ӣ��"
				+ "\n!!�м���    ����, ����!!");
		String s = sc.next();
		String[] st = s.split(",");
		if (st.length != 5) {
			System.out.println("����������ʵ��ʽ�Ƿ���ȷ��");
		} else {
			Student student = new Student(st[0], st[1],
					Double.parseDouble(st[2]), Double.parseDouble(st[3]),
					Double.parseDouble(st[4]));
			arrayList.add(student);
			System.out.println("¼��ɹ���");
		}

	}

	@Override
	public void infoStudent(ArrayList<Student> arrayList) {

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}

	}

	@Override
	public void MaxScore(ArrayList<Student> arrayList, Scanner sc) {
		this.help2();
		boolean isQuit = true;
		while (isQuit) {
			System.out.println("������ָ���Enter����");
			double max = 0;
			int k = sc.nextInt();
			switch (k) {
			case 1:
				for (int i = 0; i < arrayList.size(); i++) {
					max = arrayList.get(i).getTotleScore();
				}
				System.out.println(max);
				break;

			case 2:
				for (int i = 0; i < arrayList.size(); i++) {
					max = arrayList.get(i).getMathScore();
				}
				System.out.println(max);
				break;
			case 3:
				for (int i = 0; i < arrayList.size(); i++) {
					max = arrayList.get(i).getChineseScore();
				}
				System.out.println(max);
				break;
			case 4:
				for (int i = 0; i < arrayList.size(); i++) {
					max = arrayList.get(i).getEnglishScore();
				}
				System.out.println(max);
				break;
			case 5:
				isQuit = false;
				this.help1();
				break;
			default:
				System.out.println("��������ȷ��ָ��");
				break;
			}
		}
	}

}

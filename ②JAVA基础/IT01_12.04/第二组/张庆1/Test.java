package zhangqing;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Array student = new Array();
		Scanner sc = new Scanner(System.in);
		boolean issmall = true;
		boolean is = false;
		student.help();
		int a = 0;

		while (issmall) {
			System.out.println("�밴��ʾ�����������ѯ����Ϣ��������һ���밴�س���");
			a = sc.nextInt();

			switch (a) {
			case 1:
				System.out.println("������������id����ѧ�ɼ������ĳɼ���Ӣ��ɼ�");
				student.addStudend(arrayList, sc);
				break;
			case 2:
				student.allStudent(arrayList);
				break;
			case 3:
				is = true;
				System.out.println("���ѽ����Ӳ˵�");
				student.Help();
				while (is) {

					a = sc.nextInt();
					switch (a) {
					case 1:
						student.getmax(arrayList, "�ܳɼ�");

						break;
					case 2:
						student.getmax(arrayList, "��ѧ");
						break;
					case 3:
						student.getmax(arrayList, "����");
						break;
					case 4:
						student.getmax(arrayList, "Ӣ��");
						break;
					case 5:
						is = false;
						break;

					default:
						System.out.println("��������ȷָ��");
						
						break;
					}
				}
				System.out.println("�����˳��Ӳ˵�,�������˵�");
				student.help();
				break;
			case 4:
				issmall = false;
				break;

			default:
				System.out.println("��������ȷָ��");
				break;
			}
		}
		System.out.println("see  you  late");

	}

}

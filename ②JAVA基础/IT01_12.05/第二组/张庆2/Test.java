package zhangqing;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Emploee> arrayList = new ArrayList<Emploee>();
		Array emploee = new Array();
		emploee.help();
		boolean issmall = true;
		while (issmall) {
			System.out.println("�밴����ʾ��ѯ��������ҵ���Ϣ��������һ���밴�س���");
			String key = sc.next();
			switch (key) {
			case "add":
				System.out.println("������������ID��нˮ����ְʱ�䣬����");
				emploee.addstemp(arrayList, sc);
				break;
			case "remove":
				
				break;
			case "all":
				emploee.allEmploee(arrayList);
				break;
			case "set":

				break;
			case "find":
				emploee.findstemp(arrayList, sc);
				break;
			case "exit":
				issmall=false;
				break;
			default:
				System.out.println("��������ȷָ��");
				break;
			}
		}
		System.out.println("see you late");

	}

}

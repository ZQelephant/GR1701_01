package com.examination;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		ScoreService service = new ScoreService();
		Scanner sc = new Scanner(System.in);
		boolean isQuit = true;
		boolean isSubQuit = false;
		service.help();
		int key = 0;
		while (isQuit) {
			System.out.println("������һ��ָ� �س���ִ��");
			switch (key) {
			case 1:
				service.addStudent(arrayList, sc);
				break;
			case 2:
				service.infoStudent(arrayList);
				break;
			case 3:
				service.helpSub();
				isSubQuit = true;
				while (isSubQuit) {
					sub(arrayList, service, key);

				}
				break;
			case 4:
				isQuit = false;
				break;
			default:
				break;
			}
		}System.out.println("�ټ�  ��ӭ�´�ʹ��");

	}

	private static void sub(ArrayList<Student> arrayList, ScoreService service,
			int key) {
		boolean isSubQuit;
		switch (key) {
		case 1:
		   service.max(arrayList, "�ܳɼ�");
			break;
		case 2:
			service.max(arrayList, "��ѧ");
			break;
		case 3:
			service.max(arrayList, "����");
			break;
		case 4:
			service.max(arrayList, "Ӣ��");
			break;
		case 5:
		    isSubQuit = false;
			break;

		default:
			break;
		}
	}

}

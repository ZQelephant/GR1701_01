package com.examinatiom;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> arrayList = new ArrayList<Student>();
		ScoreService service = new ScoreService();
		boolean isQuit = true;
		boolean isSubQuit = false;
		int key = 0;
		service.helpInfo();
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				service.addStudent(arrayList, sc);
				break;
				
			case 2:
				service.infoStudent(arrayList);
				break;
				
			case 3:
				service.helpSubInfo();
				isSubQuit = true;
				
				while (isSubQuit) {
					key = sc.nextInt();
					switch (key) {
					case 1:
						service.getMax(arrayList, "�ܳɼ�");
						break;
					case 2:
						service.getMax(arrayList, "����");
						break;
					case 3:
						service.getMax(arrayList, "��ѧ");
						break;
					case 4:
						service.getMax(arrayList, "Ӣ��");
						break;
					case 5:
						isSubQuit = false;
						break;
					default:
						break;
					}
				}
				break;

			case 4:
				isQuit = false;
				break;
			default:
				break;
			}
		}
		System.out.println("�˳�ϵͳ");
	}

}

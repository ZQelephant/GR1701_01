package com.exam;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student>arrayList=new ArrayList<Student>();
		ScoreService service=new ScoreService();
		boolean isQuit= true;
		boolean issubQuit=false;
		int key=0;
		while (isQuit){
			key=sc.nextInt();
			switch(key){
			case 1:
				service.addStudent(arrayList, sc);
				break;
			case 2:
				service.infoStudent(arrayList);
				break;
			case 3:
				service.helpSubInfo();
				issubQuit=true;
				while (issubQuit) {
					key=sc.nextInt();
					switch (key) {
					case 1:
						service.getMax(arrayList, "�ܳɼ�");
						break;
					case 2:
						service.getMax(arrayList, "���ĳɼ�");
						break;
					case 3:
						service.getMax(arrayList, "��ѧ�ɼ�");
						break;
					case 4:
						service.getMax(arrayList, "Ӣ��ɼ�");
						break;
					case 5:
						issubQuit=false;
						
						break;

					default:
						break;
					}
				}
			case 4:
				isQuit=false;
				break;

			default:
				break;
			}
		}
		System.out.println("�˳�ϵͳ");
	}

}

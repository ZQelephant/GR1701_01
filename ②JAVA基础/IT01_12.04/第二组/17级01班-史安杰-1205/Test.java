package com.saj;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Student>arrayList=new ArrayList<Student>();
		Iscore i=new Iscore();
		boolean a=true; 
		boolean asub=false;
		int key=0;
		i.helpinfo();
		while(a){
			System.out.println("������ָ������س���");
			key=sc.nextInt();
			
			switch (key) {
			case 1:
				i.addStudent(arrayList, sc);
				break;
			case 2:
				i.infoStudent(arrayList);
				break;	
			case 3:
				asub = true;
				i.helpsubinfo();
				
				
				while (a) {
					key=sc.nextInt();
					switch (key) {
					case 1:
						i.getMax(arrayList, "�ܳɼ�");
						break;
					case 2:
						i.getMax(arrayList, "����");
						break;
					case 3:
						i.getMax(arrayList, "��ѧ");
						break;
					case 4:
						i.getMax(arrayList, "Ӣ��");
						break;
					case 5:
						asub=false;
						break;

					default:
						break;
					}
					
				}
				break;	
			case 4:
				a=false;
				break;
			default:
				break;
			}
		}
		System.out.println("�˳�ϵͳ");

	}

}

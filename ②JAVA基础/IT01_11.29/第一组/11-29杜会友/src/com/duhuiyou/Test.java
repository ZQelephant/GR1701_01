package com.duhuiyou;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
/*	System.out.println("------�ɼ�����ϵͳ------");
	System.out.println("[1]���������1");
	System.out.println("[2]�����ֵ������2");
	System.out.println("[3]����Сֵ������3");
	System.out.println("[4]����ƽ��ֵ������4");
	System.out.println("[5]����������5");
	System.out.println("[6]�鿴�ɼ�������6");
	System.out.println("[7]�鿴������������7");
	System.out.println("[8]�˳�������8");*/
	public static void main(String[] args) {
		//�I�P����
		Scanner sc = new Scanner(System.in);
		//���嶯̬����
		//double[]a=new double[10];
		//���徲̬����
		double[]a={56,46,85,68,67,89,98,48,51,96,76,81};
		//������
		FANG fang = new FANG();
		//�{��
		fang.info();
		//����׃���Д�
		boolean isquit = true;
		//�����ַ���	
		String s;
		
		//forѭ�����ռ���ֵ
		/*for (int i = 0; i < args.length; i++) {
			System.out.println("�������"+(i+1)+"��ֵ");
			a[i]=sc.nextInt();
		}*/
		System.out.println("������ָ��س���ִ��");
		while (isquit) {
			s = sc.next();
			switch (s) {
			case "1":
				

				break;
			case "2":

				break;
			case "3":

				break;
			case "4":

				break;
			case "5":

				break;
			case "6":

				break;
			case "7":

				break;
			case "8":
				isquit =false;

				break;

			default:
				break;
			}
		}
		System.out.println("��Ҋ���ҵ�����");
	}

}

package com.zkqhit;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		double []d={25,68,97,16,48,34,66};
		Score score =new Score();
		score.info();
		Scanner sc=new Scanner(System.in);
		boolean is = true;//boolean os=true;
		String s;
		while (is) {
			System.out.println("��������һ��ָ��");
			s=sc.next();
			switch (s) {
			case "max":
				double max=score.max(d);
				System.out.println("���ֵ�ǣ�"+max);
				
				break;
			case"min":
				double min=score.min(d);
				System.out.println("��Сֵ�ǣ�"+min);
				break;
			case"Average":
				double average=score.average(d);
				System.out.println("ƽ��ֵ�ǣ�"+average);
				break;
			case"sum":
				double sum=score.sum(d);
				System.out.println("�ܳɼ��ǣ�"+sum);
				break;
			case"Number":
				double number=score.numberNot60(d);
				System.out.println("������������У�"+number);
				break;
			case "Examine":
				score.examine(d);
				System.out.println("�鿴ȫ���ɼ�");
				break;
			case "Exit":
				is = false;
				break;
				
			

			default:
				break;
			}
		}
		

		
		
	}

}

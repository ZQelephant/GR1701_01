package com.grade;

import java.util.Arrays;
import java.util.Scanner;

/*Author��������
  E-mail��15539919713@163.com
 */
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�㽫�Լ���ѧ���ɼ����й���");
		int n = sc.nextInt();
		double[] d = new double[n];
		for (int i = 0; i < d.length; i++) {
			System.out.print("�������"+(i+1)+"���ɼ���");
			double s = sc.nextDouble();
			d[i] = s;
		}
	
		Score score = new Score();
		boolean isExit = true;
		score.help();
		while(isExit){
			
			System.out.println("������ָ���Enter��\n");
			String k = sc.next();
			
			switch (k) {
			
			case "Help":
				score.help();
				break;
				
			case "Info":
				score.ScoreInfo(d);
				System.out.println();
				break;
				
			case "Sum":
				System.out.println(score.sum(d));
				System.out.println();
				break;
				
			case "Max":
				System.out.println(score.max(d));
				System.out.println();
				break;
				
			case "Min":
				System.out.println(score.min(d));
				System.out.println();
				break;
				
			case "Average":
				System.out.println(score.average(d));
				System.out.println();
				break;
				
			case "Sort":
				System.out.println(Arrays.toString(score.sort(d)));
				System.out.println();
				break;
				
			case "Not":
				System.out.println(score.Not60(d));
				System.out.println();
				break;
				
			case "Exit":
				isExit = false;
				break;

			default:
				System.out.println("��������ȷ��ָ�");
				System.out.println();
				break;
			}
			
		}
	System.out.println("��л����ʹ�ã��ټ���");
	sc.close();
	}
}
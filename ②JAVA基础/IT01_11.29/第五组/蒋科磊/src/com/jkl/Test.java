package com.jkl;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		double[] d={12,32,34,54,65,56,23,26,69,36};
		Score score = new Score();
		score.info();
		Scanner sc=new Scanner(System.in);
		boolean isQuit = true;
		String s;
		while(isQuit){
			System.out.println("��������һ��ָ��س�ִ��");
			s=sc.next();
			
			switch (s) {
			case "sum":
				double sum=score.sum(d);
				System.out.println("�ܳɼ��ǣ�"+sum);
				break;
			case "Max":
				double Max=score.Max(d);
				System.out.println("���ֵ�ǣ�"+Max);
				break;
			case "Min":
				double Min=score.Min(d);
				System.out.println("��Сֵ�ǣ�"+Min);
				break;
			case "average":
				double average=score.average(d);
				System.out.println("ƽ��ֵ�ǣ�"+average);
				break;
			case "Sort":
				System.out.println("�����ǣ�"+Arrays.toString(score.sort(d)));
				break;
			case "Not":
				int a = score.numberNot60(d);
			
				System.out.println("�������ǣ�"+a);
				break;
			case "Exit":
				isQuit=false;
				break;
			

			default:
				break;
			}
		}
		System.out.println("�ټ��ˣ��ҵ�����");

	}

}

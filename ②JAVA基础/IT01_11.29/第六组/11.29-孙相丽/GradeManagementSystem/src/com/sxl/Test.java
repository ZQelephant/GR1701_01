package com.sxl;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] d={12,45,89,21 ,96,25,23,32,78,98  };
        Score  score =new Score();
        score.help();
		Scanner sc =new Scanner(System.in);
		boolean isExit=true;
		String s;
		while (isExit) {
			s=sc.next();
			switch (s) {
			case "sum":
				System.out.println("����ͣ�"+score.sum(d));
				break;
            case "Max":
				System.out.println("���ֵ�ǣ�"+score.max(d));
				break;
            case "Min":
            	System.out.println("��Сֵ�ǣ�"+score.min(d));
				break;
            case "Average":
				System.out.println("ƽ��ֵ�ǣ�"+score.average(d));
				break;
             case "Sort":
				score.sort(d);
				break;
            case "Not":
 			    System.out.println("������������"+score.numberNot60(d));
 				break;
 			case "Info":
 				System.out.println("�����Ǳ��β��Եĳɼ�");
 				score.info(d);
 				break;
            case "Exit":
				isExit=false;
				break;
      
			default:
				break;
			}
			
			
	
		}
		
		System.out.println("�ټ��ˣ��ҵ����ѡ�");
		sc.close();
	}

}

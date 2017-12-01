package ccom.cjgl;

import java.util.Arrays;
import java.util.Scanner;

public class Text {

	public static void main(String[] args) {

		double[] c = { 58, 98, 74, 68, 75, 83, 97, 66, 76, 81 };
		Score score = new Score();
		score.info();
		Scanner sc = new Scanner(System.in);
		boolean isQuit = true;
		String s;
		while (isQuit) {
			System.out.println("������ָ��");
			s = sc.next();

			switch (s) {
			case "Sum":
				double sum = score.sum(c);
				System.out.println("�ܳɼ���"+sum);
				break;
				
			case "Max":
				double max = score.max(c);
				System.out.println("���ֵ�ǣ�"+max);
				break;
				
			case "Min":
				double min = score.min(c);
				System.out.println("��Сֵ�ǣ�"+min);
				break;
			case "Average":
				double average = score.average(c);
				System.out.println("ƽ�����ǣ�"+average);
				break;	
				
			case "Sort":
				System.out.println(Arrays.toString(score.sort(c)));
				
				break;	
				
			case "Not":
				double not = score.numberNot60(c);
				System.out.println("����������"+not);
				break;	
				
				
			case "Info":
				score.scoreInfo(c);
				break;
				
			case "Exit":
				isQuit = false;
				break;
			default:
				break;
			}
		}
		System.out.println("�ټ����ҵ�����");
	}

}

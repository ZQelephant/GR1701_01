package number;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("������ɼ���");
		int study = sc.nextInt();
		boolean w = false;
		w = (study >= 90) ? true : false;
		System.out.println("w��ֵ��:" + w);
		if (w) {
			System.out.println("��ʾΪ:A");
		} else if (w = (study >= 60) ? true : false) {
			System.out.println("��ʾΪ:B");
		} else if (w = (study < 60) ? true : false) {
			System.out.println("��ʾΪ:C");
		}

	}

}

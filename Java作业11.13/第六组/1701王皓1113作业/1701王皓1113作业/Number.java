package WangHao;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("������ɼ���");
		int study = sc.nextInt();
		boolean a = false;
		a = (study >= 90) ? true : false;
		System.out.println("a��ֵ��:" + a);
		if (a) {
			System.out.println("��ʾΪ:A");
		} else if (a = (study >= 60) ? true : false) {
			System.out.println("��ʾΪ:B");
		} else if (a = (study < 60) ? true : false) {
			System.out.println("��ʾΪ:C");
		}

	}

}

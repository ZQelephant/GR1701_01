package ball;

import java.util.Scanner;

public class Ball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������hΪ����");
		double h = sc.nextInt();
		double hs = h / 2;
		int i = 0;
		System.out.println("������nΪ����");
		int n = sc.nextInt();
		for (i = 2; i < n; i++) {
			h = h + hs * 2;
			hs = hs / 2;

		}
		System.out.println("��" + i + "����ؾ���" + h + "��");
		System.out.println("��" + i + "�η���" + hs + "��");

	}

}

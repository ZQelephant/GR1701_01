package sort;

import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ������");
		int k = sc.nextInt();
		System.out.print("������ڶ�������");
		int l = sc.nextInt();
		System.out.print("���������������");
		int j = sc.nextInt();
		System.out.print("��������ĸ�����");
		int h = sc.nextInt();
		//����
		int score[] = { k, l, j, h };
		for (int a = 1; a < score.length; a++) {
			for (int b = 0; b < score.length; b++) {
				if (score[a] < score[b]) {
					int c = score[a];
					score[a] = score[b];
					score[b] = c;
				}
			}
		}
		for (int c = 0; c < score.length; c++) {
			System.out.print(score[c]);
			if (c < 3) {
				System.out.print("<");
			}
		}
		sc.close();
	}
}
package keyboard;

import java.util.Scanner;

public class Keyboard {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ������");
		int a1 = sc.nextInt();
		System.out.print("������ڶ�������");
		int a2 = sc.nextInt();
		System.out.print("���������������");
		int a3 = sc.nextInt();
		System.out.print("��������ĸ�����");
		int a4 = sc.nextInt();
		int score[] = { a1, a2, a3, a4 };
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

package machao;

import java.util.Scanner;

public class Nine {
	public static void main(String[] args) {
              //ͨ������̨����һ������N,N������10000��
              //�������е��ߵı����Ͱ����ߵ����֡�
		Scanner sc = new Scanner(System.in);
		System.out.println("��ֵ���ɴ���10000");
		int a = sc.nextInt();
		if (a > 10000) {
			System.out.println("����");
		} else {
			for (int p = 1; p < a;p++) {
				if (p % 7 == 0 || p %1000 == 7 || p % 100 == 7
						|| p / 10 % 10 == 7 || p % 10 == 7) {

					System.out.println("���7�ı����ͺ�7������" + p);
				}

			}

		}

	}
}

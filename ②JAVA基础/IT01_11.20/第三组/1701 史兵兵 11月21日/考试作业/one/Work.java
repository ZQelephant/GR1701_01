package one;

import java.util.Scanner;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��20�� ����8:08:43
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Work {
	public static void main(String[] args) {
		// ��дJava����ͨ������̨����һ������N����N������1000����
		// �������7�ı����Ͱ���7������
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����");
		int n = input.nextInt();
		if (n > 1000) {
			System.out.println("����������ִ���");

		} else {
			for (int a = 1; a <= 1000; a++) {
				if (a % 7 == 0) {
					System.out.println(a);
				}
				if (a / 1000 == 7 || a / 100 % 10 == 7 || a / 10 % 10 == 7
						|| a % 10 == 7) {
					System.out.println(a);
				}

			}

		}
	}
}

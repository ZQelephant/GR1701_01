package whh;

import java.util.Scanner;

/**
 * @author ���� E-mail:2421922506@QQ.com
 * @date ����ʱ�䣺2017��11��14�� ����7:10:06
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Operation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ɼ���");
		int i = input.nextInt();

		if (i >= 90) {
			System.out.println("A");
		}

		if (i >= 60 && i <= 89) {
			System.out.println("B");
		}

		if (i < 60 && i >= 0) {
			System.out.println("C");
		}
	}
}

package wangshenliang;

import java.util.Scanner;

/**
 * @author ���� ������E-mail:793708547@QQ.com
 * @date ����ʱ�䣺2017��11��21�� ����8:16:33
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Zy9 {
	public static void main(String[] args) {
		System.out.println("������һ��������10000����:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i <= 10000) {
			for (int a = 1; a <= i; a++) {
				if (a % 7 == 0 || a / 1000 == 7 || a / 100 == 7 || a / 10 == 7||a%10==7) {
					System.out.println(a);
				}
			}
		} else {
			System.out.println("������һ����ȷ����!");
		}
		sc.close();
	}

}

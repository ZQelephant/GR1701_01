package wangshenliang;

import java.util.Scanner;

/**
 * @author ���� ������E-mail:793708547@QQ.com
 * @date ����ʱ�䣺2017��11��17�� ����1:18:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class ZHe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��ֵ");
		int a = sc.nextInt();
		if (a > 0)
			System.out.println(a + "������");
		if (a < 0)
			System.out.println(a + "�Ǹ���");
	}

}

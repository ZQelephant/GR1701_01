package wangshenliang;

import java.util.Scanner;

/**
 * @author ���� ������E-mail:793708547@QQ.com
 * @date ����ʱ�䣺2017��11��16�� ����7:23:13
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class One {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��ֵ");
		float a = sc.nextFloat();
		System.out.println("������ڶ���ֵ");
		float b = sc.nextFloat();
		if (a > b)
			System.out.println(a + ">" + b);
		if (a < b)
			System.out.println(a + "<" + b);
	}

}

package six;

import java.util.Scanner;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��16�� ����7:08:06
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Inherit {
	public static void main(String[] args) {
		/**
		 * ��дjava����ͨ������̨��������С�����ж�����С�� ��С��
		 * ��������
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ��С��");
		float a = input.nextInt();
		System.out.println("������ڶ���С��");
		float b = input.nextInt();
		if (a > b) {
			System.out.println(a);

		} else {
			System.out.println(b);
		}
	}

}

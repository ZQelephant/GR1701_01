package Com.zk.qhit.statictest;

import java.util.Scanner;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��21�� ����8:10:17
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Wenshu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ����λ���ж��ǲ��ǻ�����");
		int a = sc.nextInt();
		if (a / 10000 == a % 10 || a / 1000 % 10 == a % 100) {
			System.out.println("�ǻ�����");
		} else {
			System.out.println("���ǻ�����");
		}
	}
}

package machao;

import java.util.Scanner;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��28�� ����7:00:14
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {

	public static void main(String[] args) {
		// �Ӽ��̽���10����,������������,Ȼ��ѭ�����������е�Ԫ��.
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {
			System.out.println("�������" + (i + 1) + "����");
			a[i] = sc.nextInt();
		}
		for (int j = 0; j < a.length; j++) {
			a[j] = j + 1;
			System.out.println(a[j]);
		}

	}
}

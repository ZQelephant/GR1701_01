package machao;

import java.util.Scanner;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��16�� ����7:15:23
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Ball {
	public static void main(String[] args) {
		// һ���h�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ��,
		// �����£������� ��n�����ʱ�������������ף���n�η�����ߣ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������HΪ����");
		double H = sc.nextInt();
		double hn = H / 2;

		int a = 0;
		System.out.println("������NΪ����");
		int N = sc.nextInt();
		for (a = 1; a < N; a++) {
			H = H + hn * 2;
			hn = hn / 2;
		}
		System.out.println("��" + a + "����ؾ���" + H + "��");
		System.out.println("��" + a + "�η���" + hn + "��");
	}

}

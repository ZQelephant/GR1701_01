package Grade;

import java.util.Scanner;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��29�� ����8:56:47
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�㽫�Լ���ѧ���ɼ����й���");
		int n = sc.nextInt();
		double[] d = new double[n];
		for (int i = 0; i < d.length; i++) {
			System.out.print("�������" + (i + 1) + "���ɼ���");
			double s = sc.nextDouble();
			d[i] = s;
		}

		Score score = new Score();
		boolean isExit = true;
		score.help();
		while (isExit) {

			System.out.println("������ָ����س���������һ��ָ��");
			String k = sc.next();

			switch (k) {

			case "Help":
				score.help();
				break;
			case "Max":
				System.out.println(score.Max(d));
				System.out.println();
				break;
			case "Min":
				System.out.println(score.Min(d));
				System.out.println();
				break;
			case "Sum":
				System.out.println(score.Sum(d));
				System.out.println();
				break;
			case "Average":
				System.out.println(score.Average(d));
				System.out.println();
				break;
			case "numberNot60":
				System.out.println(score.numberNot60(d));
				System.out.println();
				break;
			case "sort":
				System.out.println(score.Sort(d));
				System.out.println();
				break;
			case "Exit":
				isExit = false;
				break;

			default:
				System.out.println("��������ȷ��ָ��!");
				System.out.println();
				break;
			}
		}
		System.out.println("�ټ���,�ҵ�����");

	}

}

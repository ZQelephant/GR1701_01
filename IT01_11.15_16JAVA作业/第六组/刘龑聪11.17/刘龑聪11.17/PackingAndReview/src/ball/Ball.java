package ball;

import java.util.Scanner;

public class Ball {
	public static void main(String[] args) {
		// һ���h�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������� ��n�����ʱ�������������ף���n�η�����ߣ�
		Scanner sc = new Scanner(System.in);
		System.out.println("С��Ӽ��׸߶��������£�");
		float h = sc.nextFloat();
		System.out.println("����֪��С��ڼ������ʱ�������");
		int n = sc.nextInt();

		float H = h;
		for (int i = 1; i < n; i++) {
			H += h;
			h = h / 2;
		}
		System.out.println("С���" + n + "�����ʱ��������" + H + "�ף���" + n + "�η���" + h
				/ 2 + "�׸ߣ�");
		sc.close();
	}
}
package gaojie;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��8�� ����4:43:17
 */
public class Daffodil1109 {
	public static void main(String[] args) {
		for (int a = 100; a <= 1000; a++) {

			int b = a / 100;
			int c = a / 10 % 10;
			int d = a % 10;
			int e = (b * b * b) + (c * c * c) + (d * d * d);
			
			if (a == 1000) {
				break;
			}
			if (a == e) {
				System.out.println("ˮ�ɻ���ֵΪ��" + a);
			}

		}

	}
}

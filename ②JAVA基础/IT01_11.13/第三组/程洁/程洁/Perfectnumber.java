package perfectnumber;

/**
 * @author ���� E����mai l:�̽�2564963490@QQ.com
 * @date ����ʱ��: 2017��11��13�� ����7:55:28
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Perfectnumber {
	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {
			int tem = 0;
			for (int x = 1; x < i; x++) {
				if (i % x == 0) {

					tem += x;

				}

			}
			if (tem == i) {
				System.out.println(i);
			}

		}
	}

}

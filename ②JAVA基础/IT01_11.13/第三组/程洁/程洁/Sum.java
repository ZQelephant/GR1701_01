package sum;

/**
 * @author ���� E����mai l:�̽�2564963490@QQ.com
 * @date ����ʱ��: 2017��11��13�� ����7:58:04
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Sum {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 10 == 3)
				continue;
			sum += i;

		}
		System.out.println(sum);
	}

}

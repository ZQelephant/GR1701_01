package whh;

/**
 * @author ���� E-mail:2421922506@QQ.com
 * @date ����ʱ�䣺2017��11��24�� ����5:51:18
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Summation {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);

		int a = 1;
		int s = 0;
		while (a <= 100) {
			if (a % 2 != 0) {
				s += a;
			}

			a++;
		}
		System.out.println(s);
	}

}

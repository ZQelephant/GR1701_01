package machao;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��28�� ����7:06:05
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test01 {

	public static void main(String[] args) {
		// ����һ����������{5,9,12,45,18,30},Ҫ���ӡ��������
		// ����Ԫ��֮�Ͳ���ӡ�����ֵ����Сֵ.

		int[] a = { 5, 9, 12, 45, 18, 30 };

		int sum = 0;
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (a[i] > max) {
				max = a[i];

			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
	}
}
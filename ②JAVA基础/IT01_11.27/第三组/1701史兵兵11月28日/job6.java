package job;

import java.util.Arrays;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��28�� ����7:13:57
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class job6 {
	public static void main(String[] args) {
		// mð�ݷ�
		int[] a = { 22, 34, 15, 78, 11, 8 };
		int b = 0;
		for (int j = 0; j < a.length - 1; j++) {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					b = a[i];
					a[i] = a[i + 1];
					a[i + 1] = b;

				}
			}
			System.out.println(Arrays.toString(a));
		}

	}

}

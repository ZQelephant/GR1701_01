package GLH;

import java.util.Arrays;

/** 
 * @author  ������
 * @���� E-mail��1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��28�� ����6:28:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class HomeWork1127_6 {

	public static void main(String[] args) {
		int[] a = {33,46,68,77,34};

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

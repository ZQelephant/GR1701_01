package zhudiping;

/**
 * @author ���� E-mail:271406@163.com
 * @date ����ʱ�䣺2017��11��8�� ����8:32:10
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Haskell1 {
	public static void main(String[] args) {
		int a = 1;
		while (a <= 9) {
			int b = 1;
			while (b <= a) {
				System.out.print(a + "*" + b+ "=" + a * b + "\t");
				b++;
			}
			System.out.println();
			a++;
		}

	}

}

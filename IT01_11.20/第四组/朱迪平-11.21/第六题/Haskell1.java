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
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= i) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}

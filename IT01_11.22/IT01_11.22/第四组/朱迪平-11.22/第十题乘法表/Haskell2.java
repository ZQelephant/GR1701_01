package haskell;

/**
 * @author ���� E-mail271406@163.com
 * @date ����ʱ�䣺2017��11��9�� ����4:31:12
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Haskell2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();

		}
	}
}

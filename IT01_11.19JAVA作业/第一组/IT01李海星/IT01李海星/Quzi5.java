package java.src;

/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��19�� ����8:21:16
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Quzi5 {
	public static void main(String[] args) {
		int a = 1;
		do {
			if (a % 5 == 0 || a % 3 == 0) {
				System.out.println("�ܱ�3��5��������:" + a);
			}
			a++;
		} while (a <= 1000);

	}
}

package machao;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��14�� ����7:33:46
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Haskell {
	public static void main(String[] args) {
		// ��ӡ�žų˷���
		for (int a = 1; a <= 9; a++) {

			for (int b = 1; b <= a; b++) {

				System.out.print(a + "*" + b + "=" + a * b + "\t");
			}
			System.out.println();
		}
	}
}

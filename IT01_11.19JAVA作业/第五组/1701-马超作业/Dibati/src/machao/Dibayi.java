package machao;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��19�� ����8:38:01
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dibayi {
	public static void main(String[] args) {

		for (int d = 100; d < 1000; d++) {
			if ((d % 10 == 6) && (d % 3 == 0)) {
				System.out.println(d);
			}
		}
	}

}

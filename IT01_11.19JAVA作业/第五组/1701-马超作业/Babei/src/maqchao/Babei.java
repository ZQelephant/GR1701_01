package maqchao;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��19�� ����8:19:11
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Babei {
	public static void main(String[] args) {
		// ��дJAVA������1000��������8�ı���֮�͡�
		int sum = 0;
		for (int N = 1; N <= 1000; N++) {
			if (N % 8 == 0) {
				sum += N;
			}
		}
		System.out.println(sum);
	}

}

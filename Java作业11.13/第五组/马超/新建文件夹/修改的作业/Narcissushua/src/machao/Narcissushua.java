package machao;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��14�� ����7:18:34
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Narcissushua {
	public static void main(String[] args) {
		// ��ӡ��100��1000�����е�"ˮ�ɻ���" ��
		// (��ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
		// ���磺153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η���)

		System.out.println("��һ��\n��ӡ��100��1000�����е�ˮ�ɻ���");
		int hundred = 0;
		int tens = 0;
		int untis = 0;
		for (int i = 100; i <= 1000; i++) {
			hundred = i / 100;
			tens = i / 10 % 10;
			untis = i % 10;
			if (i == (hundred * hundred * hundred + tens * tens * tens + untis
					* untis * untis)) {
				System.out.println("ˮ�ɻ����ĸ���:" + i);
			}
		}
	}
}
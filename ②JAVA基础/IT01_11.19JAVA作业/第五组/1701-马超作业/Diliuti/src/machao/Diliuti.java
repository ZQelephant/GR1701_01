package machao;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��19�� ����8:29:35
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Diliuti {
	public static void main(String[] args) {
		// ��дJAVA����1��10֮���������ӣ��õ�
		// �ۼ�ֵ����20�ĵ�ǰ���֣��������������
		int sum = 0;
		for (int p = 1; p <= 10; p++) {
			sum += p;
			if (sum > 20) {
				System.out.println(sum);
				break;
			}
		}
	}

}

package machao;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��19�� ����8:24:31
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dowhilexunhuan {
	public static void main(String[] args) {
		// ��дJAVA������1000���ڣ����ܱ�5���������ܱ�
		// 3���������е�����������ӡ������(ʹ��do whileѭ��ʵ�֣���
		int i = 1;
		do {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 1000);
	}

}

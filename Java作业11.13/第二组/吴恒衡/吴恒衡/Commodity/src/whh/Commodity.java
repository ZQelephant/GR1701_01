package whh;

/**
 * @author ���� E-mail:2421922506@QQ.com
 * @date ����ʱ�䣺2017��11��13�� ����6:51:35
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Commodity {
	// ��Ʒ���
	String number;

	// ��Ʒ����
	String name;
	// ��Ʒ�۸�
	float price;
	// ��Ʒ�ͺ�
	int type;
	// ��Ʒ���
	String category;

	void dity() {
		System.out.println("��Ʒ���:" + number + "\n" + "��Ʒ����:" + name + "\n"
				+ "��Ʒ�۸�:" + price + "\n" + "��Ʒ�ͺ�:" + type + "\n" + "��Ʒ���:"
				+ category );
	}

}

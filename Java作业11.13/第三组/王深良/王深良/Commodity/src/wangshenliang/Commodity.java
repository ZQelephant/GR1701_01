package wangshenliang;

/**
 * @author ���� ������E-mail:793708547@QQ.com
 * @date ����ʱ�䣺2017��11��14�� ����7:04:23
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Commodity {

	int id;
	String name;
	int value;
	int model;
	String sclass;

	void SelfBrands() {

		System.out.println("�ҵı���ǣ�" + id + "  \n���ǣ�           " + name
				+ "  \n�ҵļ۸�Ϊ��" +value + "  \n�ҵ��ͺ��ǣ�" + model + "  \n�ҵ�����ǣ�"
				+ sclass);
	}

}

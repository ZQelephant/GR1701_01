package com.zk.qhit.Statictest;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��20�� ����8:27:54
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class TestBook {
	// f����com.tsinghua���´���������TestBook.java ��
	public static void main(String[] args) {

		Book e1 = new Book();
		e1.setName("���´�ȫ");
		e1.setNo("001");
		e1.setPrice(12.5);
		e1.getInfo();

		Book e2 = new Book("��ͽ��ͯ��", 45);
		e2.getInfo();

	}

}

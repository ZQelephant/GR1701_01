package com.zk.qhit.statictest;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��20�� ����8:52:28
 */
public class TestBooks {
	public static void main(String[] args) {

		Book book = new Book();

		book.setName("ʮ���Ϊʲô");
		book.setPrice(25);
		book.getInfo();

		Book b2 = new Book("����ͯ��", 33);
		b2.getInfo();

	}
}
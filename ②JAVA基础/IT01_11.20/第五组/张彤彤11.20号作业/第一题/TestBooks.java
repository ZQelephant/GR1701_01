package com.zk.qhit.statictest;


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
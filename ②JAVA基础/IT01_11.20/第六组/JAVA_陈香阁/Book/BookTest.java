package com.zk.qhit;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setName("ɽ����");
		b1.setPrice(49);
		b1.getInfo();
		
		Book b2 = new Book("�׾�",54);
		b2.getInfo();
	}
}

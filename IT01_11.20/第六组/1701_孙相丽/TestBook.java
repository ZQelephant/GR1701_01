package com.tsinghua;

import com.zk.qhit.statictest.Book;

public class TestBook {

	public static void main(String[] args) {
		Book book = new Book();
		book.setName("�����ȫ����·��");
		book.setPrice(250);
		book.getInfo();
	
		Book book1 = new Book("��Ĺ¶����������",250);
		book1.getInfo();
	
	
	}
}

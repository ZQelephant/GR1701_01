package com.tsinghua;

import com.zk.qhit.statictest.Book;

public class TestBook {
	public static void main(String[] args) {
		
		Book OliverTwist=new Book();
		OliverTwist.setName("����");
		OliverTwist.setType("��ƪС˵");
		OliverTwist.setPrice(59);
		OliverTwist.setPages(231);
		
		OliverTwist.getinfo();
		
		int NO=Book.NO();
		System.out.println(NO);
	}
}
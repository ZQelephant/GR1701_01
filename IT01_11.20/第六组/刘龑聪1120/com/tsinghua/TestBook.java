package com.tsinghua;

import com.zk.qhit.statictest.Book;

/*���ߣ�������
 *E-mail��15539919713@163.com
 */
public class TestBook {
	public static void main(String[] args) {
		
		Book OliverTwist=new Book();
		OliverTwist.setName("���¶�");
		OliverTwist.setType("��ƪдʵС˵");
		OliverTwist.setPrice(59);
		OliverTwist.setPages(231);
		
		OliverTwist.getinfo();
		
		int NO=Book.NO();
		System.out.println(NO);
	}
}
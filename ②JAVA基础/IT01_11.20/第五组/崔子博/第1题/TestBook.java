package com.zk.qhit.statictest;

//f����com.tsinghua���´���������TestBook.java ��
public class TestBook {
	public static void main(String[] args) {		
		Book b1 = new Book();
		b1.setName("��ʥ��");
		b1.setPrice(25.60);
		b1.getInfo();
		
		Book b2=new Book("���м�",18);
		b2.getInfo();
		
	}

}

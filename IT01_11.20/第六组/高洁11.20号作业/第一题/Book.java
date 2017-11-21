package com.zk.qhit.statictest;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��20�� ����8:17:57
 */
public class Book {

	private String name;
	private int price;
	private String no;
	private static int count = 0;

	public Book() {
		count++;
		no = "TPOO" + count;
	}

	public Book(String name, int price) {
		count++;
		no = "TPOO" + count;
		this.name = name;
		this.price = price;
	}

	public static int getCount() {
		return count;
	}

	public String getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price <= 0) {
			System.out.println("�㲻���������");
		}
		this.price = price;
	}

	public void getInfo() {
		System.out.println(" ��ţ� " + this.getNo() + " ����Ϊ�� " + this.getName()
				+ "  ���в��� " + Book.getCount());
	}

}

package com.zk.qhit.statictest;

public class Book {
	// a�������ĸ�˽�г�Ա����������countΪstatic�� ��

	private String no;
	private String name;
	private double price;
	private static int count;

	// b���ڹ��췽����ʵ��countֵ�ĵ�����ͬʱ��countֵ������΢��ת�丳ֵ������no
	public Book() {
		count++;
		no = "tp00" + count;

	}

	public Book(String name, double price) {
		count++;
		no = "tp00" + count;
		this.name = name;
		this.price = price;

	}

	// c��ʵ�ֳ�Ա����name, price�ķ�װ ��
	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public double getprice() {
		return price;
	}

	public void setprice() {
		this.price = price;
	}

	// d��Ϊno,count�ṩֻ������ ��
	public static int getCount() {
		return count;

	}

	public String getNo() {
		return no;
	}

	// e��getInfo������������鼮�Ļ�����Ϣ ��
	public void getInfo() {
		System.out.println("���" + this.getNo() + "��" + this.getName() + "��,"
				+ "ͼ��ݹ��в��飺" + Book.getCount());
	}

	public void setPrice(double d) {
		// TODO Auto-generated method stub
		
	}

}

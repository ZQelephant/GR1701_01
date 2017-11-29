package com.zk.qhit.Statictest;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��20�� ����8:12:09
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Book {
	// a����Book.java�ഴ���ĸ�˽�г�Ա������
	// ����countΪstatic�� ��
	private String no;
	private String name;
	private double price;
	private static int count = 0;

	// b���ڹ��췽����ʵ��countֵ�ĵ�����
	// ͬʱ��countֵ������΢��ת�丳ֵ������no��

	public Book() {
		count++;
		no = "T" + count;
	}

	public Book(String name, double price) {
		count++;
		no = "T" + count;
		this.name = name;
		this.price = price;
	}

	// c��ʵ�ֳ�Ա����name, price�ķ�װ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// d��Ϊno,count�ṩֻ������

	// e��getInfo������������鼮�Ļ�����Ϣ ��
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Book.count = count;
	}

	public void getInfo() {
		System.out.println("�鼮���֣�" + this.getName() + "\t" + "��ţ�"
				+ this.getNo() + "\t" + "�۸�" + this.getCount());

	}

	public Book(String no, String name, double price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	// f����com.tsinghua���´���������TestBook.java ��

}

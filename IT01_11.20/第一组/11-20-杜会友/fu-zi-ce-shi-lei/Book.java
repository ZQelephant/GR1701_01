package com.zk.qhit.statictest;

public class Book {

	/*
	 * a����Book.java�ഴ���ĸ�˽�г�Ա����������countΪstatic�� �� b���ڹ��췽����ʵ��countֵ�ĵ�����
	 * ͬʱ��countֵ������΢��ת�丳ֵ������no�� c��ʵ�ֳ�Ա����name, price�ķ�װ �� d��Ϊno,count�ṩֻ������ ��
	 * e��getInfo������������鼮�Ļ�����Ϣ �� f����com.tsinghua���´���������TestBook.java ��
	 */// ����
	String name;
	int character;
	double price;
	String author;

	// ��

	public Book(String read, int character, double price, String author) {
		this.name = name;
		this.character = character;
		this.price = price;
		this.author = author;
	}

	public String getRead() {
		return name;
	}

	public void setRead(String read) {
		System.out.println("ʱ���ʷ");
	}

	public int getCharacter() {
		return character;
	}

	public void setCharacter(int character) {
		System.out.println(100000);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println(75.5);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		System.out.println("ʷ�ٷ�");
	}// ʵ��

	@Override
	public String toString() {
		return "Book [name=" + name + ", character=" + character + ", price="
				+ price + ", author=" + author + "]";
	}
}

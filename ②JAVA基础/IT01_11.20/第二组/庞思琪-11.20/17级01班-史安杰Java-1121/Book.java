package com.zk.qhit.statictest;

public class Book {
	private String name;
	private static int count = 0;
	private int NO;
	private double price;
	public Book(String name, int NO, int price) {
		count++;
		this.name = name;
		this.NO = NO;
		this.price = price;
	}
	
	void getInfo(){
		System.out.println("�鼮��Ϣ��"+"\n"+"������"+getName()+"\n"+"�۸�"+getPrice());
	}
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

}

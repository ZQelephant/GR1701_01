package com.zk.qhit.statictest;

public class Book {
	
  //˽�еĳ�Ա����
  private String name;
  private String no;
  private int    price;
 //������
  private static int count=0;
 public Book() {
	count++;
	no="L"+count;
}
 public Book(String name, int price) {
	count++;
	no="L"+count;
	this.name = name;
	this.price = price;
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
	this.price = price;
}
public String getNo() {
	return no;
}
public static int getCount() {
	return count;
}
public void getInfo(){
	System.out.println("���"+this.getNo()+"��"+this.getName()+"����ͼ��ݲ���"+Book.getCount());
}
	
	
}


package com.zk.qhit.statictest;

import javax.swing.plaf.nimbus.State;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����8:47:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Book {

	//��Book.java�ഴ���ĸ�˽�г�Ա����������countΪstatic��
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

package com.zk.qhit.statictest;

import java.util.concurrent.CountDownLatch;

/** 
 * @author  ���� E-mail:2421922506@QQ.com
 * @date    ����ʱ�䣺2017��11��20�� ����8:09:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Book {
	private String no;
	private String name;
	private float price;
	private static int count = 0;
	public Book(){
		count++;
		no  = "TPOO" + count;
	}
	public Book( String name,float price){
		count++;
		no  = "TPOO" + count;
		this .name =name;
		this .price =price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public static int getCount() {
		return count;
	}
	public String getNo() {
		return no;
	}
	
	public void getInfo(){
		System.out.println("��ţ� "+this.getNo()+"   ��"+this.getName()+"��  ,ͼ��ݹ��в��飺"+Book.getCount());
	}
	
	
	
	
	
	
	
	
	

}

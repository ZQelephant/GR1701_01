/**
 * 
 */
package com.zk.qhit.statictest;
import java.util.Scanner;

/**
 * @author ���ߣ�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺20 Nov 2017 9:18:01 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Book {
	private static int count=0;
	private String name;
	/**
	 * @param name
	 * @param price
	 */
	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	private double price;
	private String no;
     Book(){
		count++;
	}
	void getinfo(){
		System.out.println("����"+name+"�۸�"+price+"����"+count+no);
	}
	
	
	
	
	
	
	
	
	
	
}

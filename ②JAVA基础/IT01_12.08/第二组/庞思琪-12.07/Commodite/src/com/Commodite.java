package com;
/** 
 * @author  ���� E-mail:271406@163.com
 * @date    ����ʱ�䣺2017��12��7�� ����2:16:04 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Commodite {
	private String id;
	private  String name;
	private  double price;
	private  long number;
	public Commodite(String id, String name, double price, long number) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.number = number;
	}
	public Commodite() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Commodite [id=" + id + ", name=" + name + ", price=" + price
				+ ", number=" + number + "]";
	}
	

}

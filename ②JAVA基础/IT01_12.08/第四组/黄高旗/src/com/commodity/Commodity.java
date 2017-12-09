package com.commodity;
/** 
 * @author  ����: xuyunmeng
 * @date    ����ʱ�䣺2017��12��7�� ����2:15:10 
 * @version 1.0 
 */
public class Commodity {

	private String id;
	private String name;
	private double price;
	private long nubmer;
	
	
	public Commodity() {
		
	}

	public Commodity(String id, String name, double price, long nubmer) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.nubmer = nubmer;
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

	public long getNubmer() {
		return nubmer;
	}

	public void setNubmer(int nubmer) {
		this.nubmer = nubmer;
	}

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", price=" + price
				+ ", nubmer=" + nubmer + "]";
	}
	
	
}

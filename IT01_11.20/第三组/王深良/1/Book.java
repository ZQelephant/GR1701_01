package wangshenliang;

/**
 * @author ���� ������E-mail:793708547@QQ.com
 * @date ����ʱ�䣺2017��11��21�� ����8:19:26
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Book {
	private String name;
	private double price;
	private static int count = 0;
	private int no;

	public Book(String name, double price) {

		no = count;
		this.name = name;
		this.price = price;
		count++;
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

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

	public String getInfo() {
		String Info;
		Info = toString();

		return Info;
	}

}

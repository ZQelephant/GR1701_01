package machao;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����8:31:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Book {
	//����Java Project���̣�����������com.zk.qhit.statictest,
	//�ڰ��д���class ��Book.java�� 
	//a����Book.java�ഴ���ĸ�˽�г�Ա����������countΪstatic�� ��
	//b���ڹ��췽����ʵ��countֵ�ĵ�����ͬʱ��countֵ������΢��ת�丳ֵ������no��
	//c��ʵ�ֳ�Ա����name, price�ķ�װ ��
	//d��Ϊno,count�ṩֻ������ ��   
	//e��getInfo������������鼮�Ļ�����Ϣ ��
	//f����com.tsinghua���´���������TestBook.java ��
	private String name;
	private float price;
	private String type;
	private int pages;
	
	private static int count=0;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public static int NO() {
		return count;
	}
	
	public Book(){
		count++;
	}
	public void getinfo(){
		System.out.println("������"+name+"\n���ͣ�"+type+"\n�۸�"+price+"Ԫ\nҳ����"+pages+"ҳ");
	}
}


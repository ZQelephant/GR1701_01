package xcs;

public class Student {
	//ʵ���� JavaBean ����������Ϣ
	//1����Ա��������Ա���ԣ�˽��
	
	private String name;
	private String id;
	private double yuwen;
	private double shuxue;
	private double yingyu;
	private double sum;
	//2��Ҫ���вκ��޲εĹ��췽��    �ܷ�buxuy
	private void student() {
		// TODO Auto-generated method stub

	}

	public Student() {
		super();
		this.name = name;
		this.id = id;
		this.yuwen = yuwen;
		this.shuxue = shuxue;
		this.yingyu = yingyu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getYuwen() {
		return yuwen;
	}

	public void setYuwen(double yuwen) {
		this.yuwen = yuwen;
	}

	public double getShuxue() {
		return shuxue;
	}

	public void setShuxue(double shuxue) {
		this.shuxue = shuxue;
	}

	public double getYingyu() {
		return yingyu;
	}

	public void setYingyu(double yingyu) {
		this.yingyu = yingyu;
	}

	public double getSum() {
		
		 double Sum = yuwen+shuxue+yingyu;
		return Sum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", yuwen=" + yuwen
				+ ", shuxue=" + shuxue + ", yingyu=" + yingyu + ", sum=" + getSum() 
				+ "]";
	}
	

}

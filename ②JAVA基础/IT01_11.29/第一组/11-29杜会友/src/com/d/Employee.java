package com.d;

import sun.print.resources.serviceui;

public class Employee {
	private String id;
	private String name;
	private Double quarters;
	private String compensation;
	private String hiredate;
	//�ṩ��ʼֵ ����鷽����
	public Employee(String id, String name, Double quarters,
			String compensation, String hiredate) {
		this.id = id;
		this.name = name;
		this.quarters = quarters;
		this.compensation = compensation;
		this.hiredate = hiredate;
	}
	//�ṩset ��get ���� ���ڷã������飬��
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

	public Double getQuarters() {
		return quarters;
	}

	public void setQuarters(Double quarters) {
		this.quarters = quarters;
	}

	public String getCompensation() {
		return compensation;
	}

	public void setCompensation(String compensation) {
		this.compensation = compensation;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	//�ṩ�вη���
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", quarters="
				+ quarters + ", compensation=" + compensation + ", hiredate="
				+ hiredate + "]";
	}

}

package com.employee;

public class Employee {

	private String id;
	private String name;
	private double pay;
	private String date;
	private String department;
	
	public Employee(String id, String name, double pay, String date,
			String department) {
		this.id = id;
		this.name = name;
		this.pay = pay;
		this.date = date;
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPay() {
		return pay;
	}

	public String getDate() {
		return date;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "���:" + id + "����:" + name + "нˮ:" + pay
				+ "��ְ����:" + date + "����:" + department;
	}
	
	
}

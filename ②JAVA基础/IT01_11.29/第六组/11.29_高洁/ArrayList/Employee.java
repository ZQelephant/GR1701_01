package com.gaojie.qhit01;

/**
 * ���ߣ��߽� E-mail:740997177@qq.com �绰:17630520503
 * 
 * ����ʱ�䣺2017��11��29�� ����3:51:15
 */
public class Employee {
	private String number;
	private String name;
	private String salary;
	private String entryTime;
	private String department;

	public Employee(String number, String name, String salary,
			String entryTime, String department) {
		super();
		this.number = number;
		this.name = name;
		this.salary = salary;
		this.entryTime = entryTime;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", salary="
				+ salary + ", entryTime=" + entryTime + ", department="
				+ department + "]";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}

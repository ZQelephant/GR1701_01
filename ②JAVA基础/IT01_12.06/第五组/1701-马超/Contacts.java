package machao;


package com.adress;

public class Contacts {

	private String name;
	private String sex;
	private String telnum;
	
	public Contacts(String name, String sex, String telnum) {
		this.name = name;
		this.sex = sex;
		this.telnum = telnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelnum() {
		return telnum;
	}

	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}

	@Override
	public String toString() {
		return "����:" + name + ",�Ա�:" + sex + ",�绰����:" + telnum
				+ ".";
	}
	
	
}

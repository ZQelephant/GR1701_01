package com.gzz;

import java.util.Iterator;

/**
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
/*
 * String s = sc.next();
		String []a =s.split(",");
		if (a.length!=3) {
			System.out.println("���������Ϣ��ʽ���������������룬��ʽ:��xx����/Ů��158****5478������");
		} else {
			Contacts contacts =new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}	
		
 */
/*
 * //1.
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			System.out.println(contacts.toString());
		}
		//2.
		for (Contacts contacts : arrayList) {
			System.out.println(contacts.toString());
		}
		//3.
		Iterator<Contacts> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Contacts contacts = (Contacts) iterator.next();
			System.out.println(contacts.toString());
		}
 */
/*
 * Contacts contact_1 = new Contacts();
		boolean isHas = false;
		for (Contacts contacts : arrayList) {
			String string = contacts.getName();
			if (string.equals(name)) {
				contact_1.setName(contacts.getName());
				contact_1.setSex(contacts.getName());
				contact_1.setTelNum(contacts.getTelNum());
				System.out.println(contacts.toString());
				isHas = true;
			}
		}
		if (!isHas) {
			System.out.println("���޴���");
		}
		return contact_1;
 */
public class Contacts {
	private String name;
	private String sex;
	private String telNum;
					
	/**
	 * 
	 */
	public Contacts() {
		super();
	}

	/**
	 * @param name
	 * @param sex
	 * @param telNum
	 */
	public Contacts(String name, String sex, String telNum) {
		super();
		this.name = name;
		this.sex = sex;
		this.telNum = telNum;
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

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", sex=" + sex + ", telNum=" + telNum
				+ "]";
	}
	
	

}

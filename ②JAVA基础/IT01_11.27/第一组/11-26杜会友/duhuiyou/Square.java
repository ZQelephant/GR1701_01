package com.duhuiyou;

//Ҫ�������ξ��е����԰������߳����ܳ������������˽�У� 
//���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ�߳��Ĺ��췽����
public class Square implements Form {

	@Override
	public Form perimeter() {
		System.out.println(bianchang*4);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Form area() {
		System.out.println(bianchang*bianchang);
		// TODO Auto-generated method stub
		return null;
	}
	
	int bianchang;

	
	public int getBianchang() {
		return bianchang;
	}

	public void setBianchang(int bianchang) {
		this.bianchang = 1;
	}

	/**
	 * @param bianchang
	 */
	public Square(int bianchang) {
		this.bianchang = bianchang;
	}

	@Override
	public String toString() {
		return "Square [bianchang=" + bianchang + "]";
	}
	
}

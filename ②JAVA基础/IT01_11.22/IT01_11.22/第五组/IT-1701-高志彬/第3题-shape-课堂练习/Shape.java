package com.shape;
/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��22�� ����11:09:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public abstract class Shape {
	
	
	//����
	int side;
	double angle;
	double area;

	//����
	public abstract double getArea();

	@Override
	public String toString() {
		return "Shape [side=" + side + ", angle=" + angle + ", area=" + area
				+ "]";
	}
	
}

package com.zk.qhit.Exercises09;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��16�� ����7:40:46
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Cat {
	
	
	
	
	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getEarstyle() {
		return Earstyle;
	}

	public void setEarstyle(String earstyle) {
		Earstyle = earstyle;
	}

	String eyeColor;
	// ������ʽ��״̬
	String Earstyle;
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void CatchMouse() {
		System.out.println("��ϲ��ץ����");
	}

	void playgames() {
		System.out.println("��ϲ������ϲ������һ���档");
	}

	public void eat(String food) {
		// super.eat(food);
		System.out.println("��ϲ����è����");
	}
	

}

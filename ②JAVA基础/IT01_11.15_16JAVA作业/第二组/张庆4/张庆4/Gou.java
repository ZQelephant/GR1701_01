package zhangqing;

public class Gou {
	String color;
	int age;
	int leg;
	String type;
	int speed;
	/**
	 * @param color
	 * @param age
	 * @param leg
	 * @param type
	 * @param speed
	 */
	
	public Gou(String color, int age, int leg, String type, int speed) {
		super();
		this.color = color;
		this.age = age;
		this.leg = leg;
		this.type = type;
		this.speed = speed;
		System.out.println("�Եķ���:�����");
		
	}
	

	
	
	void xiaogou(){
		System.out.println("��ɫ:"+color+"\n����:"+age+"\n�ȵ�����:"+leg+"\n����:"+type+"\n�ٶ�:"+speed);
	}

	
}
package sleuth;

public class Sleuth {

	String variety;
	String colour;
	float weight;
	int age;
	String EYES;
	int number;
	int speed;
	public Sleuth(String variety, String colour, float weight, int age,
			String eYES, int number, int speed) {
		super();
		this.variety = variety;
		this.colour = colour;
		this.weight = weight;
		this.age = age;
		EYES = eYES;
		this.number = number;
		this.speed = speed;
	}
	void info(){
		System.out.println("Ʒ���ǣ�"+variety+"\n"
				+ "ë����ɫ�ǣ�"+colour+"\n"
				+"�����ǣ�"+weight+"kg"+"\n"
				+"�����ǣ�"+age+"��"+"\n"
				+ "�۾���ɫ�ǣ�"+EYES+"\n"
				+ "�ȵ�������:"+number+"\n"
				+ "���ʱ����:"+ speed + "km" + "\n");
	}

}

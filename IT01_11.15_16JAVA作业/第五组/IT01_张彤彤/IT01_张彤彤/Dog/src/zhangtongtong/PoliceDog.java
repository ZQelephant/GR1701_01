package zhangtongtong;

public class PoliceDog extends Dog {

	//����
	double speed;
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	void work(){
		System.out.println("����Ч�ʸ�");
		System.out.println("�ٶȣ�"+speed+"km/h");
		
	}
	public PoliceDog(String breed,String color,int age,double wight,double speed){
		super();
		this.speed = 30.0;
	}
}

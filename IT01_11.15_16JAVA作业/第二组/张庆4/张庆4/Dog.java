package zhangqing;

public class Dog {

	//����
	String  breed;
	String  color;
	int     year;
	long    weight;
	
	//���췽�����вΣ�
	
	 Dog(String breeds, String colors, int years, int weights) {
		 super();
		 this.breed = breeds;
		 this.color = colors;
		this.year = years;
		this.weight = weights;
		
	}
	
 
	

	public Dog(String string, int i) {
		// TODO Auto-generated constructor stub
	}




	//����	
	void eat(){
		System.out.println("Ʒ�֣�"+breed+"\n��ɫ��"+color+"\n���䣺"+year+"\n����:"+weight);
		System.out.println("��"+"\n��"+"\n˯��");
	}
	
	
}

package Aanddog;

public class Dog {
	// ����һ���ࣺ�������԰�����
	//Ʒ�֣�ë����ɫ�� ���䣬���� 
	//�����������С��ԡ�˯��
    //Ҫ������˽�У����ṩget��set���� 
	private  String breed;
	private  String  color;
	private    int year;
	private  int weight;
	 void print_info(){}
			//���췽�����вΣ�
		
		 Dog(String breeds, String colors, int years, int weights) {
			 super();
			 this.breed = breeds;
			 this.color = colors;
			this.year = years;
			this.weight = weights;
			
		}
	 
	 
		

		public Dog(String string, int i) {
			
		}




		//����	
		void eat(){
			System.out.println("Ʒ�֣�"+breed+"\n��ɫ��"+color+"\n���䣺"+year+"\n����:"+weight);
			System.out.println("��"+"\n��"+"\n˯��");
		
		
		
		
		 
	 } 
	
}


package liuyancong;

public class Computer {
	String sort;
	String brand;
	String type;
	int price;
	String CPU;
	int RAM;
	int disk;
	int SSD;
	
	void computer(){
		  System.out.println("�������ͣ�\t"+sort+"\n"
							+"����Ʒ�ƣ�\t"+brand+"\n"
							+"�����ͺţ�\t"+type+"\n"
							+"���Լ۸�\t"+price+"Ԫ\n"
							+"CPU�ͺţ�\t"+CPU+"\n"
							+"�����ڴ棺\t"+RAM+"G"+"\n"
							+"Ӳ�̣�\t\t"+disk+"G"+"\n"
							+"��̬Ӳ�̣�\t"+SSD+"G");
	}
	
}

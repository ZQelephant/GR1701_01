package liuyancong;

/*���ߣ�������
       ���䣺15539919713@163.com
 */
public class Cat extends Animal{
	
	public Cat(String name, String color, float weight) {
		super(name, color, weight);
	}

	
	String eyescolor;
	
	void run(){
		System.out.print("���ܱ�����");
		super.run();
	}
	
	void play(){
		System.out.println("ϲ����ɳ������ë���򣡣�");
	}
	
	void catchmouse(){
		System.out.println("��ץ���󣡣�");
	}
}
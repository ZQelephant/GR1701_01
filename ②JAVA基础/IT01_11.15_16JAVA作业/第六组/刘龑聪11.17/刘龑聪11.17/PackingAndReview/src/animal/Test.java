package animal;

public class Test {
	public static void main(String[] args) {
		
		PoliceDogs policdog = new PoliceDogs();
		
		policdog.setVarieties("������Ȯ");
		policdog.setHaircolor("��");
		policdog.setAge(9);
		policdog.setWeight(51.0);
		policdog.eyescolor="��ͭ";
		policdog.legs=4;
		policdog.maxspeed=12;
		
		policdog.dog();
		policdog.maxspeed();
		policdog.eating("����ô��ʳ��");
		policdog.working("ƾ�����Ѱ�ҷ��˺�Υ��Ʒ��");
	}
}

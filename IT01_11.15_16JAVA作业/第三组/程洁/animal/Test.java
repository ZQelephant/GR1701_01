package animal;

public class Test {
	public static void main(String[] args) {
		
		PoliceDogs policdog = new PoliceDogs();
		
		policdog.setVarieties("�߼���Ȯ");
		policdog.setHaircolor("��");
		policdog.setAge(9);
		policdog.setWeight(60.0);
		policdog.eyescolor="��ɫ";
		policdog.legs=4;
		policdog.maxspeed=15;
		
		policdog.dog();
		policdog.maxspeed();
		policdog.eating("����ʳ��");
		policdog.working("ƾ�豾�� ��������");
	}
}
